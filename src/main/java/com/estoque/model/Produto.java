package com.estoque.model;

public class Produto {
    private String id;
    private String nome;
    private String categoria;
    private String descricao;
    private double preco;
    private int estoqueMinimo;

    public Produto(String id, String nome, String categoria, String descricao, double preco, int estoqueMinimo){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.estoqueMinimo = estoqueMinimo;
        
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
    
}
