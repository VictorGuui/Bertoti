package Controller;

import Model.Passagem;
import View.View;

public class SemNotaPaulista implements Nota{
    private View v;
    private Passagem p;

    public void setV(View view){
        v = view;
    }

    public void emitirNota(){
        v.imprimirDadosPassagem();
    }
}