
package BT2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void themHangHoa(HangHoa hh){
        dshh.add(hh);
    }
    
    public int tinhTienHang(){
        int S = 0;
        for (int i=0; i<dshh.size(); i++){
            S = S + dshh.get(i).getGia();
        }
        return S;
    }
    
    public double tinhTienKhachTra(){
        return hinhThucTT.thanhToan(tinhTienHang());
    }
    
    public void hienthi(){
         for (int i=0; i<dshh.size(); i++){
            System.out.println("Hàng hóa thứ " + (i+1));
            dshh.get(i).hienThi();
        }
    }
}
