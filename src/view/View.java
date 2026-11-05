package view;

import model.Allitas;
import model.Model;

public class View {

    public void kiirFeladat(Model model) {
        System.out.println("==================================================");
        System.out.println("               Ki lehet a tette?                  ");
        System.out.println("==================================================");
        System.out.println(" Gyanusítottak: Anna, Béla, Csaba, Dávid");
        System.out.println(" 4 állításból 3 igaznak és 1 hamisnak kell lennie ");
        System.out.println("==================================================");
        System.out.println(" Állítások: ");
        Allitas[] allitasok = model.getAllitasok();
        for (int i = 0; i < allitasok.length; i++) {
            Allitas a = allitasok[i];
            System.out.println(" " + a.getNev() + " " + a.getSzoveg());
        }
        System.out.println("==================================================");
        System.out.println(" Eredmeny: ");
        System.out.println(" " + model.getUzenet());
        System.out.println("==================================================");
    }
}
