package ru.netology.manager;

import ru.netology.domain.MovieCatalog;


public class MovieManager {

    private MovieCatalog[] items = new MovieCatalog[0];
    private int countFilms = 10; /// количество фильмов

    public MovieManager() {

    }

    public MovieManager(int countFilms) {
        this.countFilms = countFilms;
    }


    public void add(MovieCatalog item) {
        int lenght = items.length + 1;
        MovieCatalog[] tmp = new MovieCatalog[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }


    public MovieCatalog[] getAll() {
        MovieCatalog[] result = new MovieCatalog[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public MovieCatalog[] getLastMovie() {
        int lenght = countFilms;
        if (lenght > items.length) {
            lenght = items.length;
        }

        MovieCatalog[] result = new MovieCatalog[lenght];

        for (int i = 0; i < lenght; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }

        return result;
    }
}
