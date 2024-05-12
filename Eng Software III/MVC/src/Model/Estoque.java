package Model;

import View.Observer;

import java.util.LinkedList;
import java.util.List;

public class Estoque implements Subject{
    private List passagens;
    private List observers;

    public Estoque(){
        passagens = new LinkedList();
        observers = new LinkedList();
    }



    public void registerObserver(Observer o){
        observers.add(o);
    }


    public void notifyObservers(List encontrados){
        for(Object i: observers){
            Observer ob = (Observer)i;
            ob.update(encontrados);
        }
    }

    public void addPassagem(Passagem d){
        passagens.add(d);
    }

    public void buscarPassagem(Passagem d){
        List encontrados = new LinkedList();
        for(Object i: passagens){
            Passagem passagemEstoque = (Passagem)i;
            if(passagemEstoque.matches(d)) encontrados.add(passagemEstoque);
        }
        notifyObservers(encontrados);
    }

}