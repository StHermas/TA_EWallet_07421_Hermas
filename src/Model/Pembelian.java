package Model;
import Database.TopUp;
import Database.Ewallet;
import Database.Pulsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public ArrayList<Ewallet> wal=new ArrayList<>();
    public Ewallet wall=new Ewallet();
    public ArrayList<Pulsa> pul=new ArrayList<>();
    public Pulsa puls=new Pulsa();
    public String noTelp;
    public float total, harga, pembelian;
    Scanner sc=new Scanner(System.in);

    public void viewMenuTopup(){
        System.out.println("\n");
        System.out.println("1. Dana");
        System.out.println("2. Shopeepay");
        System.out.println("3. OVO");
        System.out.println("4. LinkAja");
        System.out.println("----------------------");
    }
    public void viewMenuPulsa(){
        System.out.println("1. Indosat");
        System.out.println("2. XL/Axis");
        System.out.println("3. Smartfren");
        System.out.println("4. Telkomsel");

    }
    public void topup(){
        viewMenuTopup();
        int pil=sc.nextInt();

        if(pil==1){
            System.out.println("-Dana-");
            wall.setEwallet("Dana");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            wall.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            wall.setNominal(nominal);

        }else if(pil==2){
            System.out.println("-Shopeepay-");
            wall.setEwallet("Shopeepay");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            wall.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            wall.setNominal(nominal);
        }else if(pil==3) {
            System.out.println("-OVO-");
            wall.setEwallet("Dana");
            System.out.println("Masukkan no. Telp");
            String notelp = sc.nextLine();
            wall.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal = sc.nextInt();
            wall.setNominal(nominal);
        }else if(pil==4){
            System.out.println("-LinkAja-");
            wall.setEwallet("Dana");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            wall.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            wall.setNominal(nominal);

        }

    }
    public void pulsa(){
        viewMenuTopup();
        int pil=sc.nextInt();

        if(pil==1){
            System.out.println("-Indosat-");
            puls.setPulsa("Indosat");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            puls.setPulsa(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            puls.setNominal(nominal);

        }else if(pil==2){
            System.out.println("-XL/Axis-");
            puls.setPulsa("XL/Axis");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            puls.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            puls.setNominal(nominal);
        }else if(pil==3) {
            System.out.println("-Smartfren-");
            puls.setPulsa("smartfren");
            System.out.println("Masukkan no. Telp");
            String notelp = sc.nextLine();
            puls.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal = sc.nextInt();
            puls.setNominal(nominal);
        }else if(pil==4){
            System.out.println("-Telkomsel-");
            wall.setEwallet("Telkomsel");
            System.out.println("Masukkan no. Telp");
            String notelp=sc.nextLine();
            wall.setNotelp(notelp);
            System.out.println("Masukkan Nominal");
            int nominal=sc.nextInt();
            wall.setNominal(nominal);
        }
    }
}
