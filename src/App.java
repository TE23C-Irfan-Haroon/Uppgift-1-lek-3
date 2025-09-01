
import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        int age;
        int heigth;
        int vuxen;

        while (true) {
            System.out.println("Hur gammal är du?");
            try {
                age = tb.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Använd siffror");
                tb.nextLine();
            }
        }
        while (true) {
            System.out.println("Hur långt är du? (Cm)");
            try {
                heigth = tb.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Använd siffror");
                tb.nextLine();
            }
        }
        while (true) {
            System.out.println("Är du med en vuxen?");
            System.out.println("1. Ja");
            System.out.println("2. Nej");
            try {
                vuxen = tb.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Använd siffror");
                tb.nextLine();
            
            }
        }

        boolean end = true;
        int val;
        int kuponger = 10;

        while (end = true) {
            System.out.println("Välkommen välj attraktion!");
            System.out.println("Kuponger:" + kuponger);
            System.out.println("1. Cirkuskarusellen");
            System.out.println("2. Flygande mattan");
            System.out.println("3. Pumpen");
            System.out.println("4. Gå hem");

            System.out.println("Ange val:");
            val = tb.nextInt();
            if (val == 4) {
                System.out.println("Du gick hem");
                end = false;
                break;
            } else if (val == 1) {
                if (kuponger >= 1) {
                    kuponger -= 1;
                    System.out.println("WOOOOOOOO DU går runt i cirklar");
                } else {
                    System.out.println("Inte tillräcklig kuponger!!");
                }
            } else if (val == 2) {
                if (kuponger >= 2 && heigth >= 140 && age >= 8) {
                    kuponger -= 2;
                    System.out.println("WOOOOOOOO DU FLYGER PÅ FLYGANDE MATTAN");
                } else {
                    System.out.println("Du kan inte åka den tyvärr!!");
                }
            } else if (val == 3) {
                if (vuxen == 1) {
                    if (kuponger >= 3 && heigth >= 95 && age >= 4) {
                        kuponger -= 3;
                        System.out.println("WOOOOOOO PUMPEN");
                    } else {
                        System.out.println("Du kan inte åka den tyvärr!!");
                    }
                } else if (vuxen == 2) {
                    if (kuponger >= 3 && heigth >= 120 && age >= 6) {
                        kuponger -= 3;
                        System.out.println("WOOOOOOO PUMPEN");
                    } else {
                        System.out.println("Du kan inte åka den tyvärr!!");
                    }

                }

            }
            tb.nextLine();
            tb.nextLine();

        }

        tb.close();
    }

}
