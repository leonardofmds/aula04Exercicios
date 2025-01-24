package repositories;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Funcionario;

public class FuncionarioRepositoryJson implements FuncionarioRepository {

	@Override
	public void exportarFuncionario(Funcionario funcionario) {

		ObjectMapper mapper = new ObjectMapper();
		
		File tempFile = new File("C:\\temp\\leonardo\\FuncionarioTemp.json");
		File jsonFile = new File("C:\\temp\\leonardo\\Funcionario.json");
	
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(jsonFile,true));
			mapper.writerWithDefaultPrettyPrinter().writeValue(tempFile,funcionario);
			
			String content = Files.readString(Path.of(tempFile.getPath()));
	
			bufferedWriter.append(content);	
			bufferedWriter.close();			
			System.out.println("Funcionario cadastrado com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro ao cadastrar funcionario");
			System.out.println(e.getMessage());
		}		
	}

}
