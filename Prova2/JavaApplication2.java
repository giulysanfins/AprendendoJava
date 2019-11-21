
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 17142837
 */
public class JavaApplication2 {

   
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        Estabelecimento estabelecimento = new Estabelecimento();
        String nome,nomeaux;
        
        int opcao,produtos,produto1=0,produto2=0,produto3=0,faturaTotal=0,produtoEstranho=0,opcaoaux;
        estabelecimento.setProduto1(5);
        estabelecimento.setProduto2(6);
        estabelecimento.setProduto3(9);
        System.out.println("Sobrecarga e polimorfismo utilizado na cliente.java - estabelecimento.java.\nusando heranca p/ extender clientes\n\n");

        do{
           
        System.out.println("Qual o seu nome?" + "\n");
        
        nome =entrada.nextLine();
        
        estabelecimento.setNome(nome);
        do{
        System.out.println("1-Deseja comprar produtos?" + "\n");
        System.out.println("2-Deseja finalizar sua compra?" + "\n");
        
        opcao= entrada.nextInt();
               if(opcao == 1){ //se escolher o produto pra comprar
           System.out.println("Produtos: 1- 2- 3-" + "\n");
           produtos= entrada.nextInt();
            switch (produtos) {
                case 1:
                    
                    produto1+=1;
                    faturaTotal+=5;
                    System.out.println("Parabens voce adquiriu o produto 1, sua fatura eh de  " + faturaTotal + "\n" );
                    break;
                case 2:
                    produto2+=1;
                    faturaTotal+=6;
                    System.out.println("Parabens voce adquiriu o produto 2, sua fatura eh de  " + faturaTotal + "\n" );
                    break;
                case 3:
                    produto3+=1;
                    faturaTotal+=9;
                    System.out.println("Parabens voce adquiriu o produto 3, sua fatura eh de  " + faturaTotal + "\n" );
                    break;

            }
        
           
       }
       else if(opcao == 2){ //se queira finalizar o programa
           System.out.println(" OK! Voce finalizou a compra! Sua fatura total foi de \n" + faturaTotal );
          
           System.out.println("Sera que voce ganhou um premio?  \n");
           if(faturaTotal%faturaTotal == 0 ){
               System.out.println("Parabéns voce ganhou um desconto de 50%!\n");
               faturaTotal=faturaTotal/2;
                System.out.println("Sua fatura total eh de " + faturaTotal);
                produtoEstranho+=1;
           }
           else{
               System.out.println(".. .. .. .. \n Puxa! não foi dessa vez\n Sua fatura eh de " + faturaTotal);
           }
           
       }
        }while(opcao!=2);

        System.out.println("Digite 1 p/ finalizar o caixa ou 2/ colocar outro cliente\n");
        opcaoaux = entrada.nextInt();
        if(opcaoaux == 1){
             System.out.println("FATURA TOTAL(opcao somente para adm)\n");
       
            if(produto1>produto2 && produto1>produto3){
               System.out.println("O produto mais comprado foi o produto1\n");
               
           }
           if(produto2>produto3 && produto2>produto1){
               System.out.println("O produto mais comprado foi o produto2\n");
               
           }
            if(produto3>produto1 && produto3>produto2){
               System.out.println("O produto mais comprado foi o produto3\n");
               
           }
            
            System.out.println("Descontos dados:  "+ produtoEstranho + "vezes \n");
           
       
        }
        else{
            faturaTotal=0; //zerando p prox cliente 
            
        }
    }while(opcaoaux!=1);
        
        
        
    }
    
}
