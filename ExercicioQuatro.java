import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o valor para a " + (i + 1)+"ª"+" posição da lista.");
            int valor = sc.nextInt();
            array[i] = valor;
        }
        double soma = 0;
        for (int i = 0; i < 5; i++){
            soma += array[i];
        }
        double media = soma / 5;
        System.out.println("O resultado da soma e média aritmetica da lista com 10 elementos são respectivamente "+ soma +" e "+ media);
        sc.close();
    }
}
