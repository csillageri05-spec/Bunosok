package model;

public class Allitas {

    private String nev;
    private String szoveg;
    private boolean igaz;

    public Allitas(String nev, String szoveg, boolean igaz) {
        this.nev = nev;
        this.szoveg = szoveg;
        this.igaz = igaz;
    }

    public String getNev() {
        return nev;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public boolean isIgaz() {
        return igaz;
    }

    public void setIgaz(boolean igaz) {
        this.igaz = igaz;
    }

}
