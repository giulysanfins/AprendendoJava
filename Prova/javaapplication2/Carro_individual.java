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
public abstract class Carro_individual {
    public String cor_carro;
    public int qnt_rodas;
    public String modelo;

    public abstract String getCor_carro();
       
    

    public abstract void setCor_carro(String cor_carro); 
   

    public abstract int getQnt_rodas(); 
   

    public abstract void setQnt_rodas(int qnt_rodas);
       
    

    public abstract String getModelo();
    

    public abstract void setModelo(String modelo);

    public Carro_individual() {
    }

    public Carro_individual(String cor_carro, int qnt_rodas, String modelo) {
        this.cor_carro = cor_carro;
        this.qnt_rodas = qnt_rodas;
        this.modelo = modelo;
    }
     
    
    
    
    
}
