package org.example;

public class EncomendaPesada implements IEncomenda{


    private String tipo;
    private double valor;
    private double valorTotal;

    public EncomendaPesada(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        valorTotal = this.valor;
        return valorTotal;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
