package pbo8;


public class Kalimantan extends Human{

    String nama,suku,kelamin,adat,kulit;
    void daerah(){
        System.out.println("Kalimantan");
    }
    @Override
    void nama(){
       System.out.print("Masukan Nama Anda :");
       nama = input.next();
    }
    @Override
    void suku(){
       System.out.print("Masukan Ras Suku : ");
       suku = input.next();
   }
    @Override
   protected void jnskelamin(){
       System.out.print("Jenis Kelamin : ");
       kelamin = input.next();
   }
   @Override
   void adat(){
       System.out.print("Adat daerah Anda : ");
       adat = input.next();
   }
   @Override
   void kulit(){
       System.out.print("Warna Kulit : ");
       kulit = input.next();
   }
}
