/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 17142837
 */
public class JavaApplication2 {

    
    public static void main(String[] args) {
        String modelo,cor_carro,nome,cnh;
        int qntd_rodas,idade;
        Motorista motorista = new Motorista();
        Scanner entrada = new Scanner(System.in);
        Carro_pronto carro_pronto1 = new Carro_pronto();
        Carro_pronto carro_pronto2 = new Carro_pronto();
        constCarro carro_individual = new constCarro();
        
        carro_pronto1.setCor_carro("amarelo");
        carro_pronto1.setModelo("fusca");
        carro_pronto1.setQnt_rodas(4);
        
        carro_pronto2.setCor_carro("preto");
        carro_pronto2.setModelo("ferrari");
        carro_pronto2.setQnt_rodas(2);
        
        int opcao=0,opcao1=0,flag=0;
        System.out.println("Nesse programa voce pode escolher um carro pre fabricado ou montar o seu proprio.\nApos isso tambem eh possivel colocar seus dados como motorista.\n");
        do{ //loop programa
        do{ //loop erro
        System.out.println("MENU\n");
        System.out.println("1-Escolha um carro pré fabricado(usando funcao carro_pronto)\n");
        System.out.println("2-Faca as escolhas do seu carro(carro_individual abstrato usando constutor pra ele e heranca)\n");
        System.out.println("3-Escolha o motorista(motorista usa heranca do cnh e polimorfismo - cnh abstrato-)\n");
        System.out.println("Caso queira olhar os construtores sobrecarregados olhe -construtor.java-\n");
        System.out.println("4-Sair");
        try{
        
        opcao= entrada.nextInt();
        entrada.nextLine();
        flag=0;
        }catch(Exception e)
           {
            System.out.println("Erro! por favor digite apennas numeros inteiros\n");
          flag=1;  
          entrada.nextLine(); //zerando buffer
           }
        }while(flag ==1);
       
        switch(opcao){
            case 1:System.out.println("Escolha 1 ou 2");
                   System.out.println("Primeiro modelo-");
                  carro_pronto1.imprimirCarro(carro_pronto1);
                  System.out.println("Segundo modelo-");
                  carro_pronto2.imprimirCarro(carro_pronto2);
                  opcao1 = entrada.nextInt();
                  if(opcao1 == 1){
                      System.out.println("Parabens voce adquiriu um " + carro_pronto1.modelo + " de cor " + carro_pronto1.cor_carro);
                        }
                  else{
                      System.out.println("Parabens voce adquiriu um " + carro_pronto2.modelo + " de cor " + carro_pronto2.cor_carro);
                      
                  }
                break;
            case 2:
                System.out.println("Digite a cor do carro:");
                
                cor_carro = entrada.nextLine();
                 System.out.println("Digite a qntd de rodas:");
                qntd_rodas = entrada.nextInt();
                 System.out.println("Digite o modelo do carro:");
                  entrada.nextLine();
                modelo = entrada.nextLine();
                carro_individual.setCor_carro(cor_carro);
                carro_individual.setModelo(modelo);
                carro_individual.setQnt_rodas(qntd_rodas);
                 System.out.println("Parabens voce adquiriu um carro " + carro_individual.modelo);
                 break;
            case 3:
                System.out.println("Digite o nome do motorista:");
                
                nome = entrada.nextLine();
                System.out.println("Digite a idade do motorista:");
                
                idade = entrada.nextInt();
                System.out.println("Digite a cnh:");
                entrada.nextLine();
                cnh = entrada.nextLine();
                motorista.setCnh(cnh);
                motorista.setIdade(idade);
                motorista.setNome(nome);
                System.out.println("Seja bem vindo " + motorista.nome + "idade de " + motorista.idade + " anos");
               break;
                
            case 4:
                break;
        }
        }while(opcao!=4); 
    }
    
}
