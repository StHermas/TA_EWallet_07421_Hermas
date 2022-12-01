package Database;

public class Ewallet {
    private String ewallet;
    private int nominal;
    private String notelp;
  public Ewallet(){

    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public Ewallet(String ewallet){
        this.ewallet=ewallet;
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
        this.nominal = nominal;
    }
}
