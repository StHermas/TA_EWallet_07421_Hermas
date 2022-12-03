package com.pbohermas;
import Entity.*;
import Model.*;
import java.util.Scanner;

public class ewallet {
    public static void main(String[] args) {
        boolean aut=false;
        Order order=new Order();
        Authentication auth=new Authentication();
        Scanner sc=new Scanner(System.in);
        do {
            menu:
            System.out.println("Selamat datang di Ewallet!");
            int pil;
            System.out.println("1. Login\n2. Register");
            pil = sc.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Masukkan Username");
                    String username = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Masukkan Password");
                    String password = sc.nextLine();
                    boolean au = auth.logUser(username, password);
                    if (au !=false) {
                        System.out.println("Login Berhasil!!");
                        aut=true;
                    } else {
                        System.out.println("Login gagal!!!");
                    }
                    break;
                case 2:
                    System.out.println("REGISTER");
                    System.out.println("Masukkan nama: ");
                    sc.nextLine();
                    String nama=sc.nextLine();
                    System.out.println("Masukkan Username: ");
                    username= sc.nextLine();
                    System.out.println("Masukaan Password: ");
                    password=sc.nextLine();
                    System.out.println("masukkan Email: ");
                    String email=sc.nextLine();
                    auth.regUser(new UserStaff(nama, username, email, password));
                    break;
            }
        }while(!aut);
        int pil2 = 0;
        do{
            if (aut==true){
                System.out.println("Ingin apa?");
                System.out.println("1. Pulsa\n2. Top UP\n3. Histori Pembelian\n4. Pengaturan Akun\n5. Exit");
                pil2= sc.nextInt();
                switch (pil2){
                    case 1:
                        System.out.println("Masukkan No. Telp");
                        String noTelp=sc.nextLine();
                        sc.nextLine();
                        System.out.println("Masukkan Jenis Pulsa");
                        String jPulsa=sc.nextLine();
                        System.out.println("Masukkan Nominal");
                        int nominal=sc.nextInt();
                        order.tambahOrderPulsa(new Pulsa(jPulsa, nominal, noTelp));
                        System.out.println("SUKSES");
                        break;
                    case 2:
                        System.out.println("Masukkan No. Telp");
                        String noTelp1=sc.nextLine();
                        sc.nextLine();
                        System.out.println("Masukkan Jenis Pulsa");
                        String ewallet=sc.nextLine();
                        System.out.println("Masukkan Nominal");
                        int nominal1=sc.nextInt();
                        order.tambahOrderEwallet(new Merchant(ewallet, nominal1, noTelp1));
                        System.out.println("SUKSES");
                        break;
                    case 3:
                        System.out.println("HISTORY");
                        int i=order.tampilHistoryMerchant();
                        int k= order.tampilHistoryPulsa();
                        if(i==1||k==1){
                            System.out.println("Histori Penmbelian Kosong!");
                        }
                        else{
                            order.tampilHistoryMerchant();
                            order.tampilHistoryPulsa();
                        }
                        break;
                    case 4:
                        System.out.println("1. Ganti Password");
                        System.out.println("2. Lihat Profil");
                        int pil3=sc.nextInt();
                        if(pil3==1){
                            System.out.println("Masukkan Username");
                            String username3= sc.nextLine();
                            sc.nextLine();
                            System.out.println("Masukkan Password baru");
                            String password3= sc.nextLine();
                            auth.updateUser(username3, password3);
                        }
                        else{
                            auth.tampilStaff();
                        }
                        break;
                    case 5:

                }
            }
        }while(pil2<=5);
    }
}
