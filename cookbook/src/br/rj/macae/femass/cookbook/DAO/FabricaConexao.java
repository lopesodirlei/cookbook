/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.cookbook.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aluno
 */
public class FabricaConexao {
    
     public static Connection GetConexao(){
        Connection conexao = null;
        try{
            conexao=DriverManager.getConnection("JDBC: postgresql://localhost:5432/bdcookbook","postgres","12345678");
                     
                    }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        return conexao;
                    
        }
    
}
