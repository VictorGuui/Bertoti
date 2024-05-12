package Model;

import View.Observer;

import java.util.List;

public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObservers(List encontrados);
}