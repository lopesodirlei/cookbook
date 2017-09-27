/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.modelo;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Receita {
    
    private int id;
    private String nome;
    private String modoDePreparo;
    private String modoDeServir;
    private Categoria categoria;
    private List<Receita_Ingrediente> receitas_ingredientes;

    public List<Receita_Ingrediente> getReceitas_ingredientes() {
        return receitas_ingredientes;
    }

    public void setReceitas_ingredientes(List<Receita_Ingrediente> receitas_ingredientes) {
        this.receitas_ingredientes = receitas_ingredientes;
    }
    

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

    @Override
    public String toString() {
        return "Receita{" + "id=" + id + ", nome=" + nome + ", modoDePreparo=" + modoDePreparo + ", modoDeServir=" + modoDeServir + ", categoria=" + categoria + ", receitas_ingredientes=" + receitas_ingredientes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Receita other = (Receita) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

    
}
