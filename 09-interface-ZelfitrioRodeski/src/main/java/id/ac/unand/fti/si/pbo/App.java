package id.ac.unand.fti.si.pbo;

public class App {

    public static void main(String[] args) {

        // Membuat objek
        Member membersilver1 = new MemberSilver();
        Member memberreguler1 = new MemberReguler();
        Member memberplatinum1 = new MemberPlatinum();
        Member membergold1 = new MemberGold();
   
   int totalbayarmembersilver = membersilver1.hitungTotalBayar(1000000); 
   int totalbayarmemberreguler = memberreguler1.hitungTotalBayar(1000000); 
   int totalbayarmemberplatinum = memberplatinum1.hitungTotalBayar(1000000); 
   int totalbayarmembergold = membergold1.hitungTotalBayar(1000000); 

   System.out.println ("total ongkir member silver: " + totalbayarmembersilver);
   System.out.println ("total ongkir member reguler: " + totalbayarmemberreguler);
   System.out.println ("total ongkir member platinum: " + totalbayarmemberplatinum);
   System.out.println ("total ongkir member gold: " + totalbayarmembergold);
}
}
