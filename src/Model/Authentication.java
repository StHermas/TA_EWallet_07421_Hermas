package Model;
import Entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Authentication {
    Scanner sc=new Scanner(System.in);
    public ArrayList<UserStaff> auth=new ArrayList<>();
    public void regUser(UserStaff data){
        auth.add(data);
    }
    public boolean logUser(String username, String password){
        boolean auth1 = false;
        for(int i=0; i<this.auth.size(); i++){
            if(this.auth.get(i).getUsername().equals(username)||this.auth.get(i).getPassword().equals(password)){
                auth1=true;
            }

        }
        return auth1;
    }
    public boolean tampilStaff(){
        var ada=false;
        for(UserStaff item:auth) {
            System.out.println("--------------");
            item.output();
            ada = true;
        }
        return ada;
    }
    public void updateUser(String username, String password){
        for(var i=1; i<this.auth.size(); i++){
            String nama=this.auth.get(i).getNama();
            String username1=this.auth.get(i).getUsername();
            String email=this.auth.get(i).getEmail();
            if(this.auth.get(i).getUsername().equals(username)){
                this.auth.set(Integer.parseInt(username), new UserStaff(nama, username,email, password));
            }
        }
    }

}
