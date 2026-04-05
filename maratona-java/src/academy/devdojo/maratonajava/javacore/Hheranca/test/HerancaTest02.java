package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
	public static void main(String[] args) {
		/*
		 * ORDEM DE EXECUÇÃO EM HERANÇA NO JAVA
		 *
		 * ================================================================
		 * 1) CARREGAMENTO DAS CLASSES (class loading)
		 * ================================================================
		 * Executado apenas uma vez por classe, quando a JVM precisa usá-la:
		 *    a) Blocos estáticos da SUPERCLASSE (Pessoa)
		 *    b) Inicialização de campos estáticos da superclasse
		 *    c) Blocos estáticos da SUBCLASSE (Funcionario)
		 *    d) Inicialização de campos estáticos da subclasse
		 *
		 * IMPORTANTE:
		 *    A JVM só executa o bloco estático da superclasse quando
		 *    precisa carregar a subclasse, pois carregar Funcionario
		 *    exige carregar Pessoa primeiro.
		 *
		 * ================================================================
		 * 2) CRIAÇÃO DO OBJETO (new)
		 * ================================================================
		 * Executado TODA VEZ que um novo objeto é instanciado:
		 *
		 *   PASSO 1 — ALOCAÇÃO DE MEMÓRIA (Heap)
		 *      - A JVM reserva um bloco contínuo no Heap para o objeto
		 *        contendo: campos da superclasse + campos da subclasse.
		 *
		 *   PASSO 2 — VALORES DEFAULT
		 *      - Antes de QUALQUER código seu rodar, todos os atributos
		 *        recebem valores padrão:
		 *   int → 0
		 *   double → 0.0
		 *   boolean → false
		 *   objetos → null
		 *
		 *   PASSO 3 — INICIALIZAÇÃO DA SUPERCLASSE (ordem garantida)
		 *      a) Blocos de instância da SUPERCLASSE (Pessoa)
		 *      b) Inicialização de campos da superclasse
		 *      c) Construtor da SUPERCLASSE (Pessoa)
		 *
		 *   PASSO 4 — INICIALIZAÇÃO DA SUBCLASSE
		 *      d) Blocos de instância da SUBCLASSE (Funcionario)
		 *      e) Inicialização de campos da subclasse
		 *      f) Construtor da SUBCLASSE (Funcionario)
		 *
		 * ================================================================
		 * RESUMO:
		 *    - Inicialização estática (class loading):
		 *  Super → Sub     (executado 1 vez)
		 *
		 *    - Inicialização de instância (new):
		 *  Super → Sub     (executado a cada criação de objeto)
		 *
		 * ================================================================
		 * OBSERVAÇÃO:
		 *    A subclasse só executa seus blocos de instância e seu
		 *    construtor DEPOIS que a superclasse tiver concluído:
		 *       - blocos de instância
		 *       - inicialização de campos
		 *       - construtor
		 *
		 *    Isso garante que a parte “Pessoa” do objeto esteja totalmente
		 *    pronta antes de iniciar a parte “Funcionario”.
		 */
		Funcionario funcionario = new Funcionario("Joaquin");
	}
}
