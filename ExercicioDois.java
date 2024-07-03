import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome de usuário:");
        String usuario = sc.nextLine();
        System.out.println("Digite uma senha:");
        String senha = sc.nextLine();
        while (usuario.equals(senha)){
            System.out.println("E R R O R ! ! !\nDigite uma senha diferente do nome de usuário");
            System.out.println("Digite uma senha:");
            senha = sc.nextLine();
        }
        System.out.println("O usuário " + usuario + " foi cadastrado com sucesso!");
        sc.close();
    }
    
}
