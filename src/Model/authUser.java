package Model;
import Database.*;

import java.util.ArrayList;
import java.util.Scanner;

public class authUser {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> reg= new ArrayList<>();
    ArrayList<User> log = new ArrayList<>();
    User login=new User();
    User regis=new User();
    String nama, email, password, username;
    int u,p;

    public void authUser(){
        regUser();
        loginUser();
    }
    public void regUser(){
        System.out.println("registrasi");
        System.out.println("Nama: ");
        nama=sc.nextLine();
        regis.setNama(nama);
        System.out.println("Email: ");
        email=sc.nextLine();
        regis.setEmail(email);
        System.out.println("Username: ");
        username=sc.nextLine();
        regis.setUsername(username);
        System.out.println("Password: ");
        password=sc.nextLine();
        regis.setPassword(password);
    }
    public void loginUser(){
        System.out.println("Login");
        System.out.println("Username");
        username=sc.nextLine();
        login.setUsername(username);
        System.out.println("Password");
        password=sc.nextLine();
        login.setPassword(password);
        sc.reset();
        log.clear();
        log.add(new User());
        if(login.getUsername().equals(regis.getUsername()));{
            u=2;
        }
        if(login.getPassword().equals(regis.getPassword()));{
            p=2;
        }
        if(u==2||p==2){
            System.out.println("Login Berhasil");
        }
        else{
            System.out.println("Login Gagal");
        }

    }

}
