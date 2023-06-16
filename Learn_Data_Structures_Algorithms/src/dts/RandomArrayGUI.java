package dts;

import dts.constant.SystemConstant;
import dts.utils.SortUtils;

import java.util.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RandomArrayGUI extends JFrame implements ActionListener{

    JPanel panel, buttonPanel, textPanel;
    JButton generateBtn, sortBtn;
    JTextField[] textFields;
    JScrollPane scrollPane;
    JList<String> list;

    String[] sortTypes = {SystemConstant.BUBBLE_SORT, SystemConstant.SELECTION_SORT,
                          SystemConstant.INSERTION_SORT, SystemConstant.QUICK_SORT,
                          SystemConstant.MERGE_SORT};

    public RandomArrayGUI() {
        super("Random DTS - Test");
        setSize(SystemConstant.WIDTH, SystemConstant.HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,10,10));
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        buttonPanel.setBorder(BorderFactory.createTitledBorder(loweredetched, "Choose option"));
        generateBtn = new JButton("Random");
        generateBtn.addActionListener(this);
        buttonPanel.add(generateBtn);

        sortBtn = new JButton("Sort Arrays");
        sortBtn.addActionListener(this);

        buttonPanel.add(sortBtn);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(100, 10, 4, 4));
        Border raisedbevel = BorderFactory.createBevelBorder(EtchedBorder.RAISED);
        textPanel.setBorder(BorderFactory.createTitledBorder(raisedbevel, "Random Arrays"));

        textFields = new JTextField[SystemConstant.NUMBER_RANDOM];
        for(int i = 0; i < SystemConstant.NUMBER_RANDOM; i++) {
            textFields[i] = new JTextField();
            textFields[i].setEditable(false);
            textPanel.add(textFields[i]);
        }

        scrollPane = new JScrollPane(textPanel);
        panel.add(scrollPane, BorderLayout.CENTER);

        list = new JList<>(sortTypes); // show option
        Border compound = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createTitledBorder("Option sort"));
        list.setBorder(compound);
        panel.add(list, BorderLayout.EAST);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();  // get event

        if(source == generateBtn) {  //  click random
            Random random = new Random();
            for(int i = 0; i < SystemConstant.NUMBER_RANDOM; i++) {
                int len = random.nextInt(5) + 1;
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < len; j++) {
                    char c = (char) (random.nextInt(26) + 'a'); // tạo kí tự từ a-z
                    if (random.nextInt(2) == 1) { // xac suất 50%, chuyển sang kí tự hoa
                        c = Character.toUpperCase(c);
                    }
                    sb.append(c);
                }
                textFields[i].setText(sb.toString());
            }
        }

        else if(source == sortBtn) { // click sort
            List<String> arrList = new ArrayList<>();

            for(int i = 0; i < SystemConstant.NUMBER_RANDOM; i++) {
                String element = textFields[i].getText();
                if(!element.isEmpty()) {
                    arrList.add(element);
                }
            }
            String[] arr = arrList.toArray(new String[0]);
            String sortType = list.getSelectedValue();


            // check time.
            long startTime, endTime;

            if(sortType.equals(SystemConstant.BUBBLE_SORT)) {
                SortUtils.bubbleSort(arr, arr.length);
            }
            else if(sortType.equals(SystemConstant.SELECTION_SORT)) {
                SortUtils.selectionSort(arr, arr.length);
            }
            else if(sortType.equals(SystemConstant.INSERTION_SORT)) {
                SortUtils.insertionSort(arr, arr.length);
            }
            else if(sortType.equals(SystemConstant.QUICK_SORT)) {
                SortUtils.quickSort(arr, 0, arr.length - 1);
            }
            else if(sortType.equals(SystemConstant.MERGE_SORT)) {
                SortUtils.mergeSort(arr, 0, arr.length - 1);
            }

            for(int i = 0; i < arr.length; i++) {
                textFields[i].setText(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        new RandomArrayGUI();
    }

}