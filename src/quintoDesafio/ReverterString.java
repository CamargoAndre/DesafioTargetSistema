package quintoDesafio;

public class ReverterString {

    public static void main(String[] args){

        System.out.println(reverseString("Teste"));
        System.out.println(reverseString("Este texto e maior"));
        System.out.println(reverseString("etset"));
        System.out.println(reverseString("o resultado inverso"));

    }

    public static String reverseString(String s) {

        String inverter = "";

        for (int i = s.length() - 1; i >= 0 ; i--){
            inverter += s.charAt(i);
        }

        return inverter;

    }
}
