package View;

import Controller.Nota;
import Controller.NotaFiscalPaulista;
import Model.Passagem;

import java.util.List;

public class View implements Observer{
    private Nota n;
    private List listaPassagens;

    public View(){
        n = new NotaFiscalPaulista();
    }

    public void setN(Nota nota){
        n = nota;
    }

    public void update(List l){
        listaPassagens = l;
        n.emitirNota();

    }

    public void imprimirDadosPassagem(){
        if(!listaPassagens.isEmpty()){
            for(Object i: listaPassagens){
                Passagem d = (Passagem)i;
                System.out.println(d.getOrigem()+" "+d.getDestino()+" "+d.getData()+" "+d.getValor());
            }
        }

    }

    public void imprimirNotaPaulista(){
        System.out.println("Dados da nota Paulista...");
        System.out.println("CPF ....");
        System.out.println("Valor total ....");
    }


}