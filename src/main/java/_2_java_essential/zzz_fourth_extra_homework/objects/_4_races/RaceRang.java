package _2_java_essential.zzz_fourth_extra_homework.objects._4_races;

public enum RaceRang {
    SUPERIOR_RACE("Высшая раса"),
    HIGH_RACE("Средняя раса"),
    NORMAL_RACE("Обычная раса");

    private String raceStatus;

    RaceRang(String raceStatus) {
        this.raceStatus = raceStatus;
    }

    public String getStatus() {
        return raceStatus;
    }
}
