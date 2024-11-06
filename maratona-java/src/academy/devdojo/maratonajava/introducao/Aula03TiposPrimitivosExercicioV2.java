package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicioV2 {
    public static void main(String[] args) {
	String nome = "Paulo", endereco = "Rua Magalhães, 34", data = "03/12/2023";

	// O ideal para trabalhar com valores de moeda é o BigDecimal, porém para esse
	// exemplo
	// vamos trabalhar com o tipo primitivo double
	double salario = 4233.50;

	String mensagemRelatorio = "Eu " + nome + ", morando no endereço " + endereco
		+ ", confirmo que recebi o salário de " + salario + ", na data " + data;

	System.out.println(mensagemRelatorio);
    }
}
