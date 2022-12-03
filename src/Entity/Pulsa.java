package Entity;

public class Pulsa{
    private String jPulsa;
    private int nominal;
    private String notelp;

    public Pulsa(String jPulsa, int nominal, String notelp){
        this.jPulsa=jPulsa;
        this.nominal=nominal;
        this.notelp=notelp;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getjPulsa(){
        return jPulsa;
    }
    public void setEwallet(String jPulsa){
        this.jPulsa=jPulsa;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    public void output(){
        System.out.println("Pulsa"+this.jPulsa+" Nomor"+this.notelp);
        System.out.println("Nominal "+this.nominal);
    }
}
