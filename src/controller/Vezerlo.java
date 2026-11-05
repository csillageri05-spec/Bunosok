package controller;

import model.Model;
import view.View;

public class Vezerlo {
    
    private Model model;
    private View view;
    
    public Vezerlo() {
        model = new Model();
        view = new View();
    }

    public void inditas() {
        view.kiirFeladat(model);
    }
}
