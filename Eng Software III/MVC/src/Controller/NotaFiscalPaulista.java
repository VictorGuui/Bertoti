package Controller;

import Model.Passagem;
import View.View;

public class NotaFiscalPaulista implements Nota {
    private View v;
    private Passagem p;

    public void setV(View view){
        this.v = view;
        v.setN(this);
    }

    public void emitirNota(){
        v.imprimirDadosPassagem();
        v.imprimirNotaPaulista();
    }
}