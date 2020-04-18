
package BT3;

import java.util.ArrayList;
import java.util.Collections;


public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dssv = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSV(SinhVien sv){
        dssv.add(sv);
    }
    
    public void sapXep(){
        for (int i=0; i<dssv.size()-1; i++){
            for (int j=i+1; j<dssv.size(); j++){
                if(soSanh.SoSanh(dssv.get(i),dssv.get(j))==1){
                    Collections.swap(dssv, i, j); 
  
                }
                
            }
        }
    }

    public void inDS(){
        for (int i=0; i<dssv.size(); i++){
            System.out.println("Sinh viên thứ " + (i+1));
            dssv.get(i).hienThi();
        }
    }
    
    
}
