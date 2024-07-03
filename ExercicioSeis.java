import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numeroUm = sc.nextInt();
        System.out.println("Por favor, digite mais um número inteiro");
        int numeroDois = sc.nextInt();
        for (int i = numeroUm + 1; i < numeroDois; i++){
            System.out.println("Os números compreendidos nesse intervalo são " + i);
        }
        sc.close();
    }
}
