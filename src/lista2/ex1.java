package lista2;
class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("João", 40, null, null);
        Pessoa mae = new Pessoa("Maria", 38, null, null);
        Pessoa filho = new Pessoa("Pedro", 10, pai, mae);

        System.out.println("Nome do filho: " + filho.getNome());
        System.out.println("Idade do filho: " + filho.getIdade());
        System.out.println("Nome do pai: " + filho.getPai().getNome());
        System.out.println("Idade do pai: " + filho.getPai().getIdade());
        System.out.println("Nome da mãe: " + filho.getMae().getNome());
        System.out.println("Idade da mãe: " + filho.getMae().getIdade());
    }
}
