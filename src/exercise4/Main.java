package exercise4;
/*
Exercise 4:
Write a program that calculates how the US population are projected to be in 5 years.
Print the growth & sum
 */
public class Main {
    public static void main(String[] args) {
        //Calculate on the following assumption:
        int currentPopulation = 331002651;
        int yearsInTheFuture = 5;
        int birthPrSecond = 7;
        int deathPrSecond = 13;

        //Calculate how many seconds there are in 5 years
        int secondsInAMinute = 60;
        int minutesInAnHour = 60;
        int hoursInADay = 24;
        int daysInAYear = 365;

        int secondsIn5Years = secondsInAMinute * minutesInAnHour * hoursInADay * daysInAYear * yearsInTheFuture;

        //Calculate growth in birth and death
        int birthGrowth = secondsIn5Years / birthPrSecond;      //antallet der bliver født på 5 år
        int deathGrowth = secondsIn5Years/ deathPrSecond;       //antallet der dør i alt på 5 år

        //Growth
        int growthIn5Years = birthGrowth - deathGrowth;
        System.out.println("The population will qrow with " + growthIn5Years + " people");

        //The sum
        int sumOfPopulationIn5Years = currentPopulation + growthIn5Years;
        System.out.println("The sum of US population in " + yearsInTheFuture + " years will then be " + sumOfPopulationIn5Years + " people");

    }


}
