import java.time.LocalDate;
import dio.*;
public class Main{
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        BootCamp bootcamp = new BootCamp("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devRoger = new Devs();
        devRoger.setNome("Roger");
        devRoger.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devRoger.getConteudosInscritos());
        devRoger.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos " + devRoger.getConteudosConcluidos());
        System.out.println("XP: " + devRoger.calcularTotalXp());

        System.out.println("-------");

        Devs devJunior = new Devs();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJunior.getConteudosInscritos());
        devJunior.progredir();
        devJunior.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos " + devJunior.getConteudosConcluidos());
        System.out.println("XP: " + devJunior.calcularTotalXp());

    }
}