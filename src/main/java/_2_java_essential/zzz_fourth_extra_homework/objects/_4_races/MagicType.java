package _2_java_essential.zzz_fourth_extra_homework.objects._4_races;

public enum  MagicType {
    ELEMENTAL_MAGIC("Стихийная магия"),
    RUNE_MAGIC("Руническая магия"),
    WEAPON_MAGIC("Магия оружия"),
    ABSORPTION_MAGIC("Магия поглощения"),
    RAGE_MAGIC("Магия ярости"),
    SUPPORT_MAGIC("Магия поддержки"),
    BLOOD_MAGIC("Магия крови"),
    SEAL_MAGIC("Магия печатей");

    private String type;

    MagicType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
