package practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration2 {
        /*
[Movie duration]

The length of the movie will determine how much it costs.
Use a Scanner object to read the input from the user for how long the movie is and print
out how much the movie will cost.
The length will be given as a decimal as hours.minutes
> 1.0 - 8.99
> 1.5 - 10.50
> 2.0 - 12.99
> 2.5 - 14.50
-> 3 or more - 15.99

 */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the movie");
        double moviesLength = scan.nextDouble();
        double price = 0;

        if (moviesLength == 1) {
            price = 8.99;

        }

        if(moviesLength == 1.5) {
             price = 10.50;

        }
        if(moviesLength == 2.0) {
            price = 12.99;
        }
        if(moviesLength == 2.5) {
            price = 14.50;
        }
        if(moviesLength >= 3.0) {
           price = 15.99;
        }
        System.out.println("price " + price);


    }
}
