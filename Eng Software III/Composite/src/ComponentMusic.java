public interface ComponentMusic {
    default void add(ComponentMusic componentMusic){
        throw new UnsupportedOperationException();
    }

    //REMOVENDO COMPONENTS
    private void remove(ComponentMusic newComponentMusic){
        throw new UnsupportedOperationException();
    }

    //PEGANDO COMPONENTS
    private ComponentMusic getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME DA MUSICA
    private String getNomeMusica(){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME DA BANDA
    private String getNomeBanda(){
        throw new UnsupportedOperationException();
    }

    //RETORNA O ANO
    private int getAnoLancamento(){
        throw new UnsupportedOperationException();
    }

    default void displayInfoMusica(){
        System.out.println("Nome da música: " + getNomeMusica());
        System.out.println("Banda: " + getNomeBanda());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
    }
}