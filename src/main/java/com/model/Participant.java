
package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assists",
    "baronKills",
    "bountyLevel",
    "challenges",
    "champExperience",
    "champLevel",
    "championId",
    "championName",
    "championTransform",
    "consumablesPurchased",
    "damageDealtToBuildings",
    "damageDealtToObjectives",
    "damageDealtToTurrets",
    "damageSelfMitigated",
    "deaths",
    "detectorWardsPlaced",
    "doubleKills",
    "dragonKills",
    "eligibleForProgression",
    "firstBloodAssist",
    "firstBloodKill",
    "firstTowerAssist",
    "firstTowerKill",
    "gameEndedInEarlySurrender",
    "gameEndedInSurrender",
    "goldEarned",
    "goldSpent",
    "individualPosition",
    "inhibitorKills",
    "inhibitorTakedowns",
    "inhibitorsLost",
    "item0",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "item6",
    "itemsPurchased",
    "killingSprees",
    "kills",
    "lane",
    "largestCriticalStrike",
    "largestKillingSpree",
    "largestMultiKill",
    "longestTimeSpentLiving",
    "magicDamageDealt",
    "magicDamageDealtToChampions",
    "magicDamageTaken",
    "neutralMinionsKilled",
    "nexusKills",
    "nexusLost",
    "nexusTakedowns",
    "objectivesStolen",
    "objectivesStolenAssists",
    "participantId",
    "pentaKills",
    "perks",
    "physicalDamageDealt",
    "physicalDamageDealtToChampions",
    "physicalDamageTaken",
    "profileIcon",
    "puuid",
    "quadraKills",
    "riotIdName",
    "riotIdTagline",
    "role",
    "sightWardsBoughtInGame",
    "spell1Casts",
    "spell2Casts",
    "spell3Casts",
    "spell4Casts",
    "summoner1Casts",
    "summoner1Id",
    "summoner2Casts",
    "summoner2Id",
    "summonerId",
    "summonerLevel",
    "summonerName",
    "teamEarlySurrendered",
    "teamId",
    "teamPosition",
    "timeCCingOthers",
    "timePlayed",
    "totalDamageDealt",
    "totalDamageDealtToChampions",
    "totalDamageShieldedOnTeammates",
    "totalDamageTaken",
    "totalHeal",
    "totalHealsOnTeammates",
    "totalMinionsKilled",
    "totalTimeCCDealt",
    "totalTimeSpentDead",
    "totalUnitsHealed",
    "tripleKills",
    "trueDamageDealt",
    "trueDamageDealtToChampions",
    "trueDamageTaken",
    "turretKills",
    "turretTakedowns",
    "turretsLost",
    "unrealKills",
    "visionScore",
    "visionWardsBoughtInGame",
    "wardsKilled",
    "wardsPlaced",
    "win"
})
public class Participant {

