package Assignment3;

import java.util.Objects;
import java.util.Scanner;

public class StudentLoginSystem_FourthTry {
    static boolean isMarksFloat;

    public static void main(String[] args) {
        //Assignment 3


        validateUserCredentials();
    }

    public static void validateUserCredentials() {
        //Variables declaration
        Scanner loginCredentials = new Scanner(System.in);          //Accepts user input.
        String userName = "mohamed@intrast.com";                    //Correct username.
        String password = "mohamed123";                             //Correct password.
        String tryUserName;                                         //used to check username that enters.
        int usernameAttempts = 1;                                   //check how many times user enter username.

        //Validate if user enters correct username firstly, then validate if user enters correct password,
        //user has just 3 attempts to try username and password.
        System.out.print("Please, enter your user name: ");
        tryUserName = loginCredentials.nextLine();
        if (Objects.equals(tryUserName, userName)) {
            validatePassword(loginCredentials, password);
        } else {
            usernameAttempts++;
            System.out.print("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT " + usernameAttempts + " OF 3): ");
            tryUserName = loginCredentials.nextLine();

            if (Objects.equals(tryUserName, userName)) {
                validatePassword(loginCredentials, password);
            } else {
                usernameAttempts++;
                System.out.print("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT " + usernameAttempts + " OF 3 FINAL ATTEMPT): ");
                tryUserName = loginCredentials.nextLine();

                if (Objects.equals(tryUserName, userName)) {
                    validatePassword(loginCredentials, password);
                } else {
                    System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                }
            }
        }
    }

    //Validate user password
    public static void validatePassword(Scanner loginCredentials, String password) {
        int passwordAttempts = 1;
        System.out.print("Please, enter your password: ");
        String tryPassword = loginCredentials.nextLine();
        if (Objects.equals(tryPassword, password)) {
            detailsAfterCorrectCredentials(loginCredentials);
        } else {
            passwordAttempts++;
            System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT " + passwordAttempts + " OF 3): ");
            tryPassword = loginCredentials.nextLine();
            if (Objects.equals(tryPassword, password)) {
                detailsAfterCorrectCredentials(loginCredentials);
            } else {
                passwordAttempts++;
                System.out.print("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT " + passwordAttempts + " OF 3 FINAL ATTEMPT): ");
                tryPassword = loginCredentials.nextLine();
                if (Objects.equals(tryPassword, password)) {
                    detailsAfterCorrectCredentials(loginCredentials);
                } else {
                    System.out.print("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                }
            }
        }
    }

    public static void validateEntries(Scanner loginCredentials, String entry) {
        switch (entry) {
            case "code" -> {
                while (!loginCredentials.hasNextInt()) {
                    System.out.print("That's not a valid " + entry + ",it must contain numbers only. Please try again:");
                    loginCredentials.next(); // Consume the invalid input
                }
            }
            case "marks", "age" -> {
                float averageMarks = 0, age = loginCredentials.nextFloat();
                while (!loginCredentials.hasNextFloat()) {
                    System.out.print("That's not a valid " + entry + ",it must contain numbers only. Please try again:");
                }
                if (averageMarks > 0f && averageMarks <= 100f) {
                    loginCredentials.next();
                }
            }
            case null, default -> {
                System.out.print("That's not a valid " + entry + ", it must contain numbers only and between 1 and 100. Please try again:");
                loginCredentials.next();
            }
        }
    }

    //Collect and print details enter from the user
    public static void detailsAfterCorrectCredentials(Scanner loginCredentials) {
        //Collect Student code
        //boolean isMarksFloat = false;
        System.out.print("Please, enter your student code: ");
        validateEntries(loginCredentials, "code");
        final int studentCode = loginCredentials.nextInt();
        loginCredentials.nextLine();

        //Collect student full name
        System.out.print("Please, enter your full name: ");
        String fullName = loginCredentials.nextLine();

        //Collect student age
        System.out.print("Please, enter your age: ");
        validateEntries(loginCredentials, "age");
        float age = loginCredentials.nextFloat();
        loginCredentials.next();

        //Collect student marks
        System.out.print("Please, enter your marks: ");
        validateEntries(loginCredentials, "marks");
        float averageMarks = loginCredentials.nextFloat();
        loginCredentials.next();

        //Use if statement to calculate student final grade according to his average marks
        char finalGrade='a';
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
        }

        //Print user information
        System.out.println();
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Student Code: " + studentCode);
        System.out.println("Marks: " + averageMarks);
        System.out.println("Grade: " + finalGrade);
    }
}

