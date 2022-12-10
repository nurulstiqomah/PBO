
import Project.Transaksi;
import java.util.Scanner;
public class Pembayaran extends Transaksi {
    @Override
    public float getTrans() {
       String kartu;
       int loundryan, diskon;
        Scanner scan = new Scanner(System.in);
        System.out.println("apakah ada kartu member :");
        kartu = scan.nextLine();
        System.out.println("total yang harus dibayar :");
        loundryan = scan.nextInt();

        if(kartu.equalsIgnoreCase("ya")){
            if(loundryan > 50000){
                diskon = 5000;
            } else if (loundryan > 30000){
                diskon = 3000;
            } else {
                diskon = 0;
            }
        } else {
           if (loundryan > 100000){
                diskon = 5000;
            } else {
               diskon = 0;
           }
        }
        total = loundryan - diskon;
        System.out.println("Total Bayar : RP"+total);

        return getTrans();
    }
}
