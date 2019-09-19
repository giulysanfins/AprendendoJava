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
public class constCarro extends Carro_individual {

    public constCarro() {
    }

    public constCarro(String cor_carro, int qnt_rodas, String modelo) {
        super(cor_carro, qnt_rodas, modelo);
    }

    
    
    
    @Override
    public String getCor_carro() {
        return cor_carro;
    }

    @Override
    public void setCor_carro(String cor_carro) {
        this.cor_carro = cor_carro;
    }

    @Override
    public int getQnt_rodas() {
        return qnt_rodas;
    }

    @Override
    public void setQnt_rodas(int qnt_rodas) {
        this.qnt_rodas = qnt_rodas;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void cor_carro(String cor_carro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
