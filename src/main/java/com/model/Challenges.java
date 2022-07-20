package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.model.Participant;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "12AssistStreakCount",
        "abilityUses",
        "acesBefore15Minutes",
        "alliedJungleMonsterKills",
        "baronTakedowns",
        "blastConeOppositeOpponentCount",
        "bountyGold",
        "buffsStolen",
        "completeSupportQuestInTime",
        "controlWardsPlaced",
        "damagePerMinute",
        "damageTakenOnTeamPercentage",
        "dancedWithRiftHerald",
        "deathsByEnemyChamps",
        "dodgeSkillShotsSmallWindow",
        "doubleAces",
        "dragonTakedowns",
        "earlyLaningPhaseGoldExpAdvantage",
        "effectiveHealAndShielding",
        "elderDragonKillsWithOpposingSoul",
        "elderDragonMultikills",
        "enemyChampionImmobilizations",
        "enemyJungleMonsterKills",
        "epicMonsterKillsNearEnemyJungler",
        "epicMonsterKillsWithin30SecondsOfSpawn",
        "epicMonsterSteals",
        "epicMonsterStolenWithoutSmite",
        "flawlessAces",
        "fullTeamTakedown",
        "gameLength",
        "getTakedownsInAllLanesEarlyJungleAsLaner",
        "goldPerMinute",
        "hadOpenNexus",
        "immobilizeAndKillWithAlly",
        "initialBuffCount",
        "initialCrabCount",
        "jungleCsBefore10Minutes",
        "junglerTakedownsNearDamagedEpicMonster",
        "kTurretsDestroyedBeforePlatesFall",
        "kda",
        "killAfterHiddenWithAlly",
        "killParticipation",
        "killedChampTookFullTeamDamageSurvived",
        "killsNearEnemyTurret",
        "killsOnOtherLanesEarlyJungleAsLaner",
        "killsOnRecentlyHealedByAramPack",
        "killsUnderOwnTurret",
        "killsWithHelpFromEpicMonster",
        "knockEnemyIntoTeamAndKill",
        "landSkillShotsEarlyGame",
        "laneMinionsFirst10Minutes",
        "laningPhaseGoldExpAdvantage",
        "legendaryCount",
        "lostAnInhibitor",
        "maxCsAdvantageOnLaneOpponent",
        "maxKillDeficit",
        "maxLevelLeadLaneOpponent",
        "moreEnemyJungleThanOpponent",
        "multiKillOneSpell",
        "multiTurretRiftHeraldCount",
        "multikills",
        "multikillsAfterAggressiveFlash",
        "mythicItemUsed",
        "outerTurretExecutesBefore10Minutes",
        "outnumberedKills",
        "outnumberedNexusKill",
        "perfectDragonSoulsTaken",
        "perfectGame",
        "pickKillWithAlly",
        "poroExplosions",
        "quickCleanse",
        "quickFirstTurret",
        "quickSoloKills",
        "riftHeraldTakedowns",
        "saveAllyFromDeath",
        "scuttleCrabKills",
        "skillshotsDodged",
        "skillshotsHit",
        "snowballsHit",
        "soloBaronKills",
        "soloKills",
        "soloTurretsLategame",
        "stealthWardsPlaced",
        "survivedSingleDigitHpCount",
        "survivedThreeImmobilizesInFight",
        "takedownOnFirstTurret",
        "takedowns",
        "takedownsAfterGainingLevelAdvantage",
        "takedownsBeforeJungleMinionSpawn",
        "takedownsFirstXMinutes",
        "takedownsInAlcove",
        "takedownsInEnemyFountain",
        "teamBaronKills",
        "teamDamagePercentage",
        "teamElderDragonKills",
        "teamRiftHeraldKills",
        "threeWardsOneSweeperCount",
        "tookLargeDamageSurvived",
        "turretPlatesTaken",
        "turretTakedowns",
        "turretsTakenWithRiftHerald",
        "twentyMinionsIn3SecondsCount",
        "unseenRecalls",
        "visionScoreAdvantageLaneOpponent",
        "visionScorePerMinute",
        "wardTakedowns",
        "wardTakedownsBefore20M",
        "wardsGuarded",
        "firstTurretKilledTime",
        "highestChampionDamage",
        "shortestTimeToAceFromFirstTakedown",
        "highestCrowdControlScore"
})
@Generated("jsonschema2pojo")
public class Challenges {


    @JsonProperty("fastestLegendary")
    private String fastestLegendary;
    @JsonProperty("hadAfkTeammate")
    private String hadAfkTeammate;

