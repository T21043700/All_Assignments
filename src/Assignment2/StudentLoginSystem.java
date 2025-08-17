package Assignment3;

import java.util.Objects;
import java.util.Scanner;

public class StudentLoginSystem {
    public static void main(String[] args) {

        //Assignment 2

        //Variables declaration
        String userName = "mohamed@intrast.com";
        String password = "mohamed123";
        String fullName = "";
        String tryUserName = "";
        String tryPassword = "";
        int age;
        float grade;
        int loginAttemps;
        final int studentCode;
        float averageMarks = 0;
        char finalGrade;
        Scanner loginCredentials = new Scanner(System.in);

        System.out.println("Please, enter your user name: ");
        tryUserName = loginCredentials.nextLine();
        if (Objects.equals(tryUserName, userName)) {
            System.out.println("Please, enter your password: ");
            tryPassword = loginCredentials.nextLine();

            if (Objects.equals(tryPassword, password)) {
                System.out.println("Please, enter your student code: ");
                loginCredentials.nextLine();
                System.out.println("Please, enter your full name: ");
                loginCredentials.nextLine();
                System.out.println("Please, enter your age: ");
                loginCredentials.nextInt();
                loginCredentials.nextLine();
                System.out.println("Please, enter your marks: ");
                averageMarks = loginCredentials.nextInt();
                loginCredentials.nextLine();
            } else {
                System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                tryPassword = loginCredentials.nextLine();
                if (Objects.equals(tryPassword, password)) {
                    System.out.println("Please, enter your student code: ");
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your full name: ");
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your age: ");
                    loginCredentials.nextInt();
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your marks: ");
                    averageMarks = loginCredentials.nextInt();
                    loginCredentials.nextLine();
                } else {
                    System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                    tryPassword = loginCredentials.nextLine();
                    if (Objects.equals(tryPassword, password)) {
                        System.out.println("Please, enter your student code: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your full name: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your age: ");
                        loginCredentials.nextInt();
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your marks: ");
                        averageMarks = loginCredentials.nextInt();
                        loginCredentials.nextLine();
                    } else {
                        System.out.println("You consumed all your attemps to login, please ask your administrator to reset your credentials.");
                    }
                }
            }
        } else {
            System.out.println("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT 2 OF 3): ");
            tryUserName = loginCredentials.nextLine();
            if (Objects.equals(tryUserName, userName)) {
                System.out.println("Please, enter your password: ");
                tryPassword = loginCredentials.nextLine();

                if (Objects.equals(tryPassword, password)) {
                    System.out.println("Please, enter your student code: ");
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your full name: ");
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your age: ");
                    loginCredentials.nextInt();
                    loginCredentials.nextLine();
                    System.out.println("Please, enter your marks: ");
                    averageMarks = loginCredentials.nextInt();
                    loginCredentials.nextLine();
                } else {
                    System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                    tryPassword = loginCredentials.nextLine();
                    if (Objects.equals(tryPassword, password)) {
                        System.out.println("Please, enter your student code: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your full name: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your age: ");
                        loginCredentials.nextInt();
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your marks: ");
                        averageMarks = loginCredentials.nextInt();
                        loginCredentials.nextLine();
                    } else {
                        System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                        tryPassword = loginCredentials.nextLine();
                        if (Objects.equals(tryPassword, password)) {
                            System.out.println("Please, enter your student code: ");
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your full name: ");
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your age: ");
                            loginCredentials.nextInt();
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your marks: ");
                            averageMarks = loginCredentials.nextInt();
                            loginCredentials.nextLine();
                        } else {
                            System.out.println("You consumed all your attemps to login, please ask your administrator to reset your credentials.");
                        }
                    }
                }
            }else {
                System.out.println("You entered wrong user name, please enter a valid user name (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                tryUserName = loginCredentials.nextLine();

                if (Objects.equals(tryUserName, userName)) {
                    System.out.println("Please, enter your password: ");
                    tryPassword = loginCredentials.nextLine();

                    if (Objects.equals(tryPassword, password)) {
                        System.out.println("Please, enter your student code: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your full name: ");
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your age: ");
                        loginCredentials.nextInt();
                        loginCredentials.nextLine();
                        System.out.println("Please, enter your marks: ");
                        averageMarks = loginCredentials.nextInt();
                        loginCredentials.nextLine();
                    } else {
                        System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 2 OF 3): ");
                        tryPassword = loginCredentials.nextLine();
                        if (Objects.equals(tryPassword, password)) {
                            System.out.println("Please, enter your student code: ");
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your full name: ");
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your age: ");
                            loginCredentials.nextInt();
                            loginCredentials.nextLine();
                            System.out.println("Please, enter your marks: ");
                            averageMarks = loginCredentials.nextInt();
                            loginCredentials.nextLine();
                        } else {
                            System.out.println("You entered wrong password, please enter a valid password (NOTE: THIS IS ATTEMPT 3 OF 3 FINAL ATTEMPT): ");
                            tryPassword = loginCredentials.nextLine();
                            if (Objects.equals(tryPassword, password)) {
                                System.out.println("Please, enter your student code: ");
                                loginCredentials.nextLine();
                                System.out.println("Please, enter your full name: ");
                                loginCredentials.nextLine();
                                System.out.println("Please, enter your age: ");
                                loginCredentials.nextInt();
                                loginCredentials.nextLine();
                                System.out.println("Please, enter your marks: ");
                                averageMarks = loginCredentials.nextInt();
                                loginCredentials.nextLine();
                            } else {
                                System.out.println("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                            }
                        }
                    }
            }else {
                    System.out.println("You consumed all your attempts to login, please ask your administrator to reset your credentials.");
                }
            }
        }

        //Use if statement to calculate student final grade according to his average marks
        if (averageMarks < 60) {
            finalGrade = 'F';
        } else if (averageMarks >= 60 && averageMarks <= 69) {
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
    }
}
