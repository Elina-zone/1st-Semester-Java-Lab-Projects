import java.util.Scanner;

public class LabTask74 {
    public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number pattern you wanna print: ");
	int N = input.nextInt();

	if (N == 1) {
		for (int i = 1; i <= 4; i++) {
		System.out.print("* * * * * * * * * * \n");
		}
	}

	if (N == 2) {
		for (int i = 1; i <=5; i++) {  //loop for rows

	 	//loop for printing stars
		for (int j = 1; j <= i; j++) {
		System.out.print("* ");
		}
	        System.out.println(); //move to next line
	        }
	}

	if (N == 3) {
		for (int i = 1; i <= 5; i++) {     // "outer loop", controlling rows of the triangle
                
                for (int j = 1; j <= 5 - i; j++) {   // "inner loop", the number of spaces printed is (5 - i)

                System.out.print("  ");         // Two spaces for better allignment
                }

                // printing stars
		for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }

		System.out.println();// move to the next line
                }

        }

	
        if (N == 4) {
            for (int i = 1; i <= 5; i++) {// "outer loop", controlling rows of the triangle
                // printing spaces
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");  // move to next line
                }
                // printing stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();// move to the next line
                }

          }

	
        for (int i = 1; i <= 5 (2 * j - 1); i++) {         // outer loop

            for (int j = 1; j <= i; j++) {    // inner loop

                System.out.print(i);      // printing i (numbers)

            }

            System.out.println();

        }

     }

 }


		

	
	