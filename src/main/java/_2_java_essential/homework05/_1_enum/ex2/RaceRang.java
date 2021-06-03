package _2_java_essential.homework05._1_enum.ex2;

enum RaceRang {
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
