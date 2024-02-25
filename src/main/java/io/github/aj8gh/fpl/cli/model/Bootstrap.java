package io.github.aj8gh.fpl.cli.model;

import java.util.List;

public record Bootstrap(
    List<Event> events,
    GameSettings gameSettings,
    List<Phase> phases,
    List<Team> teams,
    int totalPlayers,
    List<Element> elements,
    List<ElementStat> elementStats,
    List<ElementType> elementTypes
) {

}
