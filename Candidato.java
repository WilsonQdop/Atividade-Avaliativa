public class Candidato {
    private String nome;
    private int numero;
    private int qtdVotos;

    Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.qtdVotos = 0;
    }

     String getNome() {
        return this.nome;
    }
     int getNumero() {
        return this.numero;
    }
     int getQtdVotos() {
        return this.qtdVotos;
    }

     void votar() {
            this.qtdVotos++;
    }
    void exibirCandidatos() {
        System.out.println("===+===+===+===+===+===");
        System.out.println("Nome candidato: " + getNome() + "\n" +
                "Número da urna: " + getNumero() + "\n"+
                 "Votos total: " + getQtdVotos());
        System.out.println("===+===+===+===+===+===");
    }

}
