
package BT2;

public class BT2_Main {

    public static void main(String[] args) {
       GioHang GH1 = new GioHang();
       GioHang GH2 = new GioHang();
       
       GH1.setHinhThucTT(new ThanhToanOnline());
       GH2.setHinhThucTT(new ThanhToanCOD());
       
       HangHoa HH1 = new HangHoa("Cà chua",50000,"Đây là cà chua");
       HangHoa HH2 = new HangHoa("Dưa hấu",100000,"Đây là dưa hấu");
       HangHoa HH3 = new HangHoa("Thịt bò",180000,"Đây là thịt bò");
       HangHoa HH4 = new HangHoa("Thịt heo",150000,"Đây là thị heo");
       
       GH1.themHangHoa(HH1);
       GH1.themHangHoa(HH2);
       GH1.themHangHoa(HH3);
       GH1.themHangHoa(HH4);
       
       GH2.themHangHoa(HH1);
       GH2.themHangHoa(HH2);
       GH2.themHangHoa(HH3);
       GH2.themHangHoa(HH4);
       
       System.out.println("\nDanh sách hàng hóa của giỏ hàng 1(online)");
       GH1.hienthi();
       System.out.println("Giỏ hàng 1: tổng tiền hàng: " + GH1.tinhTienHang() + " Tiền khách trả: "+GH1.tinhTienKhachTra());

       System.out.println("\nDanh sách hàng hóa của giỏ hàng 2(COD)");
       GH2.hienthi();
       System.out.println("Giỏ hàng 2: tổng tiền hàng: " + GH2.tinhTienHang() + " Tiền khách trả: "+GH2.tinhTienKhachTra());
    }
    
}
