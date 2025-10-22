package aulaeatividade.imutabilidade;

public class FinalVariables {
	final int NUMMAXIMO = 100;
	final String MSG = "Bv ao Mundo da programação";
	String txt = "A primeira mensagem sem alteração";
	int num = 0 ;
	
	// metodo exibindo resultado
	public void exibirValoresFinais() {
		System.out.println("Valor do Resultado de um final: " + NUMMAXIMO);
		System.out.println("Valor do Resultado de um final: " + MSG);
		System.out.println("Valor de um atributo de texto sendo alterado : " + txt);
		System.out.println("Valor de Atributo normal: " + num);
	}

	public static void main(String[] args) {
		FinalVariables fv = new FinalVariables();
		fv.exibirValoresFinais();

		// Tentando Alterar-lo
		// fv.NUMMAXIMO = 22; nao é possivel ser alterado
//		fv.MSG = "Não é possivel pois é final ";
		System.out.println(); 
		
		//alterando os atributos sem o final
		fv.txt = "Nova mensagem";
		fv.num = 23;
		fv.exibirValoresFinais();
		
		
	}

}
