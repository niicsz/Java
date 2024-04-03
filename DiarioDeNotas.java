import java.util.Scanner;

public class DiarioDeNotas {

public static void main(String[] args){

    Scanner sc = new Scanner (System.in);

    System.out.print ("Digite professor se você for professor e aluno se você for aluno:");
    String usuario = sc.nextLine ();

    if(usuario.equalsIgnoreCase("Professor")){

    System.out.print ("Digite o seu nome:");
    String nome = sc.nextLine ();

    System.out.print ("Ola Professor " + nome + " Seja Bem Vindo ! ");

    System.out.print ("Digite a  Nota A1:");
    int A1 = sc.nextInt ();
    System.out.print ("Digite a Nota A2:");
    int A2 = sc.nextInt ();
    System.out.print ("Digite a Nota A3:");
    int A3 = sc.nextInt ();

    int soma = A1 + A2 + A3;
    System.out.print (" A soma é " + soma);


}else if (usuario.equalsIgnoreCase("Aluno")){

    System.out.print ("Digite o seu nome:");
    String nome = sc.nextLine ();
    System.out.print ("Ola Aluno " + nome + "Seja Bem Vindo ! ");
}else{
    System.out.print ("Opção invalida");

}
    sc.close();
}
}