    @JsonProperty("12AssistStreakCount")
    private Integer _12AssistStreakCount;
    @JsonProperty("abilityUses")
    private Integer abilityUses;
    @JsonProperty("acesBefore15Minutes")
    private Integer acesBefore15Minutes;
    @JsonProperty("alliedJungleMonsterKills")
    private Integer alliedJungleMonsterKills;
    @JsonProperty("baronTakedowns")
    private Integer baronTakedowns;
    @JsonProperty("blastConeOppositeOpponentCount")
    private Integer blastConeOppositeOpponentCount;
    @JsonProperty("bountyGold")
    private Integer bountyGold;
    @JsonProperty("buffsStolen")
    private Integer buffsStolen;
    @JsonProperty("completeSupportQuestInTime")
    private Integer completeSupportQuestInTime;
    @JsonProperty("controlWardsPlaced")
    private Integer controlWardsPlaced;
    @JsonProperty("damagePerMinute")
    private Double damagePerMinute;
    @JsonProperty("damageTakenOnTeamPercentage")
    private Double damageTakenOnTeamPercentage;
    @JsonProperty("dancedWithRiftHerald")
    private Integer dancedWithRiftHerald;
    @JsonProperty("deathsByEnemyChamps")
    private Integer deathsByEnemyChamps;
    @JsonProperty("dodgeSkillShotsSmallWindow")
    private Integer dodgeSkillShotsSmallWindow;
    @JsonProperty("doubleAces")
    private Integer doubleAces;
    @JsonProperty("dragonTakedowns")
    private Integer dragonTakedowns;
    @JsonProperty("earlyLaningPhaseGoldExpAdvantage")
    private Integer earlyLaningPhaseGoldExpAdvantage;
    @JsonProperty("effectiveHealAndShielding")
    private Integer effectiveHealAndShielding;
    @JsonProperty("elderDragonKillsWithOpposingSoul")
    private Integer elderDragonKillsWithOpposingSoul;
    @JsonProperty("elderDragonMultikills")
    private Integer elderDragonMultikills;
    @JsonProperty("enemyChampionImmobilizations")
    private Integer enemyChampionImmobilizations;
    @JsonProperty("enemyJungleMonsterKills")
    private Integer enemyJungleMonsterKills;
    @JsonProperty("epicMonsterKillsNearEnemyJungler")
    private Integer epicMonsterKillsNearEnemyJungler;
    @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
    private Integer epicMonsterKillsWithin30SecondsOfSpawn;
    @JsonProperty("epicMonsterSteals")
    private Integer epicMonsterSteals;
    @JsonProperty("epicMonsterStolenWithoutSmite")
    private Integer epicMonsterStolenWithoutSmite;
    @JsonProperty("flawlessAces")
    private Integer flawlessAces;
    @JsonProperty("fullTeamTakedown")
    private Integer fullTeamTakedown;
    @JsonProperty("gameLength")
    private Double gameLength;
    @JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
    private Integer getTakedownsInAllLanesEarlyJungleAsLaner;
    @JsonProperty("goldPerMinute")
    private Double goldPerMinute;
    @JsonProperty("hadOpenNexus")
    private Integer hadOpenNexus;
    @JsonProperty("immobilizeAndKillWithAlly")
    private Integer immobilizeAndKillWithAlly;
    @JsonProperty("initialBuffCount")
    private Integer initialBuffCount;
    @JsonProperty("initialCrabCount")
    private Integer initialCrabCount;
    @JsonProperty("jungleCsBefore10Minutes")
    private Integer jungleCsBefore10Minutes;
    @JsonProperty("junglerTakedownsNearDamagedEpicMonster")
    private Integer junglerTakedownsNearDamagedEpicMonster;
    @JsonProperty("kTurretsDestroyedBeforePlatesFall")
    private Integer kTurretsDestroyedBeforePlatesFall;
    @JsonProperty("kda")
    private Double kda;
    @JsonProperty("killAfterHiddenWithAlly")
    private Integer killAfterHiddenWithAlly;
    @JsonProperty("killParticipation")
    private Double killParticipation;
    @JsonProperty("killedChampTookFullTeamDamageSurvived")
    private Integer killedChampTookFullTeamDamageSurvived;
    @JsonProperty("killsNearEnemyTurret")
    private Integer killsNearEnemyTurret;
    @JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
    private Integer killsOnOtherLanesEarlyJungleAsLaner;
    @JsonProperty("killsOnRecentlyHealedByAramPack")
    private Integer killsOnRecentlyHealedByAramPack;
    @JsonProperty("killsUnderOwnTurret")
    private Integer killsUnderOwnTurret;
    @JsonProperty("killsWithHelpFromEpicMonster")
    private Integer killsWithHelpFromEpicMonster;
    @JsonProperty("knockEnemyIntoTeamAndKill")
    private Integer knockEnemyIntoTeamAndKill;
    @JsonProperty("landSkillShotsEarlyGame")
    private Integer landSkillShotsEarlyGame;
    @JsonProperty("laneMinionsFirst10Minutes")
    private Integer laneMinionsFirst10Minutes;
    @JsonProperty("laningPhaseGoldExpAdvantage")
    private Integer laningPhaseGoldExpAdvantage;
    @JsonProperty("legendaryCount")
    private Integer legendaryCount;
    @JsonProperty("lostAnInhibitor")
    private Integer lostAnInhibitor;
    @JsonProperty("maxCsAdvantageOnLaneOpponent")
    private Integer maxCsAdvantageOnLaneOpponent;
    @JsonProperty("maxKillDeficit")
    private Integer maxKillDeficit;
    @JsonProperty("maxLevelLeadLaneOpponent")
    private Integer maxLevelLeadLaneOpponent;
    @JsonProperty("moreEnemyJungleThanOpponent")
    private Integer moreEnemyJungleThanOpponent;
    @JsonProperty("multiKillOneSpell")
    private Integer multiKillOneSpell;
    @JsonProperty("multiTurretRiftHeraldCount")
    private Integer multiTurretRiftHeraldCount;
    @JsonProperty("multikills")
    private Integer multikills;
    @JsonProperty("multikillsAfterAggressiveFlash")
    private Integer multikillsAfterAggressiveFlash;
    @JsonProperty("mythicItemUsed")
    private Integer mythicItemUsed;
    @JsonProperty("outerTurretExecutesBefore10Minutes")
    private Integer outerTurretExecutesBefore10Minutes;
    @JsonProperty("outnumberedKills")
    private Integer outnumberedKills;
    @JsonProperty("outnumberedNexusKill")
    private Integer outnumberedNexusKill;
    @JsonProperty("perfectDragonSoulsTaken")
    private Integer perfectDragonSoulsTaken;
    @JsonProperty("perfectGame")
    private Integer perfectGame;
    @JsonProperty("pickKillWithAlly")
    private Integer pickKillWithAlly;
    @JsonProperty("poroExplosions")
    private Integer poroExplosions;
    @JsonProperty("quickCleanse")
    private Integer quickCleanse;
    @JsonProperty("quickFirstTurret")
    private Integer quickFirstTurret;
    @JsonProperty("quickSoloKills")
    private Integer quickSoloKills;
    @JsonProperty("riftHeraldTakedowns")
    private Integer riftHeraldTakedowns;
    @JsonProperty("saveAllyFromDeath")
    private Integer saveAllyFromDeath;
    @JsonProperty("scuttleCrabKills")
    private Integer scuttleCrabKills;
    @JsonProperty("skillshotsDodged")
    private Integer skillshotsDodged;
    @JsonProperty("skillshotsHit")
    private Integer skillshotsHit;
    @JsonProperty("snowballsHit")
    private Integer snowballsHit;
    @JsonProperty("soloBaronKills")
    private Integer soloBaronKills;
    @JsonProperty("soloKills")
    private Integer soloKills;
    @JsonProperty("soloTurretsLategame")
    private Integer soloTurretsLategame;
    @JsonProperty("stealthWardsPlaced")
    private Integer stealthWardsPlaced;
    @JsonProperty("survivedSingleDigitHpCount")
    private Integer survivedSingleDigitHpCount;
    @JsonProperty("survivedThreeImmobilizesInFight")
    private Integer survivedThreeImmobilizesInFight;
    @JsonProperty("takedownOnFirstTurret")
    private Integer takedownOnFirstTurret;
    @JsonProperty("takedowns")
    private Integer takedowns;
    @JsonProperty("takedownsAfterGainingLevelAdvantage")
    private Integer takedownsAfterGainingLevelAdvantage;
    @JsonProperty("takedownsBeforeJungleMinionSpawn")
    private Integer takedownsBeforeJungleMinionSpawn;
    @JsonProperty("takedownsFirstXMinutes")
    private Integer takedownsFirstXMinutes;
    @JsonProperty("takedownsInAlcove")
    private Integer takedownsInAlcove;
    @JsonProperty("takedownsInEnemyFountain")
    private Integer takedownsInEnemyFountain;
    @JsonProperty("teamBaronKills")
    private Integer teamBaronKills;
    @JsonProperty("teamDamagePercentage")
    private Double teamDamagePercentage;
    @JsonProperty("teamElderDragonKills")
    private Integer teamElderDragonKills;
    @JsonProperty("teamRiftHeraldKills")
    private Integer teamRiftHeraldKills;
    @JsonProperty("threeWardsOneSweeperCount")
    private Integer threeWardsOneSweeperCount;
    @JsonProperty("tookLargeDamageSurvived")
    private Integer tookLargeDamageSurvived;
    @JsonProperty("turretPlatesTaken")
    private Integer turretPlatesTaken;
    @JsonProperty("turretTakedowns")
    private Integer turretTakedowns;
    @JsonProperty("turretsTakenWithRiftHerald")
    private Integer turretsTakenWithRiftHerald;
    @JsonProperty("twentyMinionsIn3SecondsCount")
    private Integer twentyMinionsIn3SecondsCount;
    @JsonProperty("unseenRecalls")
    private Integer unseenRecalls;
    @JsonProperty("visionScoreAdvantageLaneOpponent")
    private Integer visionScoreAdvantageLaneOpponent;
    @JsonProperty("visionScorePerMinute")
    private Integer visionScorePerMinute;
    @JsonProperty("wardTakedowns")
    private Integer wardTakedowns;
    @JsonProperty("wardTakedownsBefore20M")
    private Integer wardTakedownsBefore20M;
    @JsonProperty("wardsGuarded")
    private Integer wardsGuarded;
    @JsonProperty("firstTurretKilledTime")
    private Double firstTurretKilledTime;
    @JsonProperty("highestChampionDamage")
    private Integer highestChampionDamage;
    @JsonProperty("shortestTimeToAceFromFirstTakedown")
    private Double shortestTimeToAceFromFirstTakedown;
    @JsonProperty("highestCrowdControlScore")
    private Integer highestCrowdControlScore;

