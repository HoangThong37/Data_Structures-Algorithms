package Linked_List_Danh_sach_lien_ket;

    interface testInterface {
        //hàm abstract
        void tinhDientich();
        //hàm default
        default void xuat(){
            System.out.println("Day la mot tu giac.");
        }
    }
//    abstract class hinhvuong implements testInterface {
//
//    }
//        public void tinhDientich() {
//            int dientich = canh*canh;
//            System.out.println("Dien tich hinh vuong = " + dientich);
//        }
//
//        @Override
//        public void xuat() {
//            System.out.println("Day la hinh vuong.");
//        }
//    }
//    class HinhChuNhat implements testInterface{
//        int dai = 7;
//        int rong = 5;
//        @Override
//        public void tinhDientich() {
//            int dientich = dai*rong;
//            System.out.println("Dien tich hinh chu nhat = " + dientich);
//        }
//    }
//    public class Main {
//        public static void main(String[] args) {
//            HinhVuong hv1 = new HinhVuong();
//            hv1.tinhDientich();
//            hv1.xuat();
//            HinhChuNhat hcn1 = new HinhChuNhat();
//            hcn1.tinhDientich();
//            hcn1.xuat();
//        }
//    }
