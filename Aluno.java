import java.util.Scanner;

public class Aluno {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print ("Digite professor se você for professor e aluno se você for aluno:");
        String usuario = sc.nextLine();
        if(usuario.equalsIgnoreCase("Professor")){
        System.out.print ("Opção invalida");
        
    }else if (usuario.equalsIgnoreCase("Aluno")){
        System.out.print ("Digite o seu nome:");
        String nome = sc.nextLine ();
        System.out.print ("Digite a sua idade:");
        int idade = sc.nextInt ();
        System.out.print ("Digite o seu RA:");
        int RA = sc.nextInt ();
        System.out.print ("Digite seu email:");
        String email = sc.nextLine ();
        System.out.print ("Ola Aluno " + nome + "Seja Bem Vindo ! ");

}
    sc.close();
}
}

