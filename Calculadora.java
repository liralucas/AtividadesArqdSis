import java.util.Scanner;

public class Calculadora {

    public static void main (String [] args){
        
        /*SOMA*/
        Scanner entrada = new Scanner (System.in);

        int numero1=0;
        int numero2=0;
        int soma=0;
        

        System.out.print("Digite um numero para somar: ");
        numero1 = entrada.nextInt ();
        
        System.out.print("Digite outro numero para somar: ");
        numero2 = entrada.nextInt();

        soma = numero1+numero2;
        System.out.print("Resultado \n" + soma );
        
        /*SUBTRAÇÃO*/
        Scanner entrada2 = new Scanner (System.in);
        int numero3=0;
        int numero4=0;
        int subtracao;
        
        System.out.print("\n Digite um numero para subtrair: ");
        numero1= entrada2.nextInt();
        System.out.print("Digite outro numero para subtrair: ");
        numero2 = entrada2.nextInt();
        
        subtracao = numero3 - numero4;
        System.out.print("Resultado da subtracao \n" + subtracao);
        
        /*MULTIPLICAÇÃO*/
        Scanner entrada3 = new Scanner (System.in);
        int numero5=0;
        int numero6=0;
        int multiplicacao=0;
        
        System.out.print ("\n Digite um numero para multiplicar: ");
        numero5 = entrada3.nextInt();
        System.out.print ("\n Digite outro numero para multiplicar: ");
        numero6 = entrada3.nextInt();
        
        multiplicacao = numero5 * numero6;
        System.out.print ("Resultado da multiplicacao \n: " + multiplicacao);
        
        /*DIVISÃO*/
        Scanner entrada4 = new Scanner (System.in);
        int numero7=0;
        int numero8=0;
        int divisao=0;
        
        System.out.print ("\n Digite um numero para divisao: ");
        numero7 = entrada4.nextInt();
        System.out.print ("\n Digite outro numero para divisao: ");
        numero8 = entrada4.nextInt();
        
        divisao = numero7 / numero8;
        System.out.print("\n Resultado da divisao: "  + divisao);

    }

}