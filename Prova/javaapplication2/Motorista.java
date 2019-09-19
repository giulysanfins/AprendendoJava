/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 17142837
 */
public class Motorista extends CNH {
    String nome;
    int idade;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Motorista() {
        
    }

    public Motorista(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    
    @Override
    public String getCnh() {
        return cnh;
    }

    @Override
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public int getQnt_multas() {
        return qnt_multas;
    }

    @Override
    public void setQnt_multas(int qnt_multas) {
        this.qnt_multas = qnt_multas;
    }


   
    
    
}
