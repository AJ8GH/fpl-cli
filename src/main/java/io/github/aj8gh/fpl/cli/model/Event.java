package io.github.aj8gh.fpl.cli.model;

import java.time.Instant;
import java.util.List;

public record Event(
    int id,
    String name,
    Instant deadlineTime,
    int averageEntryScore,
    boolean finished,
    boolean dataChecked,
    int highestScoringEntry,
    int deadlineTimeEpoch,
    int deadlineTimeGameOffset,
    int highestScore,
    boolean isPrevious,
    boolean isCurrent,
    boolean isNext,
    boolean cupLeaguesCreated,
    boolean h2HKoMatchesCreated,
    int rankedCount,
    List<ChipPlay> chipPlays,
    int mostSelected,
    int mostTransferredIn,
    int topElement,
    TopElementInfo topElementInfo,
    int transfersMade,
    int mostCaptained,
    int mostViceCaptained
) {

}
