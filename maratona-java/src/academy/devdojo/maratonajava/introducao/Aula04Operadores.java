package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Os Operadores na linguagem de programação Java são símbolos que são utilizados para executar
        // diversos tipos operações diferentes.

        /* Os operadores aritméticos permitem realizar contas de matemática entre váriaveis
           Por exemplo:
           Adição: (+)
           Subtração: (-)
           Divisão: (/)
           Multiplicação: (*)
           Resto: (%)
        */

        // Siga abaixo os exemplos para cada operador aritmético
        int numero1 = 20;
        int numero2 = 40;

        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        int subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);

        int multiplicao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicao);

        int divisaoEntreNumerosInteiros = numero1 / numero2;
        System.out.println("\nA divisão de números inteiros, resulta em um número inteiro no java: "
                + divisaoEntreNumerosInteiros);
        System.out.println("Até mesmo se nós realizarmos o casting do resultado para double ou float após a divisão: "
                + (double) divisaoEntreNumerosInteiros);
        double divisaoEntreInteiroEDouble = numero1 / (double) numero2;
                System.out.println("\nPara resolver esse problema, basta que um dos números na divisão seja " +
                "um double ou float: " + divisaoEntreInteiroEDouble);

        /* Extra
           Em uma divisão entre dois números inteiros, não existe ponto flutuante
           Segue abaixo um exemplo:
        */

        // 20 / 40 = 0,5
        // Porém como é uma divisão entre números inteiros não há ponto flutuante no resultado,
        // mesmo armazenando o resultado um double ou float
        double divisaoEntreInteirosConvertidoParaDouble = numero1 / numero2;
        System.out.println("\nDivisão entre números inteiros convertido para double: " +
                divisaoEntreInteirosConvertidoParaDouble);

        // Caso um dos valores seja um double ou um float o problema será resolvido
        double divisaoEntreInteirosConvertidoParaDoubleComCasting = numero1 / (double) numero2;
        System.out.println("Divisão entre números inteiros convertido para double com casting em " +
                "um dos números: " + divisaoEntreInteirosConvertidoParaDoubleComCasting + "\n");

        /*
            O operador "+" é sobrecarregado no Java, o que significa que ele se comporta de
            maneiras diferentes conforme a entrada de dados.

            Por exemplo, quando o operador "+" é usado com números, ele realiza a operação
            aritmética de soma dos mesmos.

            No entanto, quando o operador "+" é usado entre strings e outros tipos, o resultado
            é uma concatenação.

            Assim, ao ser "executado", o código à direita da string que contém o operador "+"
            é considerado como parte da concatenação.

            Segue um exemplo abaixo:
        */

        System.out.println(10 + 20 + "Texto" + 10 + 20); // Resultado -> "30Texto1020"

        // Operador de resto (%)
        int numerador = 21;
        int denominador = 2;
        int restoDaDivisao = numerador % denominador;
        System.out.println("\nResto da divisão de " + numerador + " / " + denominador + " = " + restoDaDivisao);

        // Operadores Relacionais
        // São utilizados para comparar valores.
        // Só pode ser utilizado entre tipos comparaveis.
        /*
            - Maior (>)
            - Maior ou igual (>=)
            - Menor (<)
            - Menor ou igual (<=)
         */

        // Existe um padrão no Java que diz a respeito a nomenclatura de váriaveis booleanas, elas devem começar com "is", segue um exemplo abaixo:
        boolean isDezMaiorQue20 = 10 > 20;
        System.out.println("\nisDezMaiorQue20 = " + isDezMaiorQue20);

        boolean isDezMenorQue20 = 10 < 20;
        System.out.println("isDezMenorQue20 = " + isDezMenorQue20);

        // Operadores de igualdade e desigualdade
        // São utilizados para comparar valores.
        // Só pode ser utilizado entre tipos comparaveis.
        /*
            - Igual (==)
            - Diferente (!=)
         */

        boolean isDezIgualA20 = 10 == 20;
        System.out.println("isDezIgualA20 = " + isDezIgualA20);

        boolean isDezIgualA10 = 10 == 10;
        System.out.println("isDezIgualA10 = " + isDezIgualA10);

        boolean isDezDiferenteDe10 = 10 != 10;
        System.out.println("isDezDiferenteDe10 = " + isDezDiferenteDe10);

        // Operadores Lógicos
        // Existem 3 Tipos de Operadores Lógicos:
        /*
            - AND (&&): Todos os elementos validados com AND precisam ser TRUE para resultar em TRUE.
            - OR (||): Apenas um dos elementos precisa ser TRUE para resultar em TRUE.
            - NOT (!): O elemento precisa ser FALSE para resultar em TRUE.
         */
        // Exemplos:
        int idade = 30;
        double salario = 4000;
        boolean isDentroDaLeiMaiorQue30Anos = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30Anos = idade < 30 && salario >= 3381;
        boolean isDentroDeUmaDasLeis = isDentroDaLeiMaiorQue30Anos || isDentroDaLeiMenorQue30Anos;
        System.out.println("\nidade = " + idade + ", salario = " + salario);
        System.out.println("isDentroDaLeiMaiorQue30Anos = " + isDentroDaLeiMaiorQue30Anos);
        System.out.println("isDentroDaLeiMenorQue30Anos = " + isDentroDaLeiMenorQue30Anos);
        System.out.println("isDentroDeUmaDasLeis = " + isDentroDeUmaDasLeis);

        double valorTotalContaCorrente = 6000;
        double valorTotalContePoupanca = 6.99;
        float valorPlaystation5 = 4999.99F;

        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorPlaystation5 || valorTotalContePoupanca >= valorPlaystation5;
        System.out.println("\nisPlaystation5Compravel = " + isPlaystation5Compravel);

        // Operadores de atribuição
        // Os operadores de atribuição foram criados para você poder atribuir valores a variáveis
        /*
            - (=)
            // Operadores aritméticos (Atribui a variável de forma abreviada usando uma operação aritmética)
            - (+=)
            - (-=)
            - (*=)
            - (/=)
            - (%=)
         */
        // Exemplos:
        double bonus = 1000;
        System.out.println("\nbonus = "+bonus);
        bonus += 2000; // bonus = bonus + 2000;
        System.out.println("bonus (bonus += 2000) = "+bonus);
        bonus -= 2000; // bonus = bonus - 2000;
        System.out.println("bonus (bonus -= 2000) = "+bonus);
        bonus *= 2; // bonus = bonus * 2;
        System.out.println("bonus (bonus *= 2) = "+bonus);
        bonus /= 2; // bonus = bonus / 2;
        System.out.println("bonus (bonus /= 2) = "+bonus);
        bonus %= 2; // bonus = bonus % 2;
        System.out.println("bonus (bonus %= 2) = "+bonus);

        // Operadores Unários
        int incrementador = 0;
        System.out.println("\nincrementador = "+incrementador);
        // incrementador = incrementador + 1; OR incrementador += 1;
        incrementador++;
        System.out.println("incrementador (incrementador++) = "+incrementador);
        // incrementador = incrementador - 1; OR incrementador -= 1;
        incrementador--;
        System.out.println("incrementador (incrementador--) = "+incrementador);
    }
}
