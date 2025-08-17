package Assignment3;

import java.util.Objects;
import java.util.Scanner;

public class StudentLoginSystem_SecondTry {
    public static void main(String[] args) {
        //Assignment 2
        validateUserCredentials();
    }
    public static void validateUserCredentials() {
        //Variables declaration
        Scanner loginCredentials = new Scanner(System.in);          //Accepts user input.
        String userName = "mohamed@intrast.com";                    //Correct username.
        String password = "mohamed123";                             //Correct password.
        String tryUserName;                                         //used to check username that enters.
        String tryPassword;                                         //used to check password that enters.
        char finalGrade = 'a';                                      //Stores final grade after user enter it.

        //Validate if user enters correct username firstly, then validate if user enters correct password,
        //user has just 3 attempts to try username and password.
        System.out.print("Please, enter your user name: ");
        tryUserName = loginCredentials.nextLine();
        if (Objects.equals(tryUserName, userName)) {
            System.out.print("Please, enter your password: ");
            tryPassword = loginCredentials.nextLine();

            if (Objects.equals(tryPassword, password)) {
                detailsAfterCorrectCredentials(loginCredentials, finalGrade);
            } else {
                System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                tryPassword = loginCredentials.nextLine();
                if (Objects.equals(tryPassword, password)) {
                    detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                } else {
                    System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                    tryPassword = loginCredentials.nextLine();
                    if (Objects.equals(tryPassword, password)) {
                        detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                    } else {
                        System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                    }
                }
            }
        } else {
            System.out.print("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT 2 OF 3): ");
            tryUserName = loginCredentials.nextLine();
            if (Objects.equals(tryUserName, userName)) {
                System.out.print("Please, enter your password: ");
                tryPassword = loginCredentials.nextLine();

                if (Objects.equals(tryPassword, password)) {
                    detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                } else {
                    System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                    tryPassword = loginCredentials.nextLine();
                    if (Objects.equals(tryPassword, password)) {
                        detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                    } else {
                        System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                        tryPassword = loginCredentials.nextLine();
                        if (Objects.equals(tryPassword, password)) {
                            detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                        } else {
                            System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                        }
                    }
                }
            } else {
                System.out.print("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                tryUserName = loginCredentials.nextLine();

                if (Objects.equals(tryUserName, userName)) {
                    System.out.print("Please, enter your password: ");
                    tryPassword = loginCredentials.nextLine();

                    if (Objects.equals(tryPassword, password)) {
                        detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                    } else {
                        System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                        tryPassword = loginCredentials.nextLine();
                        if (Objects.equals(tryPassword, password)) {
                            detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                        } else {
                            System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                            tryPassword = loginCredentials.nextLine();
                            if (Objects.equals(tryPassword, password)) {
                                detailsAfterCorrectCredentials(loginCredentials, finalGrade);
                            } else {
                                System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                            }
                        }
                    }
                } else {
                    System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                }
            }
        }
    }
    public static void detailsAfterCorrectCredentials(
            Scanner loginCredentials,
            char finalGrade)
    {
        System.out.print("Please, enter your student code: ");
        final int studentCode = loginCredentials.nextInt();
        loginCredentials.nextLine();
        System.out.print("Please, enter your full name: ");
        String fullName = loginCredentials.nextLine();
        System.out.print("Please, enter your age: ");
        int age = loginCredentials.nextInt();
        loginCredentials.nextLine();
        System.out.print("Please, enter your marks: ");
        float averageMarks = loginCredentials.nextInt();
        loginCredentials.nextLine();

        //Use if statement to calculate student final grade according to his average marks
        if (averageMarks < 60) {
            finalGrade = 'F';
        } else if (averageMarks <= 69) {
            finalGrade = 'D';
        } else if (averageMarks >= 70 && averageMarks <= 79) {
            finalGrade = 'C';
        } else if (averageMarks >= 80 && averageMarks <= 89) {
            finalGrade = 'B';
        } else if (averageMarks >= 90 && averageMarks <= 100) {
            finalGrade = 'A';
        } else {
            System.out.println("Please, enter a valid grade between 0 and 100.");
        }
        System.out.println();
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Student Code: " + studentCode);
        System.out.println("Marks: " + averageMarks);
        System.out.println("Grade: " + finalGrade);
    }
}
