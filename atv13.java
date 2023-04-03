import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um numero inteiro, iremos mostrar se ele e maior ou menor: ");
        int num = read.nextInt();
        if (num > 10) {
            System.out.println("O numero é maior que 10");
        }else{
            System.out.println("O numero é menor ou igual a 10");
        }
    }
}
