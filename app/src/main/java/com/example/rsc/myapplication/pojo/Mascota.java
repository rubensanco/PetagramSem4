package com.example.rsc.myapplication.pojo;

import java.io.Serializable;


public class Mascota implements Serializable{
    private boolean favorito;
    private String nombre;
    private int imagen;
    private int likes;

    public Mascota(String nombre, int imagen, int likes) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.likes = likes;
    }

    public Mascota(String nombre, int imagen, int likes, boolean favorito) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.likes = likes;
        this.favorito = favorito;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void sumaLike () {
        this.likes = this.likes + 1;
    }
}
