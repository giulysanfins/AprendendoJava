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
public class Carro_pronto {
    public String cor_carro;
    public int qnt_rodas;
    public String modelo;

    public Carro_pronto() {
        
      
        
    }

    public Carro_pronto(String cor_carro, int qnt_rodas, String modelo) {
        this.cor_carro = cor_carro;
        this.qnt_rodas = qnt_rodas;
        this.modelo = modelo;
    }

    public String getCor_carro() {
        return cor_carro;
    }

    public void setCor_carro(String cor_carro) {
        this.cor_carro = cor_carro;
    }

    public int getQnt_rodas() {
        return qnt_rodas;
    }

    public void setQnt_rodas(int qnt_rodas) {
        this.qnt_rodas = qnt_rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void imprimirCarro(Carro_pronto carro){
        System.out.println("Cor do carro ");
        System.out.println(carro.cor_carro);
        System.out.println("Modelo do carro ");
        System.out.println(carro.modelo);
        System.out.println("Qnt de rodas ");
        System.out.println(carro.qnt_rodas);
        System.out.println("---------------------");
        
    }
}
