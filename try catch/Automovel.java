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
public abstract class Automovel {
    public int qnt_portas;
    public int qnt_cilindros;
    public boolean turbo;
    public String cor_carroceria;
    public String placa;

    public String getCor_carroceria() {
        return cor_carroceria;
    }

    public void setCor_carroceria(String cor_carroceria) {
        this.cor_carroceria = cor_carroceria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public abstract int getQnt_cilindros();
    public abstract void setQnt_cilindros(int qnt_cilindros);

    public abstract boolean isTurbo();
    public abstract void setTurbo(boolean turbo);
    
    public abstract int getQnt_portas();
    public abstract void setQnt_portas(int qnt_portas);
    
    public abstract int calcula_tempo(int cilindradas, int turbo);
      
    
    
    
}
