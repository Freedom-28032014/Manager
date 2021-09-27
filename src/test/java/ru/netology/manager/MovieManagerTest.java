package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCatalog;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieCatalog first = new MovieCatalog(1, "Movie1", "http1", "action");
    MovieCatalog second = new MovieCatalog(2, "Movie2", "http2", "action");
    MovieCatalog third = new MovieCatalog(3, "Movie3", "http3", "action");
    MovieCatalog fourth = new MovieCatalog(4, "Movie4", "http4", "action");
    MovieCatalog fifth = new MovieCatalog(5, "Movie5", "http5", "action");
    MovieCatalog sixth = new MovieCatalog(6, "Movie6", "http6", "action");
    MovieCatalog seventh = new MovieCatalog(7, "Movie7", "http7", "action");
    MovieCatalog eight = new MovieCatalog(8, "Movie8", "http8", "action");
    MovieCatalog ninth = new MovieCatalog(9, "Movie9", "http9", "action");
    MovieCatalog tenth = new MovieCatalog(10, "Movie10", "http10", "action");
    MovieCatalog eleventh = new MovieCatalog(11, "Movie11", "http11", "action");


    @Test
    void shouldAddedMovie() { ///добавить фильм
        MovieManager manager = new MovieManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        MovieCatalog[] actual = manager.getAll();
        MovieCatalog[] expected = new MovieCatalog[]{third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowEmpty() {
        MovieManager manager = new MovieManager(10);
        MovieCatalog[] actual = manager.getAll();
        MovieCatalog[] expected = new MovieCatalog[]{};
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldGetCurrentFilms() {
        MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieCatalog[] actual = manager.getLastMovie();
        MovieCatalog[] expected = new MovieCatalog[]{eleventh, tenth, ninth, eight, seventh};
        assertArrayEquals(expected, actual);

    }
}