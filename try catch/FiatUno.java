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
public  class FiatUno extends Automovel {
    int qnt_escadas;
    int tam_portamala;
    
    public int getQnt_escadas() {
        return qnt_escadas;
    }

    public void setQnt_escadas(int qnt_escadas) {
        this.qnt_escadas = qnt_escadas;
    }

    public int getTam_portamala() {
        return tam_portamala;
    }

    public void setTam_portamala(int tam_portamala) {
        this.tam_portamala = tam_portamala;
    }

    @Override
    public int getQnt_portas() {
        return qnt_portas;
    }

    @Override
    public void setQnt_portas(int qnt_portas) {
        this.qnt_portas = qnt_portas;
    }

    @Override
    public int getQnt_cilindros() {
        return qnt_cilindros;
    }

    @Override
    public void setQnt_cilindros(int qnt_cilindros) {
        this.qnt_cilindros = qnt_cilindros;
    }
    
    @Override
    public boolean isTurbo() {
        return turbo;
    }
    
    @Override
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String getCor_carroceria() {
        return cor_carroceria;
    }

    @Override
    public void setCor_carroceria(String cor_carroceria) {
        this.cor_carroceria = cor_carroceria;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    @Override
     public int calcula_tempo(int cilindradas, int x){
     int segundos = 0;
       segundos = (x/2) + cilindradas;
       
        
      return segundos;  
     } 
    
    public void acelearacao(){
        if(qnt_escadas > 4){
            
            System.out.println("Devagar demais");
        }
        else{
            
            System.out.println("Vrum vrum");
        }
        
    }

   
}
