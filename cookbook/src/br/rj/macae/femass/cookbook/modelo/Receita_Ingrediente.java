/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.modelo;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Receita_Ingrediente {
    
    private float quantidade;
    private String unidade;
    private Receita receita;
    private Ingrediente ingrediente;

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Receita_Ingrediente{" + "quantidade=" + quantidade + ", unidade=" + unidade + ", receita=" + receita + ", ingrediente=" + ingrediente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.receita);
        hash = 61 * hash + Objects.hashCode(this.ingrediente);
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
        final Receita_Ingrediente other = (Receita_Ingrediente) obj;
        if (!Objects.equals(this.receita, other.receita)) {
            return false;
        }
        if (!Objects.equals(this.ingrediente, other.ingrediente)) {
            return false;
        }
        return true;
    }
    
    
    
}
