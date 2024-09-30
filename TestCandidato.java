import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCandidato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Candidato candidatos;
        List<Candidato> listCandidatos = new ArrayList<>();
        int numero, qtdNumeros;
        String nome;

        System.out.println("Cadastramento de Candidato, por favor insira as informações abaixo: ");
        for(int i = 1; i <= 2; i++) {
            System.out.println("Candidato " + i + ": ");
            System.out.println("===+===+===+===");
            System.out.println("Nome: ");
             nome = input.nextLine();

            System.out.println("Número eleitoral:  ");
             numero = input.nextInt();

            boolean verificador = false;
            for(Candidato c : listCandidatos) {
                if(c.getNumero() == numero) {
                    verificador = true;
                }
            }
            if(verificador) {
                System.out.println("Número eleitoral já cadastrado");
                i--;
                continue;
            }
            input.nextLine();


            listCandidatos.add(new Candidato(nome, numero));

        }
        System.out.print("Quantas vezes deseja votar: ");
         qtdNumeros = input.nextInt();

        // Sistema de voto
        for(int i = 0; i < qtdNumeros; i++) {
            System.out.println("Insira o número eleitoral: ");
            int votoNumero = input.nextInt();
            boolean encontrou = false;

           for(Candidato c : listCandidatos) {
               if(c.getNumero() == votoNumero) {
                   c.votar();
                   encontrou = true;
               }
           }
           if(!encontrou) {
               System.out.println("Número inserido (" + votoNumero + ") é inválido.");
           }
        }

        for(Candidato e : listCandidatos) {
            e.exibirCandidatos();
        }


















//        System.out.println(candidato1.getQtdVotos());
//
//        System.out.print("Insira o número do candidato: ");
//        int votar = input.nextInt();
//
//        candidato1.votar(votar);
//        candidato1.votar(votar);
//        candidato1.votar(votar);
//        candidato1.exibirCandidatos();





    }
}
