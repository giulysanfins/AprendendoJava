
package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro();
        
        passageiro.setPassaporte(12);
        passageiro.setPeso(150);
        passageiro.setAltura(150);
        passageiro.setNacionalidade("Brasileiro");
        passageiro.setRaca("Branco");
        passageiro.setForcaBraco(100);
        passageiro.setPeso_mala(200);
        
        
        passageiro.verificar(passageiro.getPeso_mala(), passageiro.getPeso());
        
        Aeria ae = new Aeria();
        ae.mudeACorPeloAmorDeDeus("amarelo");
      
       
        
    }
    
}
