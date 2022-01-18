package primeiroDesafio;

public class Soma {

   public static void main(String[] args){

       int indice = 13;
       int soma = 0;
       int k = 0;

       while(k < indice){

           k++;
           soma = soma + k;
       }
        // o Resultado da Soma é 91
       System.out.println("O valor da soma é: " + soma);

   }
}
