package org.example;

public class EntregaComum implements IEntrega{


    @Override
    public String getDesc() {
        return "Tipo de entrega: Comum \n" +
                "Tempo de entrega: 10 dias ";
    }

}