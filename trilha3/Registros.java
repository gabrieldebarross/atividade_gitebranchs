package trilha3;

public class Registros {
    public String nome;
    public Integer idade;
    public Double peso;
    public Double altura;

    public Registros(String nome, Integer idade, Double peso, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " (" + calcularMaioridade() + ")");
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + calcularImc());
    }

    public String calcularMaioridade(){
        if (idade >= 18) {
            return "Aluno maior de idade";
        } else {
            return "Aluno menor de idade";
        }
    }

    public double calcularImc(){
        return peso / (altura * altura);
    }
}