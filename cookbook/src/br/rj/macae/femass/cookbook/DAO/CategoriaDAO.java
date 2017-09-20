/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.DAO;

import br.rj.macae.femass.cookbook.modelo.Categoria;
import br.rj.macae.femass.cookbook.modelo.Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class CategoriaDAO {
    
    private Connection NULL;
    public void adicionar(Categoria c){
        Connection conexao=NULL;
        try{
            conexao =FabricaConexao.GetConexao(); 
            String sql="insert into categoria (id, nome, descrição) values (?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getDescricao());
            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
