package house.house1;

import house.alarm.Alarm;

public class House1 {

    Alarm alarm1 = new Alarm();

    public void deschideCasa() {
        alarm1.alarmaDezactivata();
        System.out.println("Usile sunt deschise");
    }

    public void inchideCasa() {
        alarm1.alarmaActivata();
        System.out.println("Usile sunt inchise");
    }
}