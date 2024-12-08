package org.example;

public class EntregaExpress implements IEntrega{

    @Override
    public String getDesc() {
        return "Tipo de entrega: Express \n" +
                "Tempo de entrega: 5 dias ";
    }

    @Override
    public String trocarTipoEntrega(IEntrega entrega) {
        return "Trocando para entrega Express";
    }
}
