/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;
import java.util.Scanner; 
import java.util.ArrayList;
/**
 *
 * @author user
 */         
public class Tugas2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();
        
        System.out.println("Muh Akbar Saputra S Dawing");
        System.out.println("2024230026 || ST303 || Pemrograman Berorientasi Objek");
        
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();

        System.out.println("--------------------------------");
        System.out.println("Tugas No 1 || Operator Ternary");
        System.out.println("--------------------------------");
        
        // Tugas No 1
        // Operator Ternary
        boolean suka = true;
        String jawaban;
        
        // Menggunakan Operator Ternary
        jawaban = suka ? "Iya" : "Tidak";
        
        // Menampilkan Jawaban
        System.out.println("Jawaban : " + jawaban);
        
        
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("----------------------------");
        System.out.println("Tugas No 2 || Counted Loop");
        System.out.println("----------------------------");

        // Tugas No 2
        // Counted Loop 
        for (int a = 0; a <=10; a++) {
            System.out.println("Halo Semua - a : "+a);
        }
         System.out.println();
         System.out.println("====================================================================");
         System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        
        System.out.println("------------------------------");
        System.out.println("Tugas No 3 || Uncounted Loop");
        System.out.println("------------------------------");

        // Tugas No 3
        // Uncounted Loop
        int i = 0;
        
        while ( i <= 10 ){
            // Blok kode yang akan di ulang
            System.out.println("Perulangan Ke-"+ i);
            
            // Increment nilai i
            i++; // Menambah Nilai Variabel + 1
            
        }
        
          System.out.println();
          System.out.println("====================================================================");
          System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       

        // Tugas No 4
        /** Tugas Di Rumah
        1.Deskripsi: Buatlah program Java yang menghitung jumlah semua bilangan
          genap dari 1 hingga n, di mana n diinput oleh pengguna.
          Contoh:
            • Input: 10
            • Output: Jumlah bilangan genap dari 1 hingga 10 adalah 30

        2. Deskripsi: Buatlah program Java yang mencetak pola segitiga bintang
           berdasarkan tinggi yang dimasukkan oleh pengguna.
           Contoh:
             • Input: 5
             • Output: */
        
        System.out.println("--------------------------------------");
        System.out.println("Tugas No 4 || Tugas Modul 4 BAGIAN 1");
        System.out.println("--------------------------------------");
          
        // Bagian 1
        
        System.out.print("Masukkan Nilai n : ");
        int n = input.nextInt();
        
        int jumlah = 0;
        
        for (int in = 1; in <= n; in++) {
            if (in % 2 == 0) {  // Cek bilangan genap
                jumlah += in;
            }
        }
        
        System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah " + jumlah);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("--------------------------------------");
        System.out.println("Tugas No 4 || Tugas Modul 4 BAGIAN 2");
        System.out.println("--------------------------------------");
       
        // Bagian 2       
        System.out.print("Masukkan tinggi segitiga: ");
        int masukkan = input.nextInt();
        
            System.out.println(); // BARIS BARU HANYA UNTUK KERAPIAN  
            
        for (int baris = 1; baris <= masukkan; baris++){
            
            for (int spasi = 1; spasi <= masukkan - baris; spasi++) {
                System.out.print(" ");
            }
                
            for (int bintang = 1; bintang <= (2 * baris - 1); bintang++) {
                System.out.print("*");
            }
            
            System.out.println(); // BARIS BARU HANYA UNTUK KERAPIAN
          
                    
        }
        
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////              
        
        System.out.println("---------------------");
        System.out.println("Tugas No 5 || Array");
        System.out.println("---------------------");


        // Tugas No 5
        // Array
        String namaTeman[] = {"Akbar", "Abyan", "Thoriq", "Bagas", "Basya"};
            System.out.println("Nama : " + namaTeman[0]);
            /** Output yang akan keluar adalah "Akbar" Karena perhitungan index di mulai dari 0
             * sehingga 0 adalah akbar, 1 adalah abyan, 2 adalah thoriq, Dan Seterusnya
             */
        
        System.out.println();
        System.out.println("====================================================================");
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         
        
        System.out.println("-----------------------------");
        System.out.println("Tugas No 6 || Tugas Modul 5");
        System.out.println("-----------------------------");
        
        // Tugas No 6
        /** Tugas Tambahan :
        Silahkan cari masing – masing 1 contoh script koding yang menerapkan Array
        multidimensi dan list. Kemudian praktekkan pada device masing2. Beri nama projek
        “nama_array” kemudian kumpul semua dalam 1 file pdf (script tidak perlu tulis
        tangan)
        *Note : Script koding tidak boleh sama / mirip, 1 mahasiswa dengan mahasiswa lain */
        
        System.out.println("Program: Daftar Nilai Mata Kuliah (ArrayList)");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        input.nextLine(); // buang newline

        ArrayList<String> matkul = new ArrayList<>();
        ArrayList<Integer> nilaiList = new ArrayList<>();

        for (int idx = 0; idx < jumlahMatkul; idx++) {
            System.out.print("Nama mata kuliah ke-" + (idx + 1) + ": ");
            String namaMatkul = input.nextLine();
            matkul.add(namaMatkul);

            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine(); // buang newline
            nilaiList.add(nilai);
        }

        // Tampilkan daftar nilai
        System.out.println();
        System.out.println("===== DAFTAR NILAI =====");
        for (int idx = 0; idx < matkul.size(); idx++) {
            System.out.println((idx + 1) + ". " + matkul.get(idx) + " : " + nilaiList.get(idx));
        }

        // Hitung max, min, rata-rata
        if (!nilaiList.isEmpty()) {
            int max = nilaiList.get(0);
            int min = nilaiList.get(0);
            int total = 0;
            for (int v : nilaiList) {
                if (v > max) max = v;
                if (v < min) min = v;
                total += v;
            }
            double rata = (double) total / nilaiList.size();

            System.out.println();
            System.out.println("===== HASIL PERHITUNGAN =====");
            System.out.println("Nilai Tertinggi : " + max);
            System.out.println("Nilai Terendah  : " + min);
            System.out.println("Rata-rata       : " + String.format("%.2f", rata));
        } else {
            System.out.println("Belum ada nilai yang dimasukkan.");
        }

        // Tutup Scanner
        input.close();
        
        
        
        
}
    
}   


