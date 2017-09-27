/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.modelo;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Categoria {
    
    private int id;
    private String nome;
    private String descricao;
    private List<Receita> receitas;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Receita> getReceitas() {
        return Collections.unmodifiableList(this.receitas);
    }

    public void setReceita(Receita r) {
        if(r.getCategoria().equals(this)){
            this.receitas.add(r);
        }
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", receitas=" + receitas + '}';
    }
       
}
    