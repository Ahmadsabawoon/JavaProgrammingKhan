package practice_03_17_2021;

public class ageGroup {
    public static void main(String[] args) {
        /*
        =======================================================

Write a program that can define the age groups of a person.

Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.

Age groups:
Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39),
Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74),
Senior Citizen (75 - 84), Old Senior Citizen (85+)

Based on the given age find and print which age group they are in.
         */
        int age = 10;

        if(age > 0 && age < 120) { // if ( age > 120 || age < 0)
            // valid age
            if (age <= 2) {
                System.out.println("Infant");
            }else if (age >= 3 && age <= 5){  // 3-5  vs age <= 5
                System.out.println("Toddler");
            } else if ( age >= 6 && age <= 9) {

            }else {
                System.out.println("Invalid age ");
            }
        }
























    }
}
