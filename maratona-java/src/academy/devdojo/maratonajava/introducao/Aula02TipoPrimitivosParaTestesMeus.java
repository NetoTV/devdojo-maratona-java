package academy.devdojo.maratonajava.introducao;

public class Aula02TipoPrimitivosParaTestesMeus {
    public static void main(String[] args){
        /*
        Esses são os tipos primitivos em java:
        - int
        - double
        - float
        - char
        - byte
        - short
        - long
        - boolean

        existem 8 no total
        */
        int minhaIdade = 20;
        System.out.println("Minha idade é " + minhaIdade + " anos.");

        // Declarando
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        byte umByte = 10; // 1 byte
        int idade = 10; // 4 bytes
        long numeroLongo = 999999999999999999L; // 8 bytes
        double numeroDecimal = 29.99; // 8 bytes
        float numeroFlutuante = 29.99F; // 4 bytes
        // char 2 bytes
        char caractere = 'O'; // ou unicode = '\u004F'; ou ascii = 79;
        char caractereComUnicode = '\u004F';
        char caractereComAscii = 79;
        System.out.println(numeroDecimal + caractere); // o char é um número em memória
        System.out.println(caractere);

        // Casting
        // Fazendo arte
        int idadeLongParaInt = (int) 10000000000L; // Vai cortar os bits até que caiba na
        // váriavel. Obs: Não é facilmente prevísivel
        long numeroDoubleParaLong = (long) 999.99; // vai cortar todos numeros após o "."

        System.out.println(idadeLongParaInt);
        System.out.println(numeroDoubleParaLong); // cortou o decimal

        float numeroDoubleParaFloat = (float) 3789.99;

        System.out.println("Float = " + numeroDoubleParaFloat); // foi normal pois o número coube
        // em memória

        // Convenção para valores
        // float = 999.99F; com F maiúsculo no final quando tiver número decimal
        // double = 259.89D; com ou sem D maiúsculo no final (O padrão de numeros com ponto é
        // serem do tipo double)
        // long = 100000000000000L; com L maiúsculo no final quando o valor for muito grande para
        // caber em um Integer (int) (4 bytes)

        // Por padrão no java quando você escreve um número inteiro ele é reconhecido como um
        // Integer (inteiro), ou seja caso você queira colocar um valor long
        // Por exemplo:
        //
        // long numero = 100000000000000; // O compilador irá reclamar falando que o número do tipo
        // Integer é muito grande, e por conta disso você deve colocar no final do número
        // a letra L para indicar de forma explícita que o valor númerico é um long.
        //
        // Caso o valor Long seja menor ao ponto de caber dentro de (int), não é necessário colocar
        // o L maiúsculo no final do valor declarado.
        //
        // Esse comportamento não ocorre para as variavéis do tipo byte e short.
        //
        // no caso de valores com ponto decimal, eles são reconhecidos como double, ou seja,
        // caso você queira colocar um valor com ponto decimal do tipo float você deve fazer da
        // seguinte forma:
        //
        // float variavelFloat = 2999.99F; // O Compilador irá reclamar caso você não coloque o F
        // no final, pois irá reconhecer o mesmo como um double.

        // Tipo String
        // O tipo String não é um tipo primitivo
        // no java o String é uma classe e ele é um tipo de referência (Reference Type)
        // Ele serve para armazenar textos em memória por meio de uma variável
        // Sintaxe:
        String nome = "Paulo";
        System.out.println("\nOlá meu nome é " + nome);


    }
}
