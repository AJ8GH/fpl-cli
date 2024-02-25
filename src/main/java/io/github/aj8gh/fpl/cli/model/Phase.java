package io.github.aj8gh.fpl.cli.model;

public record Phase(
    int id,
    String name,
    int startEvent,
    int stopEvent
) {

}
