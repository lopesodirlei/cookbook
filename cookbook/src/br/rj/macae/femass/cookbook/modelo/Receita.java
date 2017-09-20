/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.modelo;

/**
 *
 * @author aluno
 */
public class Receita {
    
    private int id;
    private String nome;
    private String ingredientes;
    private String modoDePreparo;
    private String modoDeServir;
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria c) {
        this.categoria = c;
        c.setReceita(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    public String getModoDeServir() {
        return modoDeServir;
    }

    public void setModoDeServir(String modoDeServir) {
        this.modoDeServir = modoDeServir;
    }
    
    

    
}
