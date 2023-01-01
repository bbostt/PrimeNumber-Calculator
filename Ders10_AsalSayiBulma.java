import java.util.Scanner;

public class Ders10_AsalSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        isAsal(number, 2);
    }

    static boolean isAsal(int number, int i) {
    	
        if(number == 1) {
        	System.out.println(number + " is not a prime number.");
        	return false;
        }

        if (i == number) {
            System.out.println(number + "  is a prime number.");
            return true;

        } else if (number % i == 0) {
            System.out.println(number + "  is not a prime number.");
            return false;

        }

        return isAsal(number, i + 1);

    }
}