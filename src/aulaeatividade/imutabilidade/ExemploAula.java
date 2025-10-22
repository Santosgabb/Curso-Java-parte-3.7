package aulaeatividade.imutabilidade;

public class ExemploAula {
	// Definição de constante - uso de final
	final int CODIGO_FIXO = 10;
	//COMO É A NOMECLATURA DA CONSTANTE EM JAVA
	final int COMO_EXEMPLO_UTILIZADO = 10;

	// Metodo Final nao é possivel ser SOBRESCRITO EM UMA CLASSE FILHA 
	final void meuMetodo() {
		System.out.println("Este metodo é final.");
	}

	public static void main(String[] args) {

		ExemploAula teste = new ExemploAula();

		// teste.CODIGO_FIXO = 555; -> erro de copilação

		// se utilizar o final antes do tipo primitivo da variavel nao é possivel
		// alterar o valor dela
		int variavelLocal = 777;
		variavelLocal = 333;
		System.out.println("Valor da variavel Local");

		System.out.println("Valor da constabte : " + teste.CODIGO_FIXO);
		teste.meuMetodo();

	}

}
