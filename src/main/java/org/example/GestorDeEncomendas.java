package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorDeEncomendas {
    private static final GestorDeEncomendas GESTOR = new GestorDeEncomendas();
    private static List<IEncomenda> encomendas = new ArrayList<>();
    private List<IEntrega> entregas = new ArrayList<>();

    private GestorDeEncomendas() {

    }

    public static GestorDeEncomendas getInstance() {
        return GESTOR;
    }

    public static void cadastrarEncomenda(IEncomenda encomenda){
        encomendas.add(encomenda);
    }

    public void cadastrarEntrega(IEntrega entrega){
        entregas.add(entrega);
    }

    public void mudarTipoEncomenda(IEntrega entrega){
        entrega.trocarTipoEntrega(entrega);
        System.out.println(entrega.getDesc());
    }

    public void enviarEncomenda(IEncomenda encomenda){
        System.out.println("Encomenda enviada com sucesso!");
    }
}
