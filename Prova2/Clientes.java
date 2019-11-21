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
public abstract class Clientes {
    

    public String nome;
    public int produto1;
    public int produto2;
    public int produto3;
    public Clientes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProduto1() {
        return produto1;
    }

 public abstract void setProduto1(int produto1);

    public int getProduto2() {
        return produto2;
    }

 public abstract void setProduto2(int produto2);

    public int getProduto3() {
        return produto3;
    }

    public abstract void setProduto3(int produto3);
        
    
    
    
    
    
    
    
}
