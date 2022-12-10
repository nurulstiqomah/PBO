package Project;
import java.util.Scanner;
public class Pelayanan extends Loundry{

    public void layanan(){
        Scanner lay = new Scanner(System.in);
        int pilihan;
        char ulang;
        do {
            System.out.println("======Menu Layanan=======");
            System.out.println("1. Cuci Saja/Rp.3000");
            System.out.println("2. Cuci Setrika/Rp.6000");
            System.out.println("3. Cuci Setrika + Lipat/Rp.9000");
            System.out.println();

            System.out.println("Pilihan anda : ");
            pilihan = lay.nextInt();

            switch (pilihan){
                case 1 :
                    System.out.println("Anda memilih cuci saja");
                    break;
                case 2 :
                    System.out.println("anda memilih cuci setrika");
                    break;
                case 3 :
                    System.out.println("anda memilih cuci setrika + lipat");
                    break;

                    default:
                    System.out.println("menu tidak tersedia");
            }
            System.out.println();
            System.out.println("ingin memilih menu lain (y/t)");
            ulang = lay.next().charAt(0);
            System.out.println();
        }
        while (ulang != 't');
        System.out.println("==========================================");

    }

}
