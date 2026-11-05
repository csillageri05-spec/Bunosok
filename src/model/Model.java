package model;

public class Model {

    private Allitas[] allitasok;
    private String uzenet;

    public Model() {
        allitasok = new Allitas[4];
        allitasok[0] = new Allitas("Anna:", "Béla volt", false);
        allitasok[1] = new Allitas("Béla:", "Csaba volt", false);
        allitasok[2] = new Allitas("Csaba:", "Nem Béla volt", false);
        allitasok[3] = new Allitas("Dávid:", "Nem Csaba volt", false);

        elemzes();
    }

    private void elemzes() {
        String[] gyanusitottak = {"Anna", "Béla", "Csaba", "Dávid"};
        String talaltTettes = "";
        int talaltMegoldasok = 0;

        for (String tettes : gyanusitottak) {
            boolean aIgaz = tettes.equals("Béla");
            boolean bIgaz = tettes.equals("Csaba");
            boolean cIgaz = !tettes.equals("Béla");
            boolean dIgaz = !tettes.equals("Csaba");

            int igazakSzama = (aIgaz ? 1 : 0) + (bIgaz ? 1 : 0) + (cIgaz ? 1 : 0) + (dIgaz ? 1 : 0);

            if (igazakSzama == 3) {
                talaltTettes = tettes;
                talaltMegoldasok++;
            }
        }
        if (talaltMegoldasok > 0) {
            this.uzenet = "A rejtveny megoldva, a tettes: " + talaltTettes;
        }else{
            this.uzenet="Nincs megoldas, minden probalkozásnál ellentmondásba futunk";
        }
    }

    public Allitas[] getAllitasok() {
        return allitasok;
    }

    public String getUzenet() {
        return uzenet;
    }
    
}