    @JsonProperty("12AssistStreakCount")
    public Integer get12AssistStreakCount() {
        return _12AssistStreakCount;
    }

    @JsonProperty("12AssistStreakCount")
    public void set12AssistStreakCount(Integer _12AssistStreakCount) {
        this._12AssistStreakCount = _12AssistStreakCount;
    }

    @JsonProperty("abilityUses")
    public Integer getAbilityUses() {
        return abilityUses;
    }

    @JsonProperty("abilityUses")
    public void setAbilityUses(Integer abilityUses) {
        this.abilityUses = abilityUses;
    }

    @JsonProperty("acesBefore15Minutes")
    public Integer getAcesBefore15Minutes() {
        return acesBefore15Minutes;
    }

    @JsonProperty("acesBefore15Minutes")
    public void setAcesBefore15Minutes(Integer acesBefore15Minutes) {
        this.acesBefore15Minutes = acesBefore15Minutes;
    }

    @JsonProperty("alliedJungleMonsterKills")
    public Integer getAlliedJungleMonsterKills() {
        return alliedJungleMonsterKills;
    }

    @JsonProperty("alliedJungleMonsterKills")
    public void setAlliedJungleMonsterKills(Integer alliedJungleMonsterKills) {
        this.alliedJungleMonsterKills = alliedJungleMonsterKills;
    }

    @JsonProperty("baronTakedowns")
    public Integer getBaronTakedowns() {
        return baronTakedowns;
    }

    @JsonProperty("baronTakedowns")
    public void setBaronTakedowns(Integer baronTakedowns) {
        this.baronTakedowns = baronTakedowns;
    }

    @JsonProperty("blastConeOppositeOpponentCount")
    public Integer getBlastConeOppositeOpponentCount() {
        return blastConeOppositeOpponentCount;
    }

    @JsonProperty("blastConeOppositeOpponentCount")
    public void setBlastConeOppositeOpponentCount(Integer blastConeOppositeOpponentCount) {
        this.blastConeOppositeOpponentCount = blastConeOppositeOpponentCount;
    }

    @JsonProperty("bountyGold")
    public Integer getBountyGold() {
        return bountyGold;
    }

    @JsonProperty("bountyGold")
    public void setBountyGold(Integer bountyGold) {
        this.bountyGold = bountyGold;
    }

    @JsonProperty("buffsStolen")
    public Integer getBuffsStolen() {
        return buffsStolen;
    }

    @JsonProperty("buffsStolen")
    public void setBuffsStolen(Integer buffsStolen) {
        this.buffsStolen = buffsStolen;
    }

    @JsonProperty("completeSupportQuestInTime")
    public Integer getCompleteSupportQuestInTime() {
        return completeSupportQuestInTime;
    }

    @JsonProperty("completeSupportQuestInTime")
    public void setCompleteSupportQuestInTime(Integer completeSupportQuestInTime) {
        this.completeSupportQuestInTime = completeSupportQuestInTime;
    }

    @JsonProperty("controlWardsPlaced")
    public Integer getControlWardsPlaced() {
        return controlWardsPlaced;
    }

    @JsonProperty("controlWardsPlaced")
    public void setControlWardsPlaced(Integer controlWardsPlaced) {
        this.controlWardsPlaced = controlWardsPlaced;
    }

    @JsonProperty("damagePerMinute")
    public Double getDamagePerMinute() {
        return damagePerMinute;
    }

    @JsonProperty("damagePerMinute")
    public void setDamagePerMinute(Double damagePerMinute) {
        this.damagePerMinute = damagePerMinute;
    }

    @JsonProperty("damageTakenOnTeamPercentage")
    public Double getDamageTakenOnTeamPercentage() {
        return damageTakenOnTeamPercentage;
    }

    @JsonProperty("damageTakenOnTeamPercentage")
    public void setDamageTakenOnTeamPercentage(Double damageTakenOnTeamPercentage) {
        this.damageTakenOnTeamPercentage = damageTakenOnTeamPercentage;
    }

    @JsonProperty("dancedWithRiftHerald")
    public Integer getDancedWithRiftHerald() {
        return dancedWithRiftHerald;
    }

    @JsonProperty("dancedWithRiftHerald")
    public void setDancedWithRiftHerald(Integer dancedWithRiftHerald) {
        this.dancedWithRiftHerald = dancedWithRiftHerald;
    }

    @JsonProperty("deathsByEnemyChamps")
    public Integer getDeathsByEnemyChamps() {
        return deathsByEnemyChamps;
    }

    @JsonProperty("deathsByEnemyChamps")
    public void setDeathsByEnemyChamps(Integer deathsByEnemyChamps) {
        this.deathsByEnemyChamps = deathsByEnemyChamps;
    }

    @JsonProperty("dodgeSkillShotsSmallWindow")
    public Integer getDodgeSkillShotsSmallWindow() {
        return dodgeSkillShotsSmallWindow;
    }

    @JsonProperty("dodgeSkillShotsSmallWindow")
    public void setDodgeSkillShotsSmallWindow(Integer dodgeSkillShotsSmallWindow) {
        this.dodgeSkillShotsSmallWindow = dodgeSkillShotsSmallWindow;
    }

    @JsonProperty("doubleAces")
    public Integer getDoubleAces() {
        return doubleAces;
    }

    @JsonProperty("doubleAces")
    public void setDoubleAces(Integer doubleAces) {
        this.doubleAces = doubleAces;
    }

    @JsonProperty("dragonTakedowns")
    public Integer getDragonTakedowns() {
        return dragonTakedowns;
    }

    @JsonProperty("dragonTakedowns")
    public void setDragonTakedowns(Integer dragonTakedowns) {
        this.dragonTakedowns = dragonTakedowns;
    }

