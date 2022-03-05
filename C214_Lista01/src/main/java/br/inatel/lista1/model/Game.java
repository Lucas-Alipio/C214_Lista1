package br.inatel.lista1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Game {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private String global_sales;
}
