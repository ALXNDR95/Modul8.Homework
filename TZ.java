package Modul8.Homework;

import java.util.TimeZone;

public class TZ {
    public static void main(String[] args) {
        String[] availableTZ = TimeZone.getAvailableIDs();

        for (String timezone : availableTZ) {
            System.out.println("Timezone ID = " + timezone);
        }
    }
}

