package io.github.aj8gh.fpl.cli.model;

import java.util.List;

public record ElementType(
    int id,
    String pluralName,
    String pluralNameShort,
    String singularName,
    String singularNameShort,
    int squadSelect,
    int squadMinPlay,
    int squadMaxPlay,
    boolean uiShirtSpecific,
    List<Integer> subPositionsLocked,
    int elementCount
) {

}