    @JsonProperty("earlyLaningPhaseGoldExpAdvantage")
    public Integer getEarlyLaningPhaseGoldExpAdvantage() {
        return earlyLaningPhaseGoldExpAdvantage;
    }

    @JsonProperty("earlyLaningPhaseGoldExpAdvantage")
    public void setEarlyLaningPhaseGoldExpAdvantage(Integer earlyLaningPhaseGoldExpAdvantage) {
        this.earlyLaningPhaseGoldExpAdvantage = earlyLaningPhaseGoldExpAdvantage;
    }

    @JsonProperty("effectiveHealAndShielding")
    public Integer getEffectiveHealAndShielding() {
        return effectiveHealAndShielding;
    }

    @JsonProperty("effectiveHealAndShielding")
    public void setEffectiveHealAndShielding(Integer effectiveHealAndShielding) {
        this.effectiveHealAndShielding = effectiveHealAndShielding;
    }

    @JsonProperty("elderDragonKillsWithOpposingSoul")
    public Integer getElderDragonKillsWithOpposingSoul() {
        return elderDragonKillsWithOpposingSoul;
    }

    @JsonProperty("elderDragonKillsWithOpposingSoul")
    public void setElderDragonKillsWithOpposingSoul(Integer elderDragonKillsWithOpposingSoul) {
        this.elderDragonKillsWithOpposingSoul = elderDragonKillsWithOpposingSoul;
    }

    @JsonProperty("elderDragonMultikills")
    public Integer getElderDragonMultikills() {
        return elderDragonMultikills;
    }

    @JsonProperty("elderDragonMultikills")
    public void setElderDragonMultikills(Integer elderDragonMultikills) {
        this.elderDragonMultikills = elderDragonMultikills;
    }

    @JsonProperty("enemyChampionImmobilizations")
    public Integer getEnemyChampionImmobilizations() {
        return enemyChampionImmobilizations;
    }

    @JsonProperty("enemyChampionImmobilizations")
    public void setEnemyChampionImmobilizations(Integer enemyChampionImmobilizations) {
        this.enemyChampionImmobilizations = enemyChampionImmobilizations;
    }

    @JsonProperty("enemyJungleMonsterKills")
    public Integer getEnemyJungleMonsterKills() {
        return enemyJungleMonsterKills;
    }

    @JsonProperty("enemyJungleMonsterKills")
    public void setEnemyJungleMonsterKills(Integer enemyJungleMonsterKills) {
        this.enemyJungleMonsterKills = enemyJungleMonsterKills;
    }

    @JsonProperty("epicMonsterKillsNearEnemyJungler")
    public Integer getEpicMonsterKillsNearEnemyJungler() {
        return epicMonsterKillsNearEnemyJungler;
    }

    @JsonProperty("epicMonsterKillsNearEnemyJungler")
    public void setEpicMonsterKillsNearEnemyJungler(Integer epicMonsterKillsNearEnemyJungler) {
        this.epicMonsterKillsNearEnemyJungler = epicMonsterKillsNearEnemyJungler;
    }

    @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
    public Integer getEpicMonsterKillsWithin30SecondsOfSpawn() {
        return epicMonsterKillsWithin30SecondsOfSpawn;
    }

    @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
    public void setEpicMonsterKillsWithin30SecondsOfSpawn(Integer epicMonsterKillsWithin30SecondsOfSpawn) {
        this.epicMonsterKillsWithin30SecondsOfSpawn = epicMonsterKillsWithin30SecondsOfSpawn;
    }

    @JsonProperty("epicMonsterSteals")
    public Integer getEpicMonsterSteals() {
        return epicMonsterSteals;
    }

    @JsonProperty("epicMonsterSteals")
    public void setEpicMonsterSteals(Integer epicMonsterSteals) {
        this.epicMonsterSteals = epicMonsterSteals;
    }

    @JsonProperty("epicMonsterStolenWithoutSmite")
    public Integer getEpicMonsterStolenWithoutSmite() {
        return epicMonsterStolenWithoutSmite;
    }

    @JsonProperty("epicMonsterStolenWithoutSmite")
    public void setEpicMonsterStolenWithoutSmite(Integer epicMonsterStolenWithoutSmite) {
        this.epicMonsterStolenWithoutSmite = epicMonsterStolenWithoutSmite;
    }

    @JsonProperty("flawlessAces")
    public Integer getFlawlessAces() {
        return flawlessAces;
    }

    @JsonProperty("flawlessAces")
    public void setFlawlessAces(Integer flawlessAces) {
        this.flawlessAces = flawlessAces;
    }

    @JsonProperty("fullTeamTakedown")
    public Integer getFullTeamTakedown() {
        return fullTeamTakedown;
    }

    @JsonProperty("fullTeamTakedown")
    public void setFullTeamTakedown(Integer fullTeamTakedown) {
        this.fullTeamTakedown = fullTeamTakedown;
    }

    @JsonProperty("gameLength")
    public Double getGameLength() {
        return gameLength;
    }

    @JsonProperty("gameLength")
    public void setGameLength(Double gameLength) {
        this.gameLength = gameLength;
    }

    @JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
    public Integer getGetTakedownsInAllLanesEarlyJungleAsLaner() {
        return getTakedownsInAllLanesEarlyJungleAsLaner;
    }

    @JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
    public void setGetTakedownsInAllLanesEarlyJungleAsLaner(Integer getTakedownsInAllLanesEarlyJungleAsLaner) {
        this.getTakedownsInAllLanesEarlyJungleAsLaner = getTakedownsInAllLanesEarlyJungleAsLaner;
    }

    @JsonProperty("goldPerMinute")
    public Double getGoldPerMinute() {
        return goldPerMinute;
    }

    @JsonProperty("goldPerMinute")
    public void setGoldPerMinute(Double goldPerMinute) {
        this.goldPerMinute = goldPerMinute;
    }

    @JsonProperty("hadOpenNexus")
    public Integer getHadOpenNexus() {
        return hadOpenNexus;
    }

    @JsonProperty("hadOpenNexus")
    public void setHadOpenNexus(Integer hadOpenNexus) {
        this.hadOpenNexus = hadOpenNexus;
    }

    @JsonProperty("immobilizeAndKillWithAlly")
    public Integer getImmobilizeAndKillWithAlly() {
        return immobilizeAndKillWithAlly;
    }

    @JsonProperty("immobilizeAndKillWithAlly")
    public void setImmobilizeAndKillWithAlly(Integer immobilizeAndKillWithAlly) {
        this.immobilizeAndKillWithAlly = immobilizeAndKillWithAlly;
    }

    @JsonProperty("initialBuffCount")
    public Integer getInitialBuffCount() {
        return initialBuffCount;
    }

    @JsonProperty("initialBuffCount")
    public void setInitialBuffCount(Integer initialBuffCount) {
        this.initialBuffCount = initialBuffCount;
    }

    @JsonProperty("initialCrabCount")
    public Integer getInitialCrabCount() {
        return initialCrabCount;
    }

    @JsonProperty("initialCrabCount")
    public void setInitialCrabCount(Integer initialCrabCount) {
        this.initialCrabCount = initialCrabCount;
    }

