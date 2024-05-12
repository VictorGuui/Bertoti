package Model;

public class Passagem {
    private String origem;
    private String destino;
    private int data;
    private int valor;

    public Passagem(String o, String d, int dt, int v){
        origem = o;
        destino = d;
        data = dt;
        valor = v;
    }

    public String getOrigem(){
        return origem;
    }

    public String getDestino(){
        return destino;
    }

    public int getData(){
        return data;
    }

    public int getValor(){
        return valor;
    }

    public boolean matches(Passagem d){
        if(!origem.equals(d.origem)) return false;
        if(!destino.equals(d.destino)) return false;
        if(data!=d.data) return false;
        if(valor!=d.valor) return false;
        return true;
    }
}