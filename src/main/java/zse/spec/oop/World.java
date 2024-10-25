package zse.spec.oop;

import java.util.Arrays;
import java.util.Objects;

public class World {
    static void run(String kierunki[])
    {
        String komunikat;
        for(String kierunek : kierunki)
        {
            /*System.out.print(kierunek+", ");
            if (kierunek.equals(kierunki[kierunki.length-1]))
            {
                System.out.print(kierunek);
            } else {
                System.out.print(kierunek+", ");
            }
            */
            komunikat = switch (kierunek)
            {
                case "f" -> "Zwierzak idzie do przodu";
                case "b" -> "Zwierzak idzie do tylu";
                case "r" -> "Zwierzak idzie w prawo";
                case "l" -> "Zwierzak idzie w lewo";
                default -> "NIEZNANY KIERUNEK";
            };
            System.out.println(komunikat);
        }
        System.out.println();
        //System.out.println("Zwierzak idzie do przodu");
    }
    public static void main(String[] args)
    {
        System.out.println("System wystartowal");
        run(args);
        System.out.println("System zakonczyl dzialanie");
    }
}
