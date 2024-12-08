package org.example;

public class EncomendaFragil implements IEncomenda{

    private String tipo;
    private double valor;

    public EncomendaFragil(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
