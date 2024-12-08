package org.example;

public abstract class ServicosDecorator implements IEncomenda {

    private IEncomenda encomenda;

    public ServicosDecorator(IEncomenda encomenda) {
        this.encomenda = encomenda;
    }

    public IEncomenda getEncomenda() {
        return encomenda;
    }

    public abstract String getDesc();
}
