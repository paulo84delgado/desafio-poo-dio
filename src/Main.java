import br.com.dio.desafio.dominio.*;

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

        /*
        //Exibindo curso 1 (Java)
        System.out.println(curso1);
        //Exibindo curso 2 (JavaScript)
        System.out.println(curso2);
        //Exibindo mentoria (java)
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devZelda = new Dev();
        devZelda.setNome("Zelda");
        devZelda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Zelda" + devZelda.getConteudosInscritos());
        devZelda.progredir();
        devZelda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Zelda" + devZelda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Zelda" + devZelda.getConteudosConcluidos());
        System.out.println("XP: " +devZelda.calcularTotalXp());

        System.out.println("-------");

        Dev devLink = new Dev();
        devLink.setNome("Link");
        devLink.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Link" + devLink.getConteudosInscritos());
        devLink.progredir();
        devLink.progredir();
        devLink.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Link" + devLink.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Link" + devLink.getConteudosConcluidos());
        System.out.println("XP: " +devLink.calcularTotalXp());

    }
}
