import java.util.Scanner;

public class Exercicio1{
public static void main(String[] args) {
    Scanner ler =  new Scanner (System.in);
    System.out.println("digite a velocidade media");
    int velocidade = ler.nextInt();
    System.out.println("digite o tempo gasto");
    int tempo = ler.nextInt();
    System.out.println("digite a media de consumo de seu veiculo");
    int capacidade = ler.nextInt();
    int  distancia = (tempo * velocidade);
    int  combustivel = (distancia/capacidade);
        System.out.println("foi consumido" + combustivel);


}

    }