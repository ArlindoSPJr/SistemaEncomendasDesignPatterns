package org.example;

public class SeguroDecorator extends ServicosDecorator{

    private String tipo = "Seguro";
    private double valor = 100;
    private double valorTotal;

    public SeguroDecorator(IEncomenda encomenda){
        super(encomenda);
    }
    public double getValorTotal() {
        valorTotal = this.getEncomenda().getValorTotal() + this.valor;
        return valorTotal;
    }

    @Override
    public String getDesc() {
        return "Tipo de serviço: " + tipo + "\n" +
                "Valor total: "  + getValorTotal();
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
