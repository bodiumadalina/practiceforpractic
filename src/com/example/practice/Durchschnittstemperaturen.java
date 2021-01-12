package com.example.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Durchschnittstemperaturen {
    public static void printMenu()
    {
        System.out.println("What would you like to do ?");
        System.out.println("1.See city list");
        System.out.println("2.Add temperatures");
    }
    public static void main(String[] args){


        ArrayList<Stadt> stadts = new ArrayList<>();
        ArrayList<Temperatur> tempsobj = new ArrayList<>() ;

        while(true) {
            printMenu();
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();



            if (option.equals("1"))
            {
                System.out.println("Stadt list : ");
                for (int c = 0; c < stadts.size(); c++)
                    System.out.println(stadts.get(c));
            }

            if(option.equals("2")){
            System.out.println("What city would you like to add temperatures for?");
            // Using Scanner for Getting Input from User
            String city = in.nextLine();
            while(!city.matches("^[a-zA-Z0_]*$"))
            {
                System.out.println("Not a valid city! Try again");
                city = in.nextLine();
            }


            System.out.println("What temperatures would you like to add for " + city);
            String s= in.nextLine();


            while(!s.matches("^[0-9 ]*$"))
                {
                    System.out.println("Not avalid temp! Try again");
                    s = in.nextLine();
                }

            String[] temps = s.split(" ");
            int[] numbers = new int[temps.length];
            for (int i = 0; i < temps.length; i++) {
                numbers[i] = Integer.parseInt(temps[i]);
            }
            System.out.println("For what months are this temperatures? Use only JAN FEB MAR etc..");
            s= in.nextLine();

            while(!s.matches("^[JAN|FEB|MAR|APR ]*$") || s.split(" ").length!= numbers.length)
                {
                    System.out.println("Not valid months! Try again");
                    s = in.nextLine();
                }
            String[] months = s.split(" ");

            for (int c = 0; c < numbers.length; c++) {
                tempsobj.add(new Temperatur(numbers[c], "Celsius", months[c]));

            }

            boolean isAlready = false;
            for (int counter = 0; counter < stadts.size(); counter++) {
                System.out.println(s);
                if (s.equals(stadts.get(counter).getName())) {
                    System.out.println(stadts.get(counter).getName());
                    stadts.get(counter).addTemperature(tempsobj);
                    isAlready = true;
                }

            }

            if (!isAlready) {
                stadts.add(new Stadt(city, "Bavaria", tempsobj));
            }




        }
        }


    }
}
