package br.inatel.lista1.service;

import br.inatel.lista1.model.Game;
import br.inatel.lista1.model.Platform;
import br.inatel.lista1.model.Publisher;

import java.util.ArrayList;
import java.util.List;

public class ServiceGame {
    public static List<Game> getListByPlatform(List<Game> games, Platform platform){
        List<Game> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game -> game.getPlatform().equals(platform.name()))).
                forEach(game -> gamesByPlatform.add(game));

        return gamesByPlatform;
    }

    public static List<Game> getListByPublisher(List<Game> games, Publisher publisher){
        List<Game> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game -> game.getPublisher().equals(publisher.name()))).
                forEach(game -> gamesByPublisher.add(game));

        return gamesByPublisher;
    }

}
