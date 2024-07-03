import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 10 :");
        int num = sc.nextInt();
        while(num>10 || num<0){
            System.out.println("Valor inválido, por favor, insira um valor válido");
            num = sc.nextInt();
        }
        System.out.println("O valor digitado é: "+ num );
        sc.close();
    }
}
