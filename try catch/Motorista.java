/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 17142837
 */
public class Motorista {
    
    int tempo_Cnh;
    int qnt_multas;
    String nome;
    String carro;

    public int getTempo_Cnh() {
        return tempo_Cnh;
    }

    public void setTempo_Cnh(int tempo_Cnh) {
        this.tempo_Cnh = tempo_Cnh;
    }

    public int getQnt_multas() {
        return qnt_multas;
    }

    public void setQnt_multas(int qnt_multas) {
        this.qnt_multas = qnt_multas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    public void comprarCarro(String car){
        this.carro = car;
        
    }
    
public void imprimirCarro(String car){
    
    System.out.println(car);
}    
        
    
}
