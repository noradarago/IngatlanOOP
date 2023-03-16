public class Ingatlan {
    private String cim;
    private int szobakSzama;
    private int alapterulet;

    public Ingatlan() {
    }

    public Ingatlan(String cim, int szobakSzama, int alapterulet) {
        this.cim = cim;
        this.szobakSzama = szobakSzama;
        this.alapterulet = alapterulet;
    }

    public void kiir(){
        System.out.println("Az ingatlan címe: " + cim + ", szobák száma: " + szobakSzama + ", alapterülete: " + alapterulet);
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getSzobakSzama() {
        return szobakSzama;
    }

    public void setSzobakSzama(int szobakSzama) {
        this.szobakSzama = szobakSzama;
    }

    public int getAlapterulet() {
        return alapterulet;
    }

    public void setAlapterulet(int alapterulet) {
        this.alapterulet = alapterulet;
    }
}