    @JsonProperty("basicPings")
    private String basicPings;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("baronKills")
    private Integer baronKills;
    @JsonProperty("bountyLevel")
    private Integer bountyLevel;
    @JsonProperty("challenges")
    private Challenges challenges;
    @JsonProperty("champExperience")
    private Integer champExperience;
    @JsonProperty("champLevel")
    private Integer champLevel;
    @JsonProperty("championId")
    private Integer championId;
    @JsonProperty("championName")
    private String championName;
    @JsonProperty("championTransform")
    private Integer championTransform;
    @JsonProperty("consumablesPurchased")
    private Integer consumablesPurchased;
    @JsonProperty("damageDealtToBuildings")
    private Integer damageDealtToBuildings;
    @JsonProperty("damageDealtToObjectives")
    private Integer damageDealtToObjectives;
    @JsonProperty("damageDealtToTurrets")
    private Integer damageDealtToTurrets;
    @JsonProperty("damageSelfMitigated")
    private Integer damageSelfMitigated;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("detectorWardsPlaced")
    private Integer detectorWardsPlaced;
    @JsonProperty("doubleKills")
    private Integer doubleKills;
    @JsonProperty("dragonKills")
    private Integer dragonKills;
    @JsonProperty("eligibleForProgression")
    private Boolean eligibleForProgression;
    @JsonProperty("firstBloodAssist")
    private Boolean firstBloodAssist;
    @JsonProperty("firstBloodKill")
    private Boolean firstBloodKill;
    @JsonProperty("firstTowerAssist")
    private Boolean firstTowerAssist;
    @JsonProperty("firstTowerKill")
    private Boolean firstTowerKill;
    @JsonProperty("gameEndedInEarlySurrender")
    private Boolean gameEndedInEarlySurrender;
    @JsonProperty("gameEndedInSurrender")
    private Boolean gameEndedInSurrender;
    @JsonProperty("goldEarned")
    private Integer goldEarned;
    @JsonProperty("goldSpent")
    private Integer goldSpent;
    @JsonProperty("individualPosition")
    private String individualPosition;
    @JsonProperty("inhibitorKills")
    private Integer inhibitorKills;
    @JsonProperty("inhibitorTakedowns")
    private Integer inhibitorTakedowns;
    @JsonProperty("inhibitorsLost")
    private Integer inhibitorsLost;
    @JsonProperty("item0")
    private Integer item0;
    @JsonProperty("item1")
    private Integer item1;
    @JsonProperty("item2")
    private Integer item2;
    @JsonProperty("item3")
    private Integer item3;
    @JsonProperty("item4")
    private Integer item4;
    @JsonProperty("item5")
    private Integer item5;
    @JsonProperty("item6")
    private Integer item6;
    @JsonProperty("itemsPurchased")
    private Integer itemsPurchased;
    @JsonProperty("killingSprees")
    private Integer killingSprees;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("lane")
    private String lane;
    @JsonProperty("largestCriticalStrike")
    private Integer largestCriticalStrike;
    @JsonProperty("largestKillingSpree")
    private Integer largestKillingSpree;
    @JsonProperty("largestMultiKill")
    private Integer largestMultiKill;
    @JsonProperty("longestTimeSpentLiving")
    private Integer longestTimeSpentLiving;
    @JsonProperty("magicDamageDealt")
    private Integer magicDamageDealt;
    @JsonProperty("magicDamageDealtToChampions")
    private Integer magicDamageDealtToChampions;
    @JsonProperty("magicDamageTaken")
    private Integer magicDamageTaken;
    @JsonProperty("neutralMinionsKilled")
    private Integer neutralMinionsKilled;
    @JsonProperty("nexusKills")
    private Integer nexusKills;
    @JsonProperty("nexusLost")
    private Integer nexusLost;
    @JsonProperty("nexusTakedowns")
    private Integer nexusTakedowns;
    @JsonProperty("objectivesStolen")
    private Integer objectivesStolen;
    @JsonProperty("objectivesStolenAssists")
    private Integer objectivesStolenAssists;
    @JsonProperty("participantId")
    private Integer participantId;
    @JsonProperty("pentaKills")
    private Integer pentaKills;
    @JsonProperty("perks")
    private Perks perks;
    @JsonProperty("physicalDamageDealt")
    private Integer physicalDamageDealt;
    @JsonProperty("physicalDamageDealtToChampions")
    private Integer physicalDamageDealtToChampions;
    @JsonProperty("physicalDamageTaken")
    private Integer physicalDamageTaken;
    @JsonProperty("profileIcon")
    private Integer profileIcon;
    @JsonProperty("puuid")
    private String puuid;
    @JsonProperty("quadraKills")
    private Integer quadraKills;
    @JsonProperty("riotIdName")
    private String riotIdName;
    @JsonProperty("riotIdTagline")
    private String riotIdTagline;
    @JsonProperty("role")
    private String role;
    @JsonProperty("sightWardsBoughtInGame")
    private Integer sightWardsBoughtInGame;
    @JsonProperty("spell1Casts")
    private Integer spell1Casts;
    @JsonProperty("spell2Casts")
    private Integer spell2Casts;
    @JsonProperty("spell3Casts")
    private Integer spell3Casts;
    @JsonProperty("spell4Casts")
    private Integer spell4Casts;
    @JsonProperty("summoner1Casts")
    private Integer summoner1Casts;
    @JsonProperty("summoner1Id")
    private Integer summoner1Id;
    @JsonProperty("summoner2Casts")
    private Integer summoner2Casts;
    @JsonProperty("summoner2Id")
    private Integer summoner2Id;
    @JsonProperty("summonerId")
    private String summonerId;
    @JsonProperty("summonerLevel")
    private Integer summonerLevel;
    @JsonProperty("summonerName")
    private String summonerName;
    @JsonProperty("teamEarlySurrendered")
    private Boolean teamEarlySurrendered;
    @JsonProperty("teamId")
    private Integer teamId;
    @JsonProperty("teamPosition")
    private String teamPosition;
    @JsonProperty("timeCCingOthers")
    private Integer timeCCingOthers;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("totalDamageDealt")
    private Integer totalDamageDealt;
    @JsonProperty("totalDamageDealtToChampions")
    private Integer totalDamageDealtToChampions;
    @JsonProperty("totalDamageShieldedOnTeammates")
    private Integer totalDamageShieldedOnTeammates;
    @JsonProperty("totalDamageTaken")
    private Integer totalDamageTaken;
    @JsonProperty("totalHeal")
    private Integer totalHeal;
    @JsonProperty("totalHealsOnTeammates")
    private Integer totalHealsOnTeammates;
    @JsonProperty("totalMinionsKilled")
    private Integer totalMinionsKilled;
    @JsonProperty("totalTimeCCDealt")
    private Integer totalTimeCCDealt;
    @JsonProperty("totalTimeSpentDead")
    private Integer totalTimeSpentDead;
    @JsonProperty("totalUnitsHealed")
    private Integer totalUnitsHealed;
    @JsonProperty("tripleKills")
    private Integer tripleKills;
    @JsonProperty("trueDamageDealt")
    private Integer trueDamageDealt;
    @JsonProperty("trueDamageDealtToChampions")
    private Integer trueDamageDealtToChampions;
    @JsonProperty("trueDamageTaken")
    private Integer trueDamageTaken;
    @JsonProperty("turretKills")
    private Integer turretKills;
    @JsonProperty("turretTakedowns")
    private Integer turretTakedowns;
    @JsonProperty("turretsLost")
    private Integer turretsLost;
    @JsonProperty("unrealKills")
    private Integer unrealKills;
    @JsonProperty("visionScore")
    private Integer visionScore;
    @JsonProperty("visionWardsBoughtInGame")
    private Integer visionWardsBoughtInGame;
    @JsonProperty("wardsKilled")
    private Integer wardsKilled;
    @JsonProperty("wardsPlaced")
    private Integer wardsPlaced;
    @JsonProperty("win")
    private Boolean win;

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("baronKills")
    public Integer getBaronKills() {
        return baronKills;
    }

