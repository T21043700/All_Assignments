package Assignment1;

import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {

        //Assignment 01

        //Variables declaration
        String studentName;                                     //Student name
        int subject1Grade;                                      //Subject 1 grade
        int subject2Grade;                                      //Subject 2 grade
        int subject3Grade;                                      //Subject 3 grade
        int totalMarks;                                         //Total of the 3 subjects
        float averageMarks;                                     //Average of student marks
        String finalGrade ="";                                  //Final student grade
        String message = "";                                    //Message displays for the user
        Scanner studentDetails = new Scanner(System.in);        //used to read user input


        //Receive inputs from user
        System.out.print("Enter student name: ");               //User enters his name
        studentName = studentDetails.nextLine();                //Save the username in a variable

        System.out.print("Enter marks for subject 1: ");        //user enters subject 1 grade
        subject1Grade = studentDetails.nextInt();               //Save subject 1 grade in a variable
        studentDetails.nextLine();                              //IMPORTANT: Consume the enter after nextInt() method

        System.out.print("Enter marks for subject 2: " );       //user enters subject 2 grade
        subject2Grade = studentDetails.nextInt();               //Save subject 2 grade in a variable
        studentDetails.nextLine();                              //IMPORTANT: Consume the enter after nextInt() method

        System.out.print("Enter marks for subject 3: " );       //user enters subject 3 grade
        subject3Grade = studentDetails.nextInt();               //Save subject 3 grade in a variable
        studentDetails.nextLine();                              //IMPORTANT: Consume the enter after nextInt() method

        totalMarks = subject1Grade + subject2Grade + subject3Grade;     //Calculate total marks
        averageMarks = (float) totalMarks/3;                    //Calculate average grades


        //Use if statement to calculate student final grade according to his average marks
        if (averageMarks <60){
            finalGrade = "F";
        } else if (averageMarks >=60 && averageMarks <=69) {
            finalGrade = "D";
        } else if (averageMarks >=70 && averageMarks <=79) {
            finalGrade = "C";
        } else if (averageMarks >=80 && averageMarks <=89) {
            finalGrade = "B";
        } else if (averageMarks >=90 && averageMarks <=100) {
            finalGrade = "A";
        } else {
            System.out.println("Please, enter a valid grade between 0 and 100.");
        }


        //Use switch statement to display a message to the user to motivate him
        switch (finalGrade){
            case "F":
                message ="You need to improve.";
                break;
            case "D":
                message ="You passed, but aim higher.";
                break;
            case "C":
                message ="Good effort!";
                break;
            case "B":
                message ="Great job!";
                break;
            case "A":
                message ="Excellent work!";
                break;
            default:
                System.out.println("Please, try again because there is something wrong. May be grade not between 0 and 100.");

        }

        //Show all information to the user
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Marks = " + averageMarks);
        System.out.println("Grade: " + finalGrade);
        System.out.println("Message: " + message);
    }
}