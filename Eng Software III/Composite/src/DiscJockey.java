public class DiscJockey {
  ComponentMusic listaMusica;

  public DiscJockey(ComponentMusic newListaMusica) {
      listaMusica = newListaMusica;
  }

  public void getListaMusica(){
      listaMusica.displayInfoMusica();
  }
}