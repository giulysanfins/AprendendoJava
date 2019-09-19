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
public abstract class CNH {
    public String cnh;
    public int qnt_multas;

    public abstract String getCnh(); 
    

    public abstract void setCnh(String cnh);
    

    public abstract int getQnt_multas();
    

    public abstract void setQnt_multas(int qnt_multas);
    

    public CNH() {
    }

    public CNH(String cnh, int qnt_multas) {
        this.cnh = cnh;
        this.qnt_multas = qnt_multas;
    }
    
    
    
}
