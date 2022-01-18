package segundoDesafio;

public class Fibonacci {

    public static void main(String[] args){

        int[] numeros = {1, -1, 0, 5, 9, 34, 53, 55, 2584, 3000};

        for(int n: numeros){
            if(testFibonacci(n)){
                System.out.println("O número " + n + " pertence a sequência de Fibonacci");
            }else{
                System.out.println("O número " + n + " não pertence a sequência de Fibonacci");
            }
        }

    }


    public static boolean testFibonacci(int n){

        if(n < 0){
            return false;
        }else if( n == 0 || n == 1){
            return true;
        }else {

            int n1 = 0;
            int n2 = 1;
            int n3 = 0;

            while(n > n3){

                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

            }
            if ( n == n3){
                return true;
            }else{
                return false;
            }


        }


    }


}
