public class Carro {
  private Cambio cambio;

  public void setCambio(Cambio cambio) {
      this.cambio = cambio;
  }

  public void usarCambio() {
      if (cambio != null) {
          cambio.usarCambio();
      } else {
          System.out.println("Câmbio não definido.");
      }
  }
}