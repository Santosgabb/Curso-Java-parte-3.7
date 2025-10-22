package atv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploIO {

	// metodos
	public void escreverArquivo(String diretorio, String msg) throws IOException {
		FileWriter writer = new FileWriter(diretorio);
		writer.write(msg);
		writer.close();
	}

	public void lerArquivo(String diretorio) {
		FileReader reader;
		try {
			reader = new FileReader(diretorio);
			int data = reader.read();
			while (data != -1) {

				System.out.print((char) data);
				
				data = reader.read();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}