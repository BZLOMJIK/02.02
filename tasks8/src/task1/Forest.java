package task1;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    // время года одинаково для всех смешанных лесов — статическое и закрытое поле,
    // чтобы его нельзя было сменить в обход setSeason()
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if ("зима".equals(season)) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    public static String getSeason() {
        return season;
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
