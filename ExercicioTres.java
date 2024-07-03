import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nome = sc.next();
        while (nome.length() <= 3 ){
            System.out.println("E R R O R ! ! !\nPreencha o nome corretamente!");
            System.out.println("Insira o seu nome:");
            nome = sc.next();
        }
        System.out.println("Insira a sua idade:");
        int idade = sc.nextInt();
        while (idade < 0 || idade > 150){
            System.out.println("E R R O R ! ! !\nPreencha a idade corretamente!");
            System.out.println("Insira a sua idade:");
            idade = sc.nextInt();
        }
        System.out.println("Insira o seu salário:");
        float salario = sc.nextFloat();
        while (salario <= 0 ){
            System.out.println("E R R O R ! ! !\nPreencha o salário corretamente!");
            System.out.println("Insira o seu salário:");
            salario = sc.nextFloat();
        }
        System.out.println("Insira o seu sexo:\nf - Feminino\nm - Masculino");
        String sexo = sc.next();
        while (!sexo.equals("f") && !sexo.equals("m")){
            System.out.println("E R R O R ! ! !\nPreencha o seu sexo corretamente!");
            System.out.println("Insira o seu sexo:\nf - Feminino\nm - Masculino");
            sexo = sc.next();
        }
        System.out.println("Insira o seu estado civil:\ns- Solteiro(a)\nc- Casado(a)\nv- Viuvo(a)\nd- Divorciado(a)");
        String estadoCivil = sc.next();
        while ( estadoCivil.charAt(0) != 's' && estadoCivil.charAt(0) != 'c' && estadoCivil.charAt(0) != 'v' && estadoCivil.charAt(0) != 'd') {
            System.out.println("E R R O R ! ! !\n Preencha o estado civil corretamente:");
            System.out.println("Insira o seu estado civil:\ns- Solteiro(a)\nc- Casado(a)\nv- Viuvo(a)\nd- Divorciado(a)");
            estadoCivil = sc.next();
        }
        sc.close();
        
    }
}