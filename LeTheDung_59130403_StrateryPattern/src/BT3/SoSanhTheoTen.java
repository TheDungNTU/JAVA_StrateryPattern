
package BT3;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        if ((o1.getHoTen().compareTo(o2.getHoTen())) > 0) return 1;
        else if ((o1.getHoTen().compareTo(o2.getHoTen())) < 0) return -1;
        return 0;
    }   
}
