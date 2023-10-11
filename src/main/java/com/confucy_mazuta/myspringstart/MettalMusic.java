package com.confucy_mazuta.myspringstart;

public class MettalMusic implements Music {
    //Ограничим создание только одного обьекта данного класса с помощью приватного конструктора
    private MettalMusic() {

    }

    public static MettalMusic getMettalMusic() {
        return new MettalMusic();
    }

    private void Init() {
        System.out.println("Init");
    }

    private void Destroy() {
        System.out.println("Destroy");
    }


    @Override
    public String getSong() {

        return "Вообще колонки по пизде пошли";
    }
}
