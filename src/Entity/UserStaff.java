package Entity;

import java.util.ArrayList;

public class UserStaff {
    private String nama;
    private String username;
    private String password;
    private String email;
    public ArrayList<UserStaff> user=new ArrayList<>();
    public UserStaff(String nama, String username, String email, String password){
        this.email=email;
        this.nama=nama;
        this.username=username;
        this.password=password;
    }
    public String getNama() {
        return nama;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

    public void output(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Username: "+this.username);
    }

}
