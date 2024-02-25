package io.github.aj8gh.fpl.cli.model;

import java.time.ZoneId;
import java.util.List;

public record GameSettings(
    int leagueJoinPrivateMax,
    int leagueJoinPublicMax,
    int leagueMaxSizePublicClassic,
    int leagueMaxSizePublicH2H,
    int leagueMaxSizePrivateH2H,
    int leagueMaxKoRoundsPrivateH2H,
    String leaguePrefixPublic,
    int leaguePointsH2HWin,
    int leaguePointsH2HLose,
    int leaguePointsH2HDraw,
    boolean leagueKoFirstInsteadOfRandom,
    List<Integer> featuredEntries,
    List<Integer> percentileRanks,
    int squadSquadplay,
    int squadSquadsize,
    int squadTeamLimit,
    int squadTotalSpend,
    int uiCurrencyMultiplier,
    boolean uiUseSpecialShirts,
    List<String> uiSpecialShirtExclusions,
    int statsFormDays,
    boolean sysViceCaptainEnabled,
    int transfersCap,
    int transfersSellOnFee,
    List<String> leagueH2HTiebreakStats,
    ZoneId timezone
) {

}
