
package pbo8;

import java.util.*;
public class Human {
    Scanner input = new Scanner(System.in);
    void nama(){
       System.out.print("Masukan Nama Anda :");
       String nama = input.next();
    }
    void suku(){
       System.out.print("Masukan Ras Suku : ");
       String suku = input.next();
   }
   void jnskelamin(){
       System.out.print("Jenis Kelamin : ");
       String kelamin = input.next();
   }
   void adat(){
       System.out.print("Adat daerah Anda : ");
       String adat = input.next();
   }
   void kulit(){
       System.out.print("Warna Kulit : ");
       String kulit = input.next();
   }
}
