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
public class Estabelecimento extends Clientes {
    public int faturaDia;

    public Estabelecimento() {
    }

    public int getFaturaDia() {
        return faturaDia;
    }

    public void setFaturaDia(int faturaDia) {
        this.faturaDia = faturaDia;
    }

    @Override
    public void setProduto1(int produto1) {
        this.produto1 = produto1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProduto2(int produto2) {
         this.produto2 = produto2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProduto3(int produto3) {
         this.produto3 = produto3; //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
}
