package Lesson2_1;

import java.util.Scanner;

public class DayOfWeek
{

    public static void Start()
    {
        for (Days o : Days.values())

            System.out.print(o + " ");

        for (Weekend weekend : Weekend.values())

            System.out.print(weekend + " ");

        System.out.println("\nВведите день недели");

    }

    public static void Logic()
    {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        boolean countryExists = false;

        for (Days saturday : Days.values())

            if (userInput.equalsIgnoreCase(saturday.name()))
            {
                countryExists = true;

                System.out.println("Осталось отработать" + " " + saturday.getTime() + " " + "часа(ов)");

                break;
            }

        for (Weekend weekend : Weekend.values())

            if (userInput.equalsIgnoreCase(weekend.name()))
            {
                countryExists = true;

                System.out.println(weekend.getWorkingDay());

                break;
            }

        if (!countryExists)
        {
            System.err.println("Введите корректный день недели");
        }
    }
}