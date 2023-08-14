/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.project.dao;

import br.com.project.model.Clientes;

/**
 *
 * @author Wendell Marcos
 */
public class ClientesDao {
    
    public void cadastrarCliente(Clientes clientes){
        try {
            String sql = "INSERT INTO tb_clientes ("
                    + "id,"
                    + " nome,"
                    + " rg,"
                    + " cpf,"
                    + " email,"
                    + " telefone,"
                    + " celular,"
                    + " cep,"
                    + " endereco,"
                    + " numero,"
                    + " complemento,"
                    + " bairro,"
                    + " cidade,"
                    + " estado)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        } catch (Exception e) {
        }
    }
    
    public void alterarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
}
