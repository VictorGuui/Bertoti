import java.util.ArrayList;
import java.util.Iterator;

public class GrupoMusica implements ComponentMusic {

    ArrayList<ComponentMusic> componentsMusica = new ArrayList<>();
    String nomeGrupo;
    String descricaoGrupo;

    public GrupoMusica(String newNomeGrupo, String newDescricaoGrupo) {
        nomeGrupo = newNomeGrupo;
        descricaoGrupo = newDescricaoGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    public void add(ComponentMusic newComponentMusica) {
        componentsMusica.add(newComponentMusica);
    }

    public void remove(ComponentMusic newComponenMusica) {
        componentsMusica.remove(newComponenMusica);
    }

    public ComponentMusic getComponent(int componentIndex) {
        return componentsMusica.get(componentIndex);
    }

    public void displayInfoMusica() {
        System.out.println(getNomeGrupo() + " " + getDescricaoGrupo() + "\n");

        Iterator<ComponentMusic> musicaIterator = componentsMusica.iterator();

        while (musicaIterator.hasNext()) {
            ComponentMusic infoMusica = musicaIterator.next();
            infoMusica.displayInfoMusica();
        }
    }
}
