package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        * O que são Tipos Primitivos?
        * Resposta: São tipos que guardam em memória um valor simples.
        * Todos tipos exceto o boolean podem ser considerado númericos.
        * O tipo char pode receber números baseados na tabela ASCII ou aspas simples com
        * caracteres dentro no formato tradicional ou UNICODE.
        * Por exemplo:
        * char tradicional = 'M';
        * char ASCII = 77;
        * char UNICODE = '\u004D'; (Observação: para que seja possível colocar caracteres UNICODE
        *  é necessário usar "[CONTRABARRA]u" antes do código UNICODE.
        * Tipos de variáveis primitivas no Java
        * byte, short, int, long, float, double, char, boolean */
        byte idadeByte = 127;
        short idadeShort = 32767;
        int age = 20;
        long numeroGrande = 1000000000;
        float salarioFloat = 1000;
        double salario = 2000.99;
        boolean verdadeiro = true;
        boolean falso = false;
        char charAscii = 77;
        char charUnicode = '\u004D';
        System.out.println("Eu tenho " + age + " anos de idade!");
        System.out.println("ascii : " + charAscii);
        System.out.println("unicode : " + charUnicode);
        System.out.println("Teste unicode Japônes : " + '\u5420');

        // CASTING
        int castInt = (int) 100000000000L;
        System.out.println("\nValor em memória pós casting: " + castInt);

        // CASTING DO DOUBLE E INT PARA LONG
        System.out.println("\nConvertendo um double para um long: " + (long) salario);
        System.out.println("Convertendo um double para um int: " + (int) salario);
    }
}
