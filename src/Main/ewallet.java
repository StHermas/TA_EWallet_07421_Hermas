/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Database.*;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ewallet {
    public static Scanner sc = new Scanner(System.in);
    public static Pembelian psn = new Pembelian();
    public static authUser st = new authUser();
   // public static aboutCRUD crud = new aboutCRUD();

    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI KERETA API INDONESIA ");
        System.out.println(" 1. LOGIN");
        System.out.println(" 2. REGISTRASI ");
        System.out.print("Choose => ");
        int pil = sc.nextInt();
        switch(pil){
            case 1 :
                st.loginUser();
                break;
            case 2 :
                st.regUser();

                //menu
               // crud.createCust();
                break;

        }
    }
}
