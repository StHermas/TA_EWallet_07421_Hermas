package Entity;

public class Merchant{
    private String ewallet;
    private int nominal;
    private String notelp;

    public Merchant(String ewallet, int nominal, String notelp){
        this.ewallet=ewallet;
        this.nominal=nominal+2000;
        this.notelp=notelp;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEwallet(){
        return ewallet;
    }
    public void setEwallet(String ewallet){
        this.ewallet=ewallet;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal+2000;
    }
    public void output(){
        System.out.println("No. Telp: "+this.notelp+" "+this.ewallet);
        System.out.println("Nominal"+this.nominal);

    }
}
