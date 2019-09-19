/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 17142837
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String car = null;
   int flag=0,jao=0;
   FiatUno fiat = new FiatUno();
   Motorista motorista = new Motorista();
   Scanner entrada = new Scanner(System.in);
   
   do{
   try{
       
    jao = entrada.nextInt();
    
    flag=0;
   }
   
   catch(Exception e){
       System.out.println("Erro");
       flag=1;
       entrada.nextLine();
   }
   }while(flag == 1);
  
   motorista.comprarCarro(car);
   motorista.imprimirCarro(car);
    }
    
}
