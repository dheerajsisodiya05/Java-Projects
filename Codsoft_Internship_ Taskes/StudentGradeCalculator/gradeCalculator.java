
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        int user = input.nextInt();
        /* create array taking input from user */
        int[] marks = new int[user];


        for (int i = 0; i < marks.length; i++) {

            if (marks[i] >= 0 && marks[i] <= 100) {
                System.out.print("Enter the " + i + " subject(out of 1-100) : ");
                marks[i] = input.nextInt();

            } else {
                System.out.println("invalid statement ");
                break;
            }
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double subSum = user * 100;
        double averagePercentage = (totalMarks / subSum) * 100;
        System.out.println("average percentage : " + averagePercentage);
        /* print the grade as per average percentage */
        if (averagePercentage >= 90) {
            System.out.println("Obtain grade 'A'");
        } else if(!(averagePercentage <= 70 || averagePercentage >= 90)) {
            System.out.println("Obtain grade 'B'");
        } else if(!(averagePercentage < 57 || averagePercentage > 70)) {
            System.out.println("Obtain grade 'C'");
        } else if(averagePercentage > 33 || averagePercentage<=57) {
            System.out.println("Obtain grade 'D'");
        } else {
            System.out.println("!!Failed!!");
        }
    }

}
