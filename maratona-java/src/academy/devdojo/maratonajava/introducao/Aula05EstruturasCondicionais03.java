package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {
	// Operador Ternário
	// O operador ternário deve ser usado em locais onde você queira
	// substituir um if/else simples
	
	double salario = 5000;
	boolean isPodeDoar = salario >= 5000;
	
//	COM IF/ELSE
//	String mensagem;
//	if(isPodeDoar) {
//	    mensagem = "Você pode doar";
//	} else {
//	    mensagem = "Você não tem dinheiro suficiente";
//	}
	
	// Com Operador Ternário
	// Como utilizar:
	// (condicao) ? verdadeiro : falso;
	String mensagem = isPodeDoar ? "Você pode doar"
		: "Você não tem dinheiro suficiente";
	
	System.out.println(mensagem+"\n");
	
	System.out.println("======== testeOperadorEncadeado ========");
	// É possível tambem encadear operadores ternários
	// Por exemplo:
	double salarioOperadorEncadeado = 4000;
	String testeOperadorEncadeado = salarioOperadorEncadeado >= 5000 ? "Pode doar"
		: salarioOperadorEncadeado >= 4000 ? "Você não pode doar mas tem alguma coisa"
			: "Você não tem dinheiro";
		
	System.out.println(testeOperadorEncadeado);
    }

}
