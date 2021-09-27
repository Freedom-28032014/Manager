package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MovieCatalog {
    private int Id;
    private String movieName;
    private String movieUrl;
    private String movieGenre;

}
