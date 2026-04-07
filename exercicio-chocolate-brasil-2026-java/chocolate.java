//scanner
import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //entrada - variaveis
        System.out.print("Escreva a porcentagem do teor do choclate: ");
        double teor = teclado.nextDouble();

        //comparacao do teor
        if(teor < 25){
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate");
        } else if(teor >= 25 && teor < 35){
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        } else if(teor >= 35){
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }
        
        //entrada
        System.out.println("O é chocolate ao_leite ou amargo? ");
        String tipoChocolate = teclado.next().toLowerCase();
        System.out.println("Escreva o acucar do chocolate: ");
        int acucar = teclado.nextInt();

        //tipo chocolate
        if("ao_leite".equals(tipoChocolate) && acucar > 15){
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        } else {
            System.out.println("Classificação: Chocolate balanceado");
        }

        //entrada
        System.out.println("Qual o preço do ovo de pascoa? ");
        double valorOvoPascoa = teclado.nextDouble();
        System.out.println("Qual a pureza do ovo? ");
        int pureza = teclado.nextInt();

        //valor ovo
        if(valorOvoPascoa > 100 || pureza < 5){
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        } else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }

        //fechar teclado
        teclado.close();
    }
}
