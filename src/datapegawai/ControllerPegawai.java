package datapegawai;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPegawai {
 ArrayList<datapegawaibaru> ArrayData;
 DefaultTableModel tablelist;
 
 public ControllerPegawai(){
     ArrayData = new ArrayList<>();
 }
 public void InsertData (String nama, String jabatan, String shift ,int idcard){
     datapegawaibaru mhs = new datapegawaibaru(nama,jabatan,shift,idcard);
     ArrayData.add(mhs);    
 }
public DefaultTableModel showData(){
    String[] kolom = {"Nama", "Idcard", "Jabatan" ,"Shiftku"};
    Object[][] objData = new Object [ArrayData.size()][3];
    int i = 0;
    
    for (datapegawaibaru n : ArrayData){
        String[] arrData = {n.getNama(),String.valueOf(n.idcard), n.getJabatan(), n.getShift()};
        objData[i] = arrData;
        i++;
    }
    tablelist = new DefaultTableModel (objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;   
    }       
};
    return tablelist;
}
}