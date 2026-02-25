package DesafioPOOJava.src.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
    
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public String getTitulo() {
    return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
    return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getCargaHoraria(int hora) {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria
                + "]";
    }

}