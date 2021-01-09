package com.kodilla.good.patterns.challenges;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        MovieStory movieStory = new MovieStory();
        Map<String, List<String>> movieStoryMap = movieStory.getMovies();

        final String movie = movieStoryMap.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movie);

    }
}

