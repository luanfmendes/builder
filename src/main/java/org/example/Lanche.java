package org.example;

public class Lanche {
    private final String pao;
    private final String carne;
    private final String queijo;
    private final String adicionais;

    Lanche(String pao, String carne, String queijo, String adicionais) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.adicionais = adicionais;
    }

    public String getPao() {
        return pao;
    }

    public String getCarne() {
        return carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getAdicionais() {
        return adicionais;
    }
}