    @JsonProperty("jungleCsBefore10Minutes")
    public Integer getJungleCsBefore10Minutes() {
        return jungleCsBefore10Minutes;
    }

    @JsonProperty("jungleCsBefore10Minutes")
    public void setJungleCsBefore10Minutes(Integer jungleCsBefore10Minutes) {
        this.jungleCsBefore10Minutes = jungleCsBefore10Minutes;
    }

    @JsonProperty("junglerTakedownsNearDamagedEpicMonster")
    public Integer getJunglerTakedownsNearDamagedEpicMonster() {
        return junglerTakedownsNearDamagedEpicMonster;
    }

    @JsonProperty("junglerTakedownsNearDamagedEpicMonster")
    public void setJunglerTakedownsNearDamagedEpicMonster(Integer junglerTakedownsNearDamagedEpicMonster) {
        this.junglerTakedownsNearDamagedEpicMonster = junglerTakedownsNearDamagedEpicMonster;
    }

    @JsonProperty("kTurretsDestroyedBeforePlatesFall")
    public Integer getkTurretsDestroyedBeforePlatesFall() {
        return kTurretsDestroyedBeforePlatesFall;
    }

    @JsonProperty("kTurretsDestroyedBeforePlatesFall")
    public void setkTurretsDestroyedBeforePlatesFall(Integer kTurretsDestroyedBeforePlatesFall) {
        this.kTurretsDestroyedBeforePlatesFall = kTurretsDestroyedBeforePlatesFall;
    }

    @JsonProperty("kda")
    public Double getKda() {
        return kda;
    }

    @JsonProperty("kda")
    public void setKda(Double kda) {
        this.kda = kda;
    }

    @JsonProperty("killAfterHiddenWithAlly")
    public Integer getKillAfterHiddenWithAlly() {
        return killAfterHiddenWithAlly;
    }

    @JsonProperty("killAfterHiddenWithAlly")
    public void setKillAfterHiddenWithAlly(Integer killAfterHiddenWithAlly) {
        this.killAfterHiddenWithAlly = killAfterHiddenWithAlly;
    }

    @JsonProperty("killParticipation")
    public Double getKillParticipation() {
        return killParticipation;
    }

    @JsonProperty("killParticipation")
    public void setKillParticipation(Double killParticipation) {
        this.killParticipation = killParticipation;
    }

    @JsonProperty("killedChampTookFullTeamDamageSurvived")
    public Integer getKilledChampTookFullTeamDamageSurvived() {
        return killedChampTookFullTeamDamageSurvived;
    }

    @JsonProperty("killedChampTookFullTeamDamageSurvived")
    public void setKilledChampTookFullTeamDamageSurvived(Integer killedChampTookFullTeamDamageSurvived) {
        this.killedChampTookFullTeamDamageSurvived = killedChampTookFullTeamDamageSurvived;
    }

    @JsonProperty("killsNearEnemyTurret")
    public Integer getKillsNearEnemyTurret() {
        return killsNearEnemyTurret;
    }

    @JsonProperty("killsNearEnemyTurret")
    public void setKillsNearEnemyTurret(Integer killsNearEnemyTurret) {
        this.killsNearEnemyTurret = killsNearEnemyTurret;
    }

    @JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
    public Integer getKillsOnOtherLanesEarlyJungleAsLaner() {
        return killsOnOtherLanesEarlyJungleAsLaner;
    }

    @JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
    public void setKillsOnOtherLanesEarlyJungleAsLaner(Integer killsOnOtherLanesEarlyJungleAsLaner) {
        this.killsOnOtherLanesEarlyJungleAsLaner = killsOnOtherLanesEarlyJungleAsLaner;
    }

    @JsonProperty("killsOnRecentlyHealedByAramPack")
    public Integer getKillsOnRecentlyHealedByAramPack() {
        return killsOnRecentlyHealedByAramPack;
    }

    @JsonProperty("killsOnRecentlyHealedByAramPack")
    public void setKillsOnRecentlyHealedByAramPack(Integer killsOnRecentlyHealedByAramPack) {
        this.killsOnRecentlyHealedByAramPack = killsOnRecentlyHealedByAramPack;
    }

    @JsonProperty("killsUnderOwnTurret")
    public Integer getKillsUnderOwnTurret() {
        return killsUnderOwnTurret;
    }

    @JsonProperty("killsUnderOwnTurret")
    public void setKillsUnderOwnTurret(Integer killsUnderOwnTurret) {
        this.killsUnderOwnTurret = killsUnderOwnTurret;
    }

    @JsonProperty("killsWithHelpFromEpicMonster")
    public Integer getKillsWithHelpFromEpicMonster() {
        return killsWithHelpFromEpicMonster;
    }

    @JsonProperty("killsWithHelpFromEpicMonster")
    public void setKillsWithHelpFromEpicMonster(Integer killsWithHelpFromEpicMonster) {
        this.killsWithHelpFromEpicMonster = killsWithHelpFromEpicMonster;
    }

    @JsonProperty("knockEnemyIntoTeamAndKill")
    public Integer getKnockEnemyIntoTeamAndKill() {
        return knockEnemyIntoTeamAndKill;
    }

    @JsonProperty("knockEnemyIntoTeamAndKill")
    public void setKnockEnemyIntoTeamAndKill(Integer knockEnemyIntoTeamAndKill) {
        this.knockEnemyIntoTeamAndKill = knockEnemyIntoTeamAndKill;
    }

    @JsonProperty("landSkillShotsEarlyGame")
    public Integer getLandSkillShotsEarlyGame() {
        return landSkillShotsEarlyGame;
    }

    @JsonProperty("landSkillShotsEarlyGame")
    public void setLandSkillShotsEarlyGame(Integer landSkillShotsEarlyGame) {
        this.landSkillShotsEarlyGame = landSkillShotsEarlyGame;
    }

    @JsonProperty("laneMinionsFirst10Minutes")
    public Integer getLaneMinionsFirst10Minutes() {
        return laneMinionsFirst10Minutes;
    }

    @JsonProperty("laneMinionsFirst10Minutes")
    public void setLaneMinionsFirst10Minutes(Integer laneMinionsFirst10Minutes) {
        this.laneMinionsFirst10Minutes = laneMinionsFirst10Minutes;
    }

    @JsonProperty("laningPhaseGoldExpAdvantage")
    public Integer getLaningPhaseGoldExpAdvantage() {
        return laningPhaseGoldExpAdvantage;
    }

    @JsonProperty("laningPhaseGoldExpAdvantage")
    public void setLaningPhaseGoldExpAdvantage(Integer laningPhaseGoldExpAdvantage) {
        this.laningPhaseGoldExpAdvantage = laningPhaseGoldExpAdvantage;
    }

    @JsonProperty("legendaryCount")
    public Integer getLegendaryCount() {
        return legendaryCount;
    }

    @JsonProperty("legendaryCount")
    public void setLegendaryCount(Integer legendaryCount) {
        this.legendaryCount = legendaryCount;
    }

