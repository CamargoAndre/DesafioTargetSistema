package terceiroDesafio;

import java.util.List;

public class Main {

    public static void main(String[] args){

        DadosJson dadosJson = new DadosJson();
        List<Faturamento> list = dadosJson.lista();

        double menorValor = list.get(0).getValor();
        double maiorValor = 0;
        int diasUteis = 0;
        double total = 0;

        for(Faturamento f: list){
            total = total + f.getValor();

            if(f.getValor() != 0){
                diasUteis = diasUteis + 1;

                if(f.getValor() > maiorValor){
                    maiorValor = f.getValor();
                }
                if(f.getValor() < menorValor){
                    menorValor = f.getValor();

                }
            }
        }

        double media = total/diasUteis;

        int qtdeMaiorMedia = 0;

        for(Faturamento f: list){
            if(f.getValor() > media){
                qtdeMaiorMedia = qtdeMaiorMedia +1;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: "+ menorValor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: "+ maiorValor);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "+ qtdeMaiorMedia);



    }




}