    @JsonProperty("baronKills")
    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    @JsonProperty("bountyLevel")
    public Integer getBountyLevel() {
        return bountyLevel;
    }

    @JsonProperty("bountyLevel")
    public void setBountyLevel(Integer bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    @JsonProperty("challenges")
    public Challenges getChallenges() {
        return challenges;
    }

    @JsonProperty("challenges")
    public void setChallenges(Challenges challenges) {
        this.challenges = challenges;
    }

    @JsonProperty("champExperience")
    public Integer getChampExperience() {
        return champExperience;
    }

    @JsonProperty("champExperience")
    public void setChampExperience(Integer champExperience) {
        this.champExperience = champExperience;
    }

    @JsonProperty("champLevel")
    public Integer getChampLevel() {
        return champLevel;
    }

    @JsonProperty("champLevel")
    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    @JsonProperty("championId")
    public Integer getChampionId() {
        return championId;
    }

    @JsonProperty("championId")
    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    @JsonProperty("championName")
    public String getChampionName() {
        return championName;
    }

    @JsonProperty("championName")
    public void setChampionName(String championName) {
        this.championName = championName;
    }

    @JsonProperty("championTransform")
    public Integer getChampionTransform() {
        return championTransform;
    }

    @JsonProperty("championTransform")
    public void setChampionTransform(Integer championTransform) {
        this.championTransform = championTransform;
    }

    @JsonProperty("consumablesPurchased")
    public Integer getConsumablesPurchased() {
        return consumablesPurchased;
    }

    @JsonProperty("consumablesPurchased")
    public void setConsumablesPurchased(Integer consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    @JsonProperty("damageDealtToBuildings")
    public Integer getDamageDealtToBuildings() {
        return damageDealtToBuildings;
    }

    @JsonProperty("damageDealtToBuildings")
    public void setDamageDealtToBuildings(Integer damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
    }

    @JsonProperty("damageDealtToObjectives")
    public Integer getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    @JsonProperty("damageDealtToObjectives")
    public void setDamageDealtToObjectives(Integer damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    @JsonProperty("damageDealtToTurrets")
    public Integer getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    @JsonProperty("damageDealtToTurrets")
    public void setDamageDealtToTurrets(Integer damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    @JsonProperty("damageSelfMitigated")
    public Integer getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    @JsonProperty("damageSelfMitigated")
    public void setDamageSelfMitigated(Integer damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("detectorWardsPlaced")
    public Integer getDetectorWardsPlaced() {
        return detectorWardsPlaced;
    }

    @JsonProperty("detectorWardsPlaced")
    public void setDetectorWardsPlaced(Integer detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
    }

    @JsonProperty("doubleKills")
    public Integer getDoubleKills() {
        return doubleKills;
    }

    @JsonProperty("doubleKills")
    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    @JsonProperty("dragonKills")
    public Integer getDragonKills() {
        return dragonKills;
    }

    @JsonProperty("dragonKills")
    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }

    @JsonProperty("eligibleForProgression")
    public Boolean getEligibleForProgression() {
        return eligibleForProgression;
    }

    @JsonProperty("eligibleForProgression")
    public void setEligibleForProgression(Boolean eligibleForProgression) {
        this.eligibleForProgression = eligibleForProgression;
    }

    @JsonProperty("firstBloodAssist")
    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    @JsonProperty("firstBloodAssist")
    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    @JsonProperty("firstBloodKill")
    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    @JsonProperty("firstBloodKill")
    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    @JsonProperty("firstTowerAssist")
    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    @JsonProperty("firstTowerAssist")
    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    @JsonProperty("firstTowerKill")
    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    @JsonProperty("firstTowerKill")
    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    @JsonProperty("gameEndedInEarlySurrender")
    public Boolean getGameEndedInEarlySurrender() {
        return gameEndedInEarlySurrender;
    }

    @JsonProperty("gameEndedInEarlySurrender")
    public void setGameEndedInEarlySurrender(Boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
    }

    @JsonProperty("gameEndedInSurrender")
    public Boolean getGameEndedInSurrender() {
        return gameEndedInSurrender;
    }

    @JsonProperty("gameEndedInSurrender")
    public void setGameEndedInSurrender(Boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
    }

    @JsonProperty("goldEarned")
    public Integer getGoldEarned() {
        return goldEarned;
    }

    @JsonProperty("goldEarned")
    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    @JsonProperty("goldSpent")
    public Integer getGoldSpent() {
        return goldSpent;
    }

    @JsonProperty("goldSpent")
    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    @JsonProperty("individualPosition")
    public String getIndividualPosition() {
        return individualPosition;
    }

    @JsonProperty("individualPosition")
    public void setIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
    }

    @JsonProperty("inhibitorKills")
    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    @JsonProperty("inhibitorKills")
    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    @JsonProperty("inhibitorTakedowns")
    public Integer getInhibitorTakedowns() {
        return inhibitorTakedowns;
    }

    @JsonProperty("inhibitorTakedowns")
    public void setInhibitorTakedowns(Integer inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
    }

    @JsonProperty("inhibitorsLost")
    public Integer getInhibitorsLost() {
        return inhibitorsLost;
    }

    @JsonProperty("inhibitorsLost")
    public void setInhibitorsLost(Integer inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
    }

    @JsonProperty("item0")
    public Integer getItem0() {
        return item0;
    }

    @JsonProperty("item0")
    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    @JsonProperty("item1")
    public Integer getItem1() {
        return item1;
    }

    @JsonProperty("item1")
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    @JsonProperty("item2")
    public Integer getItem2() {
        return item2;
    }

    @JsonProperty("item2")
    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    @JsonProperty("item3")
    public Integer getItem3() {
        return item3;
    }

    @JsonProperty("item3")
    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    @JsonProperty("item4")
    public Integer getItem4() {
        return item4;
    }

    @JsonProperty("item4")
    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    @JsonProperty("item5")
    public Integer getItem5() {
        return item5;
    }

    @JsonProperty("item5")
    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    @JsonProperty("item6")
    public Integer getItem6() {
        return item6;
    }

    @JsonProperty("item6")
    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    @JsonProperty("itemsPurchased")
    public Integer getItemsPurchased() {
        return itemsPurchased;
    }

    @JsonProperty("itemsPurchased")
    public void setItemsPurchased(Integer itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    @JsonProperty("killingSprees")
    public Integer getKillingSprees() {
        return killingSprees;
    }

    @JsonProperty("killingSprees")
    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("lane")
    public String getLane() {
        return lane;
    }

    @JsonProperty("lane")
    public void setLane(String lane) {
        this.lane = lane;
    }

    @JsonProperty("largestCriticalStrike")
    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    @JsonProperty("largestCriticalStrike")
    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    @JsonProperty("largestKillingSpree")
    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    @JsonProperty("largestKillingSpree")
    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    @JsonProperty("largestMultiKill")
    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    @JsonProperty("largestMultiKill")
    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    @JsonProperty("longestTimeSpentLiving")
    public Integer getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    @JsonProperty("longestTimeSpentLiving")
    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    @JsonProperty("magicDamageDealt")
    public Integer getMagicDamageDealt() {
        return magicDamageDealt;
    }

    @JsonProperty("magicDamageDealt")
    public void setMagicDamageDealt(Integer magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    @JsonProperty("magicDamageDealtToChampions")
    public Integer getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    @JsonProperty("magicDamageDealtToChampions")
    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    @JsonProperty("magicDamageTaken")
    public Integer getMagicDamageTaken() {
        return magicDamageTaken;
    }

    @JsonProperty("magicDamageTaken")
    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    @JsonProperty("neutralMinionsKilled")
    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    @JsonProperty("neutralMinionsKilled")
    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    @JsonProperty("nexusKills")
    public Integer getNexusKills() {
        return nexusKills;
    }

    @JsonProperty("nexusKills")
    public void setNexusKills(Integer nexusKills) {
        this.nexusKills = nexusKills;
    }

    @JsonProperty("nexusLost")
    public Integer getNexusLost() {
        return nexusLost;
    }

    @JsonProperty("nexusLost")
    public void setNexusLost(Integer nexusLost) {
        this.nexusLost = nexusLost;
    }

    @JsonProperty("nexusTakedowns")
    public Integer getNexusTakedowns() {
        return nexusTakedowns;
    }

    @JsonProperty("nexusTakedowns")
    public void setNexusTakedowns(Integer nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
    }

    @JsonProperty("objectivesStolen")
    public Integer getObjectivesStolen() {
        return objectivesStolen;
    }

    @JsonProperty("objectivesStolen")
    public void setObjectivesStolen(Integer objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
    }

    @JsonProperty("objectivesStolenAssists")
    public Integer getObjectivesStolenAssists() {
        return objectivesStolenAssists;
    }

    @JsonProperty("objectivesStolenAssists")
    public void setObjectivesStolenAssists(Integer objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
    }

    @JsonProperty("participantId")
    public Integer getParticipantId() {
        return participantId;
    }

    @JsonProperty("participantId")
    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    @JsonProperty("pentaKills")
    public Integer getPentaKills() {
        return pentaKills;
    }

    @JsonProperty("pentaKills")
    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    @JsonProperty("perks")
    public Perks getPerks() {
        return perks;
    }

    @JsonProperty("perks")
    public void setPerks(Perks perks) {
        this.perks = perks;
    }

    @JsonProperty("physicalDamageDealt")
    public Integer getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    @JsonProperty("physicalDamageDealt")
    public void setPhysicalDamageDealt(Integer physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    @JsonProperty("physicalDamageDealtToChampions")
    public Integer getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    @JsonProperty("physicalDamageDealtToChampions")
    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    @JsonProperty("physicalDamageTaken")
    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    @JsonProperty("physicalDamageTaken")
    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    @JsonProperty("profileIcon")
    public Integer getProfileIcon() {
        return profileIcon;
    }

    @JsonProperty("profileIcon")
    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    @JsonProperty("puuid")
    public String getPuuid() {
        return puuid;
    }

    @JsonProperty("puuid")
    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    @JsonProperty("quadraKills")
    public Integer getQuadraKills() {
        return quadraKills;
    }

    @JsonProperty("quadraKills")
    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    @JsonProperty("riotIdName")
    public String getRiotIdName() {
        return riotIdName;
    }

    @JsonProperty("riotIdName")
    public void setRiotIdName(String riotIdName) {
        this.riotIdName = riotIdName;
    }

    @JsonProperty("riotIdTagline")
    public String getRiotIdTagline() {
        return riotIdTagline;
    }

    @JsonProperty("riotIdTagline")
    public void setRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("sightWardsBoughtInGame")
    public Integer getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    @JsonProperty("sightWardsBoughtInGame")
    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    @JsonProperty("spell1Casts")
    public Integer getSpell1Casts() {
        return spell1Casts;
    }

    @JsonProperty("spell1Casts")
    public void setSpell1Casts(Integer spell1Casts) {
        this.spell1Casts = spell1Casts;
    }

    @JsonProperty("spell2Casts")
    public Integer getSpell2Casts() {
        return spell2Casts;
    }

    @JsonProperty("spell2Casts")
    public void setSpell2Casts(Integer spell2Casts) {
        this.spell2Casts = spell2Casts;
    }

    @JsonProperty("spell3Casts")
    public Integer getSpell3Casts() {
        return spell3Casts;
    }

    @JsonProperty("spell3Casts")
    public void setSpell3Casts(Integer spell3Casts) {
        this.spell3Casts = spell3Casts;
    }

    @JsonProperty("spell4Casts")
    public Integer getSpell4Casts() {
        return spell4Casts;
    }

    @JsonProperty("spell4Casts")
    public void setSpell4Casts(Integer spell4Casts) {
        this.spell4Casts = spell4Casts;
    }

    @JsonProperty("summoner1Casts")
    public Integer getSummoner1Casts() {
        return summoner1Casts;
    }

    @JsonProperty("summoner1Casts")
    public void setSummoner1Casts(Integer summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
    }

    @JsonProperty("summoner1Id")
    public Integer getSummoner1Id() {
        return summoner1Id;
    }

    @JsonProperty("summoner1Id")
    public void setSummoner1Id(Integer summoner1Id) {
        this.summoner1Id = summoner1Id;
    }

    @JsonProperty("summoner2Casts")
    public Integer getSummoner2Casts() {
        return summoner2Casts;
    }

    @JsonProperty("summoner2Casts")
    public void setSummoner2Casts(Integer summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
    }

    @JsonProperty("summoner2Id")
    public Integer getSummoner2Id() {
        return summoner2Id;
    }

    @JsonProperty("summoner2Id")
    public void setSummoner2Id(Integer summoner2Id) {
        this.summoner2Id = summoner2Id;
    }

    @JsonProperty("summonerId")
    public String getSummonerId() {
        return summonerId;
    }

    @JsonProperty("summonerId")
    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    @JsonProperty("summonerLevel")
    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    @JsonProperty("summonerLevel")
    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @JsonProperty("summonerName")
    public String getSummonerName() {
        return summonerName;
    }

    @JsonProperty("summonerName")
    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    @JsonProperty("teamEarlySurrendered")
    public Boolean getTeamEarlySurrendered() {
        return teamEarlySurrendered;
    }

    @JsonProperty("teamEarlySurrendered")
    public void setTeamEarlySurrendered(Boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
    }

    @JsonProperty("teamId")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("teamPosition")
    public String getTeamPosition() {
        return teamPosition;
    }

    @JsonProperty("teamPosition")
    public void setTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
    }

    @JsonProperty("timeCCingOthers")
    public Integer getTimeCCingOthers() {
        return timeCCingOthers;
    }

    @JsonProperty("timeCCingOthers")
    public void setTimeCCingOthers(Integer timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    @JsonProperty("timePlayed")
    public Integer getTimePlayed() {
        return timePlayed;
    }

    @JsonProperty("timePlayed")
    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    @JsonProperty("totalDamageDealt")
    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    @JsonProperty("totalDamageDealt")
    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    @JsonProperty("totalDamageDealtToChampions")
    public Integer getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    @JsonProperty("totalDamageDealtToChampions")
    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    @JsonProperty("totalDamageShieldedOnTeammates")
    public Integer getTotalDamageShieldedOnTeammates() {
        return totalDamageShieldedOnTeammates;
    }

    @JsonProperty("totalDamageShieldedOnTeammates")
    public void setTotalDamageShieldedOnTeammates(Integer totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
    }

    @JsonProperty("totalDamageTaken")
    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    @JsonProperty("totalDamageTaken")
    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    @JsonProperty("totalHeal")
    public Integer getTotalHeal() {
        return totalHeal;
    }

    @JsonProperty("totalHeal")
    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    @JsonProperty("totalHealsOnTeammates")
    public Integer getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    @JsonProperty("totalHealsOnTeammates")
    public void setTotalHealsOnTeammates(Integer totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
    }

    @JsonProperty("totalMinionsKilled")
    public Integer getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    @JsonProperty("totalMinionsKilled")
    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    @JsonProperty("totalTimeCCDealt")
    public Integer getTotalTimeCCDealt() {
        return totalTimeCCDealt;
    }

    @JsonProperty("totalTimeCCDealt")
    public void setTotalTimeCCDealt(Integer totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
    }

    @JsonProperty("totalTimeSpentDead")
    public Integer getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    @JsonProperty("totalTimeSpentDead")
    public void setTotalTimeSpentDead(Integer totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
    }

    @JsonProperty("totalUnitsHealed")
    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    @JsonProperty("totalUnitsHealed")
    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    @JsonProperty("tripleKills")
    public Integer getTripleKills() {
        return tripleKills;
    }

    @JsonProperty("tripleKills")
    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    @JsonProperty("trueDamageDealt")
    public Integer getTrueDamageDealt() {
        return trueDamageDealt;
    }

    @JsonProperty("trueDamageDealt")
    public void setTrueDamageDealt(Integer trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    @JsonProperty("trueDamageDealtToChampions")
    public Integer getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    @JsonProperty("trueDamageDealtToChampions")
    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    @JsonProperty("trueDamageTaken")
    public Integer getTrueDamageTaken() {
        return trueDamageTaken;
    }

    @JsonProperty("trueDamageTaken")
    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    @JsonProperty("turretKills")
    public Integer getTurretKills() {
        return turretKills;
    }

    @JsonProperty("turretKills")
    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    @JsonProperty("turretTakedowns")
    public Integer getTurretTakedowns() {
        return turretTakedowns;
    }

    @JsonProperty("turretTakedowns")
    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    @JsonProperty("turretsLost")
    public Integer getTurretsLost() {
        return turretsLost;
    }

    @JsonProperty("turretsLost")
    public void setTurretsLost(Integer turretsLost) {
        this.turretsLost = turretsLost;
    }

    @JsonProperty("unrealKills")
    public Integer getUnrealKills() {
        return unrealKills;
    }

    @JsonProperty("unrealKills")
    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    @JsonProperty("visionScore")
    public Integer getVisionScore() {
        return visionScore;
    }

    @JsonProperty("visionScore")
    public void setVisionScore(Integer visionScore) {
        this.visionScore = visionScore;
    }

    @JsonProperty("visionWardsBoughtInGame")
    public Integer getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    @JsonProperty("visionWardsBoughtInGame")
    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    @JsonProperty("wardsKilled")
    public Integer getWardsKilled() {
        return wardsKilled;
    }

    @JsonProperty("wardsKilled")
    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    @JsonProperty("wardsPlaced")
    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    @JsonProperty("wardsPlaced")
    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    @JsonProperty("win")
    public Boolean getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Boolean win) {
        this.win = win;
    }

    public String getBasicPings() {
        return basicPings;
    }

    public void setBasicPings(String basicPings) {
        this.basicPings = basicPings;
    }
}
