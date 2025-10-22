import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EntradaeSaida {

	public static void main(String[] args) {

		try {
			// Escrevendo em um arquivo     tmb e possivel colocar um Diretorio
			FileWriter wri = new FileWriter("meuExemplo.txt");
			wri.write("Olá mundo");// grava os Dados
			wri.close();

			// lendo de um arquivo
			FileReader fl = new FileReader("meuExemplo.txt");
			int data = fl.read();

			while (data != -1) {
				
				System.out.print((char) data); // casting paraa ter a saida correta
				data = fl.read();
			}
			fl.close();
		} catch (IOException e) {
			System.out.println("Problema de IO" + e.getMessage());
		}
	}
}