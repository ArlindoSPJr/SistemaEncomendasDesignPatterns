package org.example;

public class RastreamentoGpsDecorator extends ServicosDecorator{

    private String tipo = "Rastreamento por GPS";
    private double valor = 250;
    private double valorTotal;

    public RastreamentoGpsDecorator(IEncomenda encomenda){
        super(encomenda);
    }
    public double getValorTotal() {
        valorTotal = this.getEncomenda().getValorTotal() + this.valor;
        return valorTotal;
    }

    @Override
    public String getDesc() {
        return "Tipo de serviço: " + tipo + "\n" +
                "Valor total: "  + this.getValorTotal();
    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public double getValor() {
        return 0;
    }
}
