import java.util.Scanner;

public class BukuTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan judul: ");
        String judul = in.nextLine();
        System.out.println("Inputkan penggarang: ");
        String pengarang = in.nextLine();
        System.out.println("Inputkan id buku");
        int id = in.nextInt();
        System.out.println("Imputkan tahun terbit: ");
        int Tahunterbit = in.nextInt(); 
       
        //object
       Buku Bulan  = new Buku(123,"Bulan","Jia",2002);
       Buku Langit = new Buku(345,"Langit","Lian",2012);
       Buku Pluto = new Buku(567,"Pluto","Javi",2009);
       Buku Saku = new Buku(789,"Saku","Den",2016);
       Buku Laut = new Buku(986,"Laut","Vier",2006);

       /*Bulan.id = 123;
       Bulan.judul = "Bulan";
       Bulan.Pengarang = "Jia";
       Bulan.Tahunterbit = 2002;
       
       Langit.id = 345;
       Langit.judul = "Langit";
       Langit.Pengarang = "Lian";
       Langit.Tahunterbit = 2012;

       Pluto.id = 567;
       Pluto.judul = "Pluto";
       Pluto.Pengarang = "Javi";
       Pluto.Tahunterbit = 2009;

       Saku.id = 789;
       Saku.judul = "Saku";
       Saku.Pengarang = "Den";
       Saku.Tahunterbit = 2016;

       Laut.id = 986;
       Laut.judul = "Laut";
       Laut.Pengarang = "Vier";
       Laut.Tahunterbit = 2006;*/ 

       Buku bulan= new Buku(id,judul,pengarang,Tahunterbit);
       System.out.println(Bulan.id);
       System.out.println(Bulan.judul);
       System.out.println(Bulan.Pengarang);
       System.out.println(Bulan.Tahunterbit);
       
       Buku langit = new Buku(id,judul,pengarang,Tahunterbit);
       System.out.println(Langit.id);
       System.out.println(Langit.judul);
       System.out.println(Langit.Pengarang);
       System.out.println(Langit.Tahunterbit);
       
       Buku pluto = new Buku(id,judul,pengarang,Tahunterbit);
       System.out.println(Pluto.id);
       System.out.println(Pluto.judul);
       System.out.println(Pluto.Pengarang);
       System.out.println(Pluto.Tahunterbit);
       
       Buku saku = new Buku(id,judul,pengarang,Tahunterbit);
       System.out.println(Saku.id);
       System.out.println(Saku.judul);
       System.out.println(Saku.Pengarang);
       System.out.println(Saku.Tahunterbit);
       
       Buku laut = new Buku(id,judul,pengarang,Tahunterbit); 
       System.out.println(Laut.id);
       System.out.println(Laut.judul);
       System.out.println(Laut.Pengarang);
       System.out.println(Laut.Tahunterbit);

       in.close();
              
    }
}