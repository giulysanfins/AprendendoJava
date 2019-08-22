
package lab01;


public class Lab01 {

   
    public static void main(String[] args) {
      ///////////////////////////////////////////////
        
       Carro carro = new Carro();
       carro.setCorCarroceria("Prata");
       
       carro.setNomeFabricante("Volkswagen");
       carro.setNomeModelo("Fusca");
       carro.setNumeroPortas(2);
       carro.setQuantidadePassageiros(4);
       carro.setQuantidadeRodas(4);
       carro.setQuilometragem(200);
       carro.setPorta(true);
       ///////////////////////////////////////////////
       
       Condutor condutor = new Condutor();
       condutor.setIdade(20);
       condutor.setNaturalidade("coreano");
       condutor.setNome("Giuly");
      ////////////////////////////////////////
       System.out.println("CARRO: \n");
       System.out.println("Cor:" + carro.corCarroceria + "\n");
       System.out.println("Fabricante:" + carro.nomeFabricante + "\n");
       System.out.println("Modelo:" + carro.nomeModelo + "\n");
       System.out.println("N de portas:" + carro.numeroPortas + "\n");
       System.out.println("Qnt passageiros:" + carro.quantidadePassageiros + "\n");
       System.out.println("Qnt de rodas:" + carro.quantidadeRodas + "\n");
       System.out.println("KM:" + carro.quilometragem + "\n");
       if(carro.porta == true){
           System.out.println("Porta ABERTA"  + "\n \n");
       }
       else{
            System.out.println("Porta FECHADA"  + "\n \n");
       }
       System.out.println("O condutor " + condutor.nome +  " possui um carro modelo " +  carro.nomeModelo +  " do fabricante " +carro.nomeFabricante);

       
       System.out.println("Condutor \n");
       System.out.println("Nome:" + condutor.nome + "\n");
       System.out.println("Naturalidade:" + condutor.naturalidade + "\n");
       System.out.println("Idade:" + condutor.idade + "\n");
       
       
       
       
       
       
       
    }

   
    
}
