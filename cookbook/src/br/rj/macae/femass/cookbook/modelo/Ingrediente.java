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
public class Ingrediente {
    private int id;
    private String nome;
    private String descricao;
    private List<Receita_Ingrediente> receitas_ingredientes;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Receita_Ingrediente> getReceitas_ingredientes() {
        return receitas_ingredientes;
    }

    public void setReceitas_ingredientes(List<Receita_Ingrediente> receitas_ingredientes) {
        this.receitas_ingredientes = receitas_ingredientes;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", receitas_ingredientes=" + receitas_ingredientes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Ingrediente other = (Ingrediente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
