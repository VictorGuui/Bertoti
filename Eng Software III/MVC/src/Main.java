import Controller.NotaFiscalPaulista;
import Model.Estoque;
import Model.Passagem;
import View.View;

public class Main {
    public static void main(String[] args) {
        // Cria o estoque
        Estoque estoque = new Estoque();

        // Cria as passagens
        Passagem passagem1 = new Passagem("São Paulo", "Rio de Janeiro", 20230720, 300);
        Passagem passagem2 = new Passagem("São Paulo", "Belo Horizonte", 20230721, 200);

        // Adiciona as passagens ao estoque
        estoque.addPassagem(passagem1);
        estoque.addPassagem(passagem2);

        // Cria a view
        View view = new View();

        // Cria o controlador
        NotaFiscalPaulista controlador = new NotaFiscalPaulista();

        // Registra a view no controlador
        controlador.setV(view);

        // Registra a view como observador do estoque
        estoque.registerObserver(view);

        // Busca as passagens no estoque
        estoque.buscarPassagem(new Passagem("São Paulo", "Rio de Janeiro", 20230720, 300));

    }
}