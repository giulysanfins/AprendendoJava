
package javaapplication2;


public class Passageiro extends Pessoa {
    
    public int passaporte;
    public int peso_mala;

    public Passageiro() {
    }

    public int getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }

    public int getPeso_mala() {
        return peso_mala;
    }

    public void setPeso_mala(int peso_mala) {
        this.peso_mala = peso_mala;
    }
    
    public void verificar(int peso_mala, int peso){
        if(peso_mala>peso){
            System.out.println("Nao deu pra carregar\n");
        }
    }
    
            
    
}
