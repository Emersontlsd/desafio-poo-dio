import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEmerson = new Dev();
        devEmerson.setNome("Emerson");
        devEmerson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Emerson: " + devEmerson.getConteudosInscritos());
        devEmerson.progredir();
        devEmerson.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Emerson: " + devEmerson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Emerson: " + devEmerson.getConteudosConcluidos());
        System.out.println("XP: " + devEmerson.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------");

        Dev devMicaela = new Dev();
        devMicaela.setNome("Micaela");
        devMicaela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Micaela: " + devMicaela.getConteudosInscritos());
        devMicaela.progredir();
        devMicaela.progredir();
        devMicaela.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Micaela: " + devMicaela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Micaela: " + devMicaela.getConteudosConcluidos());
        System.out.println("XP: " + devMicaela.calcularTotalXp());


    }
}
