package org.example;

public class LancheBuilder {
    private String pao;
    private String carne;
    private String queijo;
    private String adicionais;

    public LancheBuilder comPao(String pao) {
        this.pao = pao;
        return this;
    }

    public LancheBuilder comCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public LancheBuilder comQueijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    public LancheBuilder comAdicionais(String adicionais) {
        this.adicionais = adicionais;
        return this;
    }

    public Lanche build() {
        return new Lanche(pao, carne, queijo, adicionais);
    }
}
