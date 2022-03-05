package br.inatel.lista1;

import br.inatel.lista1.model.Game;
import br.inatel.lista1.model.Platform;
import br.inatel.lista1.model.Publisher;
import br.inatel.lista1.service.ServiceGame;
import br.inatel.lista1.utils.CSVutils;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        Path caminho = null;
        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        List<Game> gameList = CSVutils.readGameCsv(caminho);

        int numLines = gameList.size();
        System.out.println("Numero de linhas: " + numLines);

        List<Game> ps2Games = ServiceGame.getListByPlatform(gameList, Platform.PS2);
        System.out.println("Numero de jogos de ps2: " + ps2Games.size());
        ps2Games.forEach(e -> System.out.println(e.getName()));//imprimindo o nome dos jogos de ps2
        System.out.println("----------------------------------------------------------------");

        List<Game> nintendoGames = ServiceGame.getListByPublisher(gameList, Publisher.Nintendo);
        System.out.println("Numero de jogos da Nintendo: " + nintendoGames.size());
        nintendoGames.forEach(e -> System.out.println(e.getName()));//imprimindo o nome dos jogos da nintendo
    }
}
