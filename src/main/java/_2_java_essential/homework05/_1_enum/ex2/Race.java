package _2_java_essential.homework05._1_enum.ex2;

enum Race {
    ELDAR("Эльдар", RaceRang.NORMAL_RACE),
    ELKAS("Элькас", RaceRang.NORMAL_RACE),
    NEPHELIM("Нефелим", RaceRang.SUPERIOR_RACE),
    SILFID("Сильфид", RaceRang.HIGH_RACE),
    ARCHONT("Архонт", RaceRang.HIGH_RACE);


    private String race;
    private RaceRang raceStatus;

    Race(String race, RaceRang raceStatus) {
        this.race = race;
        this.raceStatus = raceStatus;
    }

    public String getRace() {
        return race;
    }

    public RaceRang getRaceStatus() {
        return raceStatus;
    }
}
