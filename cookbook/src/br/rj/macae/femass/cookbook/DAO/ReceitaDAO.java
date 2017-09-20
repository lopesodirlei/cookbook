/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.DAO;

import br.rj.macae.femass.cookbook.modelo.Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class ReceitaDAO {
    private Connection NULL;
    public void adicionar(Receita r){
        Connection conexao=NULL;
        try{
            conexao =FabricaConexao.GetConexao(); 
            String sql="insert into receita (nome, ingredientes, modo preparo, modo servir, categoria) values (?, ?, ?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, r.getNome());
            stmt.setString(2, r.getIngredientes());
            stmt.setString(3, r.getModoDePreparo());
            stmt.setString(4, r.getModoDeServir());
            stmt.setInt(5, r.getCategoria().getId());
            
            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
