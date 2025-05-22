package com.example.exadapters;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    public String nome;
    public String franquia;
    public int img;

    public Filme(String nome, String franquia, int img) {
        this.nome = nome;
        this.franquia = franquia;
        this.img = img;
    }

    public static List<Filme> getFilmes(){
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Sonic ", "O Filme", R.drawable.sonic1));
        filmes.add(new Filme("Sonic ", "O Filme 2",R.drawable.sonic2));
        filmes.add(new Filme("Sonic ", "O Filme 3", R.drawable.sonic3));
        filmes.add(new Filme("Senhor dos Aneis ","A Sociedade do Anel", R.drawable.senhor1));
        filmes.add(new Filme("Senhor dos aneis ", "As Duas Torres", R.drawable.senhor2));
        filmes.add(new Filme("Senhor dos aneis ", "O Retorno do Rei", R.drawable.senhor3));

        return filmes;
    }

}
