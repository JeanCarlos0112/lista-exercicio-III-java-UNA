import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor inteiro para a " + (i + 1)+"ª" + " posição da lista.");
            int valor = sc.nextInt();
            array[i] = valor;
        }
        int contador = 0;
        int contador1 = 0;
        for(int i = 0; i < 10; i++){
            if(array[i] % 2 == 0){
                contador++;
            }
            else{
                contador1++;
            }
        }
        System.out.println("A quantidade de números par é " + contador + " e a quantidade de números impares é " + contador1);
    }
}