    @JsonProperty("lostAnInhibitor")
    public Integer getLostAnInhibitor() {
        return lostAnInhibitor;
    }

    @JsonProperty("lostAnInhibitor")
    public void setLostAnInhibitor(Integer lostAnInhibitor) {
        this.lostAnInhibitor = lostAnInhibitor;
    }

    @JsonProperty("maxCsAdvantageOnLaneOpponent")
    public Integer getMaxCsAdvantageOnLaneOpponent() {
        return maxCsAdvantageOnLaneOpponent;
    }

    @JsonProperty("maxCsAdvantageOnLaneOpponent")
    public void setMaxCsAdvantageOnLaneOpponent(Integer maxCsAdvantageOnLaneOpponent) {
        this.maxCsAdvantageOnLaneOpponent = maxCsAdvantageOnLaneOpponent;
    }

    @JsonProperty("maxKillDeficit")
    public Integer getMaxKillDeficit() {
        return maxKillDeficit;
    }

    @JsonProperty("maxKillDeficit")
    public void setMaxKillDeficit(Integer maxKillDeficit) {
        this.maxKillDeficit = maxKillDeficit;
    }

    @JsonProperty("maxLevelLeadLaneOpponent")
    public Integer getMaxLevelLeadLaneOpponent() {
        return maxLevelLeadLaneOpponent;
    }

    @JsonProperty("maxLevelLeadLaneOpponent")
    public void setMaxLevelLeadLaneOpponent(Integer maxLevelLeadLaneOpponent) {
        this.maxLevelLeadLaneOpponent = maxLevelLeadLaneOpponent;
    }

    @JsonProperty("moreEnemyJungleThanOpponent")
    public Integer getMoreEnemyJungleThanOpponent() {
        return moreEnemyJungleThanOpponent;
    }

    @JsonProperty("moreEnemyJungleThanOpponent")
    public void setMoreEnemyJungleThanOpponent(Integer moreEnemyJungleThanOpponent) {
        this.moreEnemyJungleThanOpponent = moreEnemyJungleThanOpponent;
    }

    @JsonProperty("multiKillOneSpell")
    public Integer getMultiKillOneSpell() {
        return multiKillOneSpell;
    }

    @JsonProperty("multiKillOneSpell")
    public void setMultiKillOneSpell(Integer multiKillOneSpell) {
        this.multiKillOneSpell = multiKillOneSpell;
    }

    @JsonProperty("multiTurretRiftHeraldCount")
    public Integer getMultiTurretRiftHeraldCount() {
        return multiTurretRiftHeraldCount;
    }

    @JsonProperty("multiTurretRiftHeraldCount")
    public void setMultiTurretRiftHeraldCount(Integer multiTurretRiftHeraldCount) {
        this.multiTurretRiftHeraldCount = multiTurretRiftHeraldCount;
    }

    @JsonProperty("multikills")
    public Integer getMultikills() {
        return multikills;
    }

    @JsonProperty("multikills")
    public void setMultikills(Integer multikills) {
        this.multikills = multikills;
    }

    @JsonProperty("multikillsAfterAggressiveFlash")
    public Integer getMultikillsAfterAggressiveFlash() {
        return multikillsAfterAggressiveFlash;
    }

    @JsonProperty("multikillsAfterAggressiveFlash")
    public void setMultikillsAfterAggressiveFlash(Integer multikillsAfterAggressiveFlash) {
        this.multikillsAfterAggressiveFlash = multikillsAfterAggressiveFlash;
    }

    @JsonProperty("mythicItemUsed")
    public Integer getMythicItemUsed() {
        return mythicItemUsed;
    }

    @JsonProperty("mythicItemUsed")
    public void setMythicItemUsed(Integer mythicItemUsed) {
        this.mythicItemUsed = mythicItemUsed;
    }

    @JsonProperty("outerTurretExecutesBefore10Minutes")
    public Integer getOuterTurretExecutesBefore10Minutes() {
        return outerTurretExecutesBefore10Minutes;
    }

    @JsonProperty("outerTurretExecutesBefore10Minutes")
    public void setOuterTurretExecutesBefore10Minutes(Integer outerTurretExecutesBefore10Minutes) {
        this.outerTurretExecutesBefore10Minutes = outerTurretExecutesBefore10Minutes;
    }

    @JsonProperty("outnumberedKills")
    public Integer getOutnumberedKills() {
        return outnumberedKills;
    }

    @JsonProperty("outnumberedKills")
    public void setOutnumberedKills(Integer outnumberedKills) {
        this.outnumberedKills = outnumberedKills;
    }

    @JsonProperty("outnumberedNexusKill")
    public Integer getOutnumberedNexusKill() {
        return outnumberedNexusKill;
    }

    @JsonProperty("outnumberedNexusKill")
    public void setOutnumberedNexusKill(Integer outnumberedNexusKill) {
        this.outnumberedNexusKill = outnumberedNexusKill;
    }

    @JsonProperty("perfectDragonSoulsTaken")
    public Integer getPerfectDragonSoulsTaken() {
        return perfectDragonSoulsTaken;
    }

    @JsonProperty("perfectDragonSoulsTaken")
    public void setPerfectDragonSoulsTaken(Integer perfectDragonSoulsTaken) {
        this.perfectDragonSoulsTaken = perfectDragonSoulsTaken;
    }

    @JsonProperty("perfectGame")
    public Integer getPerfectGame() {
        return perfectGame;
    }

    @JsonProperty("perfectGame")
    public void setPerfectGame(Integer perfectGame) {
        this.perfectGame = perfectGame;
    }

    @JsonProperty("pickKillWithAlly")
    public Integer getPickKillWithAlly() {
        return pickKillWithAlly;
    }

    @JsonProperty("pickKillWithAlly")
    public void setPickKillWithAlly(Integer pickKillWithAlly) {
        this.pickKillWithAlly = pickKillWithAlly;
    }

    @JsonProperty("poroExplosions")
    public Integer getPoroExplosions() {
        return poroExplosions;
    }

    @JsonProperty("poroExplosions")
    public void setPoroExplosions(Integer poroExplosions) {
        this.poroExplosions = poroExplosions;
    }

    @JsonProperty("quickCleanse")
    public Integer getQuickCleanse() {
        return quickCleanse;
    }

    @JsonProperty("quickCleanse")
    public void setQuickCleanse(Integer quickCleanse) {
        this.quickCleanse = quickCleanse;
    }

    @JsonProperty("quickFirstTurret")
    public Integer getQuickFirstTurret() {
        return quickFirstTurret;
    }

    @JsonProperty("quickFirstTurret")
    public void setQuickFirstTurret(Integer quickFirstTurret) {
        this.quickFirstTurret = quickFirstTurret;
    }

    @JsonProperty("quickSoloKills")
    public Integer getQuickSoloKills() {
        return quickSoloKills;
    }

    @JsonProperty("quickSoloKills")
    public void setQuickSoloKills(Integer quickSoloKills) {
        this.quickSoloKills = quickSoloKills;
    }

    @JsonProperty("riftHeraldTakedowns")
    public Integer getRiftHeraldTakedowns() {
        return riftHeraldTakedowns;
    }

