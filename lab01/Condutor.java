
package lab01;

public class Condutor {
   public String nome;
   public int idade;
   public String naturalidade;

    public Condutor(String nome, int idade, String naturalidade) {
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
    }

    public Condutor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
   
   
   
    
}
