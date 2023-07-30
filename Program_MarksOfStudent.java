//Write a program that will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:

//  Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail

import java.util.Scanner;

public class Program_MarksOfStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Marks: ");
        int marks = in.nextInt();

        if(marks >= 91 && marks <= 100){
            System.out.println("Congratulations You've scored AA Grade");
        }
        else if(marks >= 81 && marks <= 90){
            System.out.println("Congratulations You've scored AB Grade");
        }
        else if(marks >= 71 && marks <= 80){
            System.out.println("Congratulations You've scored BB Grade");
        }
        else if(marks >= 61 && marks <= 70){
            System.out.println("Congratulations You've scored BC Grade");
        }
        else if(marks >= 51 && marks <= 60){
            System.out.println("Congratulations You've scored CD Grade");
        }
        else if(marks >= 41 && marks <= 50){
            System.out.println("Congratulations You've scored DD Grade");
        }else if(marks <= 40){
            System.out.println("Sorry, You've failed");
        }
    }
    
}
