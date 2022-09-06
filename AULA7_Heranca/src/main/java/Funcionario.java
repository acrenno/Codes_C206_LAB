public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    //funcionario nao consegue acessar a funcao faz algo
    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

    public void salarioBonus(){

        System.out.println("O salario novo do " +this.nome + " é " + (this.salario*1.05));
    }
    public void trabalhar()
    {
        System.out.println("O funcionario(a) "+this.nome + " esta trabalhando!");
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
