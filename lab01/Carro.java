package lab01;



/**
 *
 * @author 17142837
 */
public class Carro {
   public String corCarroceria;
   public int quantidadeRodas;
   public int quantidadePassageiros;
   public int numeroPortas;
   public String nomeModelo;
   public String nomeFabricante;
   public int quilometragem;
   public boolean porta;

    public Carro() 
    {
        
    }

    public boolean isPorta() {
        return porta;
    }

    public void setPorta(boolean porta) {
        this.porta = porta;
    }
   
  

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    
    
    public String getCorCarroceria() {
        return corCarroceria;
    }

    public void setCorCarroceria(String corCarroceria) {
        this.corCarroceria = corCarroceria;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
   
    
   
   
}
