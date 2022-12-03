package Model;

import Entity.Merchant;
import Entity.Pulsa;
import Entity.UserStaff;

import java.util.ArrayList;

public class Order {
    ArrayList <Merchant> mer=new ArrayList<>();
    ArrayList <Pulsa> pul=new ArrayList<>();
    public void tambahOrderPulsa(Pulsa data){
        this.pul.add(data);
    }
    public void tambahOrderEwallet(Merchant data){
        this.mer.add(data);
    }

    public int tampilHistoryMerchant(){
        var i=1;
        System.out.println("History Ewallet");
        for(Merchant item: this.mer){
            System.out.println("-----------");
            item.output();
            i=2;
        }
        return  i;
    }
    public int tampilHistoryPulsa(){
        var i=1;
        System.out.println("History Pulsa");
        for(Pulsa item:this.pul){
            System.out.println("-------------");
            item.output();
            i=2;
        }
        return i;
    }
}
