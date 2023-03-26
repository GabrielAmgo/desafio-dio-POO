package br.com.dio.desafio.dominio;



import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco Pan Developer");
        bootcamp.setDescricao("Se torne um Java developer no Banco Pan");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos pelo Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos pelo Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos pelo Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());


        System.out.println("--------------");


        Dev devCicero = new Dev();
        devCicero.setNome("Felipe");
        devCicero.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos pelo Cícero:" + devCicero.getConteudosInscritos());
        devCicero.progredir();
        devCicero.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos pelo Cícero: " + devCicero.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos pelo Cícero: " + devCicero.getConteudosConcluidos());
        System.out.println("XP: " + devCicero.calcularTotalXp());





    }
}
