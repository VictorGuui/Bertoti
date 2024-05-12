public class Main {
  public static void main(String[] args) {
      System.out.println("---- ANÁLISE CARRO ----");
      System.out.println("#Câmbio");
      Carro carro = new Carro();
      
      carro.setCambio(new Automatico());
      carro.usarCambio();

      carro.setCambio(new Manual());
      carro.usarCambio();
  }
}