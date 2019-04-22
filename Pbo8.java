package pbo8;
import java.util.*;
public class Pbo8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sumatra lokal = new Sumatra();
        Jawa pulau = new Jawa();
        Kalimantan sawit = new Kalimantan();
        int pilihan;
        System.out.println("Pilihan Daerah ");
        System.out.println("1. Pulau Sumatra");
        System.out.println("2. Pulau Jawa");
        System.out.println("3. Pulau Kalimantan");
        System.out.print("Pilihan Anda :");
        pilihan = input.nextInt();
        
        if (pilihan==1){
        lokal.daerah();
        lokal.nama();
        lokal.adat();
        lokal.jnskelamin();
        lokal.kulit();
        lokal.suku();
        System.out.println("============================");
        System.out.println("Format Data Warga Sumatra");
        System.out.println("Nama : "+lokal.nama );
        System.out.println("Adat : "+lokal.adat);
        System.out.println("Jenis Kelamin :"+lokal.kelamin);
        System.out.println("Kulit :"+lokal.kulit);
        System.out.println("Suku :"+lokal.suku);
        }

        else if(pilihan==2){
        pulau.daerah();
        pulau.nama();
        pulau.adat();
        pulau.jnskelamin();
        pulau.kulit();
        pulau.suku();
        System.out.println("============================");
        System.out.println("Format Data Warga Jawa");
        System.out.println("Nama : "+pulau.nama );
        System.out.println("Adat : "+pulau.adat);
        System.out.println("Jenis Kelamin :"+pulau.kelamin);
        System.out.println("Kulit :"+pulau.kulit);
        System.out.println("Suku :"+pulau.suku);
        }

        else if(pilihan==3){
        sawit.daerah();
        sawit.nama();
        sawit.adat();
        sawit.jnskelamin();
        sawit.kulit();
        sawit.suku();
        System.out.println("============================");
        System.out.println("Format Data Warga Kalimantan");
        System.out.println("Nama : "+sawit.nama );
        System.out.println("Adat : "+sawit.adat);
        System.out.println("Jenis Kelamin :"+sawit.kelamin);
        System.out.println("Kulit :"+sawit.kulit);
        System.out.println("Suku :"+sawit.suku);
        }
        
    }
}
