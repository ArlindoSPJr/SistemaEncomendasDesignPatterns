package org.example;

public class Main {
    public static void main(String[] args) {
        // Singleton do gestor
        GestorDeEncomendas gestorDeEncomendas = GestorDeEncomendas.getInstance();

        // Criando uma encomenda frágil
        System.out.println("Criando Encomenda Frágil e imprimindo detalhes:");
        IEncomenda encomendaFragil = new EncomendaFragil("Frágil", 100);
        System.out.println(encomendaFragil.getTipo());
        System.out.println(encomendaFragil.getValor());
        System.out.println();

        // Cadastrando encomenda
        gestorDeEncomendas.cadastrarEncomenda(encomendaFragil);

        // Adicionando seguro à encomenda
        System.out.println("Adicionando Seguro na encomenda:");
        ServicosDecorator encomendaComSeguro = new SeguroDecorator(encomendaFragil);
        System.out.println(encomendaComSeguro.getDesc());
        System.out.println();

        // Adicionando rastreamento GPS sobre o seguro
        System.out.println("Adicionando Rastreio via GPS à encomenda com seguro:");
        ServicosDecorator encomendaComSeguroEGPS = new RastreamentoGpsDecorator(encomendaComSeguro);
        System.out.println(encomendaComSeguroEGPS.getDesc());
        System.out.println();

        // Criando entrega comum e associando à encomenda
        System.out.println("Criando entrega comum para a encomenda:");
        IEntrega entregaComum = new EntregaComum();
        gestorDeEncomendas.mudarTipoEncomenda(entregaComum);
        System.out.println();

        // Mudando para entrega expressa
        System.out.println("Mudando entrega para expressa:");
        IEntrega entregaExpressa = new EntregaExpress();
        gestorDeEncomendas.mudarTipoEncomenda(entregaExpressa);
        System.out.println();
    }
}