    @JsonProperty("riftHeraldTakedowns")
    public void setRiftHeraldTakedowns(Integer riftHeraldTakedowns) {
        this.riftHeraldTakedowns = riftHeraldTakedowns;
    }

    @JsonProperty("saveAllyFromDeath")
    public Integer getSaveAllyFromDeath() {
        return saveAllyFromDeath;
    }

    @JsonProperty("saveAllyFromDeath")
    public void setSaveAllyFromDeath(Integer saveAllyFromDeath) {
        this.saveAllyFromDeath = saveAllyFromDeath;
    }

    @JsonProperty("scuttleCrabKills")
    public Integer getScuttleCrabKills() {
        return scuttleCrabKills;
    }

    @JsonProperty("scuttleCrabKills")
    public void setScuttleCrabKills(Integer scuttleCrabKills) {
        this.scuttleCrabKills = scuttleCrabKills;
    }

    @JsonProperty("skillshotsDodged")
    public Integer getSkillshotsDodged() {
        return skillshotsDodged;
    }

    @JsonProperty("skillshotsDodged")
    public void setSkillshotsDodged(Integer skillshotsDodged) {
        this.skillshotsDodged = skillshotsDodged;
    }

    @JsonProperty("skillshotsHit")
    public Integer getSkillshotsHit() {
        return skillshotsHit;
    }

    @JsonProperty("skillshotsHit")
    public void setSkillshotsHit(Integer skillshotsHit) {
        this.skillshotsHit = skillshotsHit;
    }

    @JsonProperty("snowballsHit")
    public Integer getSnowballsHit() {
        return snowballsHit;
    }

    @JsonProperty("snowballsHit")
    public void setSnowballsHit(Integer snowballsHit) {
        this.snowballsHit = snowballsHit;
    }

    @JsonProperty("soloBaronKills")
    public Integer getSoloBaronKills() {
        return soloBaronKills;
    }

    @JsonProperty("soloBaronKills")
    public void setSoloBaronKills(Integer soloBaronKills) {
        this.soloBaronKills = soloBaronKills;
    }

    @JsonProperty("soloKills")
    public Integer getSoloKills() {
        return soloKills;
    }

    @JsonProperty("soloKills")
    public void setSoloKills(Integer soloKills) {
        this.soloKills = soloKills;
    }

    @JsonProperty("soloTurretsLategame")
    public Integer getSoloTurretsLategame() {
        return soloTurretsLategame;
    }

    @JsonProperty("soloTurretsLategame")
    public void setSoloTurretsLategame(Integer soloTurretsLategame) {
        this.soloTurretsLategame = soloTurretsLategame;
    }

    @JsonProperty("stealthWardsPlaced")
    public Integer getStealthWardsPlaced() {
        return stealthWardsPlaced;
    }

    @JsonProperty("stealthWardsPlaced")
    public void setStealthWardsPlaced(Integer stealthWardsPlaced) {
        this.stealthWardsPlaced = stealthWardsPlaced;
    }

    @JsonProperty("survivedSingleDigitHpCount")
    public Integer getSurvivedSingleDigitHpCount() {
        return survivedSingleDigitHpCount;
    }

    @JsonProperty("survivedSingleDigitHpCount")
    public void setSurvivedSingleDigitHpCount(Integer survivedSingleDigitHpCount) {
        this.survivedSingleDigitHpCount = survivedSingleDigitHpCount;
    }

    @JsonProperty("survivedThreeImmobilizesInFight")
    public Integer getSurvivedThreeImmobilizesInFight() {
        return survivedThreeImmobilizesInFight;
    }

    @JsonProperty("survivedThreeImmobilizesInFight")
    public void setSurvivedThreeImmobilizesInFight(Integer survivedThreeImmobilizesInFight) {
        this.survivedThreeImmobilizesInFight = survivedThreeImmobilizesInFight;
    }

    @JsonProperty("takedownOnFirstTurret")
    public Integer getTakedownOnFirstTurret() {
        return takedownOnFirstTurret;
    }

    @JsonProperty("takedownOnFirstTurret")
    public void setTakedownOnFirstTurret(Integer takedownOnFirstTurret) {
        this.takedownOnFirstTurret = takedownOnFirstTurret;
    }

    @JsonProperty("takedowns")
    public Integer getTakedowns() {
        return takedowns;
    }

    @JsonProperty("takedowns")
    public void setTakedowns(Integer takedowns) {
        this.takedowns = takedowns;
    }

    @JsonProperty("takedownsAfterGainingLevelAdvantage")
    public Integer getTakedownsAfterGainingLevelAdvantage() {
        return takedownsAfterGainingLevelAdvantage;
    }

    @JsonProperty("takedownsAfterGainingLevelAdvantage")
    public void setTakedownsAfterGainingLevelAdvantage(Integer takedownsAfterGainingLevelAdvantage) {
        this.takedownsAfterGainingLevelAdvantage = takedownsAfterGainingLevelAdvantage;
    }

    @JsonProperty("takedownsBeforeJungleMinionSpawn")
    public Integer getTakedownsBeforeJungleMinionSpawn() {
        return takedownsBeforeJungleMinionSpawn;
    }

    @JsonProperty("takedownsBeforeJungleMinionSpawn")
    public void setTakedownsBeforeJungleMinionSpawn(Integer takedownsBeforeJungleMinionSpawn) {
        this.takedownsBeforeJungleMinionSpawn = takedownsBeforeJungleMinionSpawn;
    }

    @JsonProperty("takedownsFirstXMinutes")
    public Integer getTakedownsFirstXMinutes() {
        return takedownsFirstXMinutes;
    }

    @JsonProperty("takedownsFirstXMinutes")
    public void setTakedownsFirstXMinutes(Integer takedownsFirstXMinutes) {
        this.takedownsFirstXMinutes = takedownsFirstXMinutes;
    }

    @JsonProperty("takedownsInAlcove")
    public Integer getTakedownsInAlcove() {
        return takedownsInAlcove;
    }

    @JsonProperty("takedownsInAlcove")
    public void setTakedownsInAlcove(Integer takedownsInAlcove) {
        this.takedownsInAlcove = takedownsInAlcove;
    }

    @JsonProperty("takedownsInEnemyFountain")
    public Integer getTakedownsInEnemyFountain() {
        return takedownsInEnemyFountain;
    }

    @JsonProperty("takedownsInEnemyFountain")
    public void setTakedownsInEnemyFountain(Integer takedownsInEnemyFountain) {
        this.takedownsInEnemyFountain = takedownsInEnemyFountain;
    }

    @JsonProperty("teamBaronKills")
    public Integer getTeamBaronKills() {
        return teamBaronKills;
    }

    @JsonProperty("teamBaronKills")
    public void setTeamBaronKills(Integer teamBaronKills) {
        this.teamBaronKills = teamBaronKills;
    }

    @JsonProperty("teamDamagePercentage")
    public Double getTeamDamagePercentage() {
        return teamDamagePercentage;
    }

