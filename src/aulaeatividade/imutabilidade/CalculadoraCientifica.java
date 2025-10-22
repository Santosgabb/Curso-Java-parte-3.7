package aulaeatividade.imutabilidade;

public class CalculadoraCientifica extends Calculadora {
	/*
	 * final int somar(int a , int b) { return a+b ; } Não é possivel pois o metodo
	 * nao pode ser sobrescrito, pois so tem uma forma de ser utilizado
	 */

	public static void main(String[] args) {
		 Calculadora calculadora = new Calculadora();
		 System.out.println("Resultado do Metodo da Classe Calculadora: " + calculadora.somar(5, 4));
		 
	}
}
