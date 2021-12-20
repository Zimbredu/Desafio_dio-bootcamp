package br.com.dio.desafio;
import java.time.LocalDate;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;


public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);
		
//		Conteudo conteudo =  new Curso(); //Utilizando polimorfismo.
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("menotria de java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
			
	}

}
