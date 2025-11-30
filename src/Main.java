import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Criando curso 1 (Java)
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        //Criando curso 2 (JavaScript)
        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);
        //Criando mentoria (java)
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //Exibindo curso 1 (Java)
        System.out.println(curso1);
        //Exibindo curso 2 (JavaScript)
        System.out.println(curso2);
        //Exibindo mentoria (java)
        System.out.println(mentoria);
    }
}
