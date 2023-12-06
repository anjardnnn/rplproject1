package datapegawai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataPegawai {
    public static void main(String[] args) {
   List<datapegawaibaru> daftarkaryawan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Absensi Data Karyawan  (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
                        
            System.out.print("Idcard: ");
            int idcard = input.nextInt();
            input.nextLine();
            
            System.out.print("Jabatan: ");
            String jabatan = input.nextLine();
            
            System.out.print("Shift: ");
            String shift = input.nextLine();
            

            datapegawaibaru karyawan = new datapegawaibaru(nama,jabatan, shift, idcard);
            daftarkaryawan.add(karyawan);
        }
        System.out.println("Daftar karyawan:");
        for (datapegawaibaru karyawan : daftarkaryawan){
            System.out.println(karyawan);
           
        }
    }
}