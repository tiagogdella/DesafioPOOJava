package DesafioPOOJava.src;

import java.time.LocalDate;
import DesafioPOOJava.src.br.com.dio.desafio.dominio.Curso;
import DesafioPOOJava.src.br.com.dio.desafio.dominio.Mentoria;
import DesafioPOOJava.src.br.com.dio.desafio.dominio.Bootcamp;
import DesafioPOOJava.src.br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.getCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("javascript");
        curso1.getCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("DEscrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BOotcamp Java Developer");
        bootcamp.setDescricao("DEscrição Bootcamp Java DEv");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp((bootcamp));
        System.out.println("COnteudos inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("COnteudos concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());

        System.out.println("-------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("COnteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("COnteudos cONCLUIDOS" + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }

}
