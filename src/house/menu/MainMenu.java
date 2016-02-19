package house.menu;

import house.house1.House1;

import java.util.Scanner;

public class MainMenu {

    House1 casa = new House1();

    void meniu() {
        Scanner userInput = new Scanner(System.in);
        int i;

        do {
            System.out.println("Apasa: 1 - deschide casa si a dezactiva alarma");
            System.out.println("Apasa: 2 - inchide casa si activa alarma");
            System.out.println("Apasa: 3 - pentru iesire din program");
            i = userInput.nextInt();

            switch (i) {
                case 1:
                    casa.deschideCasa();
                    break;
                case 2:
                    casa.inchideCasa();
                    break;
                default:
                    System.out.println("");
            }
            if (i > 3) {
                System.out.println("Comanda gresita!");

            }

        } while (i != 3);
    }

    public static void main(String[] args) {
        MainMenu menuObj = new MainMenu();
        menuObj.meniu();

    }
}