    @JsonProperty("teamDamagePercentage")
    public void setTeamDamagePercentage(Double teamDamagePercentage) {
        this.teamDamagePercentage = teamDamagePercentage;
    }

    @JsonProperty("teamElderDragonKills")
    public Integer getTeamElderDragonKills() {
        return teamElderDragonKills;
    }

    @JsonProperty("teamElderDragonKills")
    public void setTeamElderDragonKills(Integer teamElderDragonKills) {
        this.teamElderDragonKills = teamElderDragonKills;
    }

    @JsonProperty("teamRiftHeraldKills")
    public Integer getTeamRiftHeraldKills() {
        return teamRiftHeraldKills;
    }

    @JsonProperty("teamRiftHeraldKills")
    public void setTeamRiftHeraldKills(Integer teamRiftHeraldKills) {
        this.teamRiftHeraldKills = teamRiftHeraldKills;
    }

    @JsonProperty("threeWardsOneSweeperCount")
    public Integer getThreeWardsOneSweeperCount() {
        return threeWardsOneSweeperCount;
    }

    @JsonProperty("threeWardsOneSweeperCount")
    public void setThreeWardsOneSweeperCount(Integer threeWardsOneSweeperCount) {
        this.threeWardsOneSweeperCount = threeWardsOneSweeperCount;
    }

    @JsonProperty("tookLargeDamageSurvived")
    public Integer getTookLargeDamageSurvived() {
        return tookLargeDamageSurvived;
    }

    @JsonProperty("tookLargeDamageSurvived")
    public void setTookLargeDamageSurvived(Integer tookLargeDamageSurvived) {
        this.tookLargeDamageSurvived = tookLargeDamageSurvived;
    }

    @JsonProperty("turretPlatesTaken")
    public Integer getTurretPlatesTaken() {
        return turretPlatesTaken;
    }

    @JsonProperty("turretPlatesTaken")
    public void setTurretPlatesTaken(Integer turretPlatesTaken) {
        this.turretPlatesTaken = turretPlatesTaken;
    }

    @JsonProperty("turretTakedowns")
    public Integer getTurretTakedowns() {
        return turretTakedowns;
    }

    @JsonProperty("turretTakedowns")
    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    @JsonProperty("turretsTakenWithRiftHerald")
    public Integer getTurretsTakenWithRiftHerald() {
        return turretsTakenWithRiftHerald;
    }

    @JsonProperty("turretsTakenWithRiftHerald")
    public void setTurretsTakenWithRiftHerald(Integer turretsTakenWithRiftHerald) {
        this.turretsTakenWithRiftHerald = turretsTakenWithRiftHerald;
    }

    @JsonProperty("twentyMinionsIn3SecondsCount")
    public Integer getTwentyMinionsIn3SecondsCount() {
        return twentyMinionsIn3SecondsCount;
    }

    @JsonProperty("twentyMinionsIn3SecondsCount")
    public void setTwentyMinionsIn3SecondsCount(Integer twentyMinionsIn3SecondsCount) {
        this.twentyMinionsIn3SecondsCount = twentyMinionsIn3SecondsCount;
    }

    @JsonProperty("unseenRecalls")
    public Integer getUnseenRecalls() {
        return unseenRecalls;
    }

    @JsonProperty("unseenRecalls")
    public void setUnseenRecalls(Integer unseenRecalls) {
        this.unseenRecalls = unseenRecalls;
    }

    @JsonProperty("visionScoreAdvantageLaneOpponent")
    public Integer getVisionScoreAdvantageLaneOpponent() {
        return visionScoreAdvantageLaneOpponent;
    }

    @JsonProperty("visionScoreAdvantageLaneOpponent")
    public void setVisionScoreAdvantageLaneOpponent(Integer visionScoreAdvantageLaneOpponent) {
        this.visionScoreAdvantageLaneOpponent = visionScoreAdvantageLaneOpponent;
    }

    @JsonProperty("visionScorePerMinute")
    public Integer getVisionScorePerMinute() {
        return visionScorePerMinute;
    }

    @JsonProperty("visionScorePerMinute")
    public void setVisionScorePerMinute(Integer visionScorePerMinute) {
        this.visionScorePerMinute = visionScorePerMinute;
    }

    @JsonProperty("wardTakedowns")
    public Integer getWardTakedowns() {
        return wardTakedowns;
    }

    @JsonProperty("wardTakedowns")
    public void setWardTakedowns(Integer wardTakedowns) {
        this.wardTakedowns = wardTakedowns;
    }

    @JsonProperty("wardTakedownsBefore20M")
    public Integer getWardTakedownsBefore20M() {
        return wardTakedownsBefore20M;
    }

    @JsonProperty("wardTakedownsBefore20M")
    public void setWardTakedownsBefore20M(Integer wardTakedownsBefore20M) {
        this.wardTakedownsBefore20M = wardTakedownsBefore20M;
    }

    @JsonProperty("wardsGuarded")
    public Integer getWardsGuarded() {
        return wardsGuarded;
    }

    @JsonProperty("wardsGuarded")
    public void setWardsGuarded(Integer wardsGuarded) {
        this.wardsGuarded = wardsGuarded;
    }

    @JsonProperty("firstTurretKilledTime")
    public Double getFirstTurretKilledTime() {
        return firstTurretKilledTime;
    }

    @JsonProperty("firstTurretKilledTime")
    public void setFirstTurretKilledTime(Double firstTurretKilledTime) {
        this.firstTurretKilledTime = firstTurretKilledTime;
    }

    @JsonProperty("highestChampionDamage")
    public Integer getHighestChampionDamage() {
        return highestChampionDamage;
    }

    @JsonProperty("highestChampionDamage")
    public void setHighestChampionDamage(Integer highestChampionDamage) {
        this.highestChampionDamage = highestChampionDamage;
    }

    @JsonProperty("shortestTimeToAceFromFirstTakedown")
    public Double getShortestTimeToAceFromFirstTakedown() {
        return shortestTimeToAceFromFirstTakedown;
    }

    @JsonProperty("shortestTimeToAceFromFirstTakedown")
    public void setShortestTimeToAceFromFirstTakedown(Double shortestTimeToAceFromFirstTakedown) {
        this.shortestTimeToAceFromFirstTakedown = shortestTimeToAceFromFirstTakedown;
    }

    @JsonProperty("highestCrowdControlScore")
    public Integer getHighestCrowdControlScore() {
        return highestCrowdControlScore;
    }

    @JsonProperty("highestCrowdControlScore")
    public void setHighestCrowdControlScore(Integer highestCrowdControlScore) {
        this.highestCrowdControlScore = highestCrowdControlScore;
    }

    public String getHadAfkTeammate() {
        return hadAfkTeammate;
    }

    public void setHadAfkTeammate(String hadAfkTeammate) {
        this.hadAfkTeammate = hadAfkTeammate;
    }

    public Integer get_12AssistStreakCount() {
        return _12AssistStreakCount;
    }

    public void set_12AssistStreakCount(Integer _12AssistStreakCount) {
        this._12AssistStreakCount = _12AssistStreakCount;
    }
}