package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Resume obj = new Resume();

        Scanner keyboard = new Scanner(System.in);

        obj.resumeMethod();



    }

    }
    class Resume {
        public static void resumeMethod() {
            Scanner keyboard = new Scanner(System.in);
            //Enter Name
            String fname = " ";
            String lname = " ";

            String email = " ";
            String [] education1;
            education1 = new String[4];
            String [] education12;
            education12 = new String[4];
            String [] education3;
            education3 = new String[4];
            String [] education4;
            education4= new String[4];
            String [] experience1;
            experience1 = new String[8];
            String [] skill1;
            skill1 = new String[2];
            String [] skill2;
            skill2 = new  String[2];
            String [] skill3;
            skill3 = new String[2];

            //Enter Name
            System.out.println("Enter your First Name");
            fname = keyboard.next();
            System.out.println("Enter your Last Name");
            lname = keyboard.next();

            //Enter email
            System.out.println("Enter your email address");
            email = keyboard.next();

            //Enter School info
            System.out.println("Enter your Degree type");
            education1[0] = keyboard.next();
            System.out.println("Enter your Major");
            education1[1] = keyboard.next();
            System.out.println("Enter your School Name");
            education1[2] = keyboard.next();
            System.out.println("Enter your Graduation Year");
            education1[3] = keyboard.next();

            //Enter Work history
            System.out.println("Enter the company name you worked at");
            experience1[1] = keyboard.next();
            System.out.println("Enter your job title");
            experience1[0] = keyboard.next();
            System.out.println("Enter your start date month");
            experience1[2] = keyboard.next();
            System.out.println("Enter your start date year");
            experience1[3] = keyboard.next();
            System.out.println("Enter your end date month");
            experience1[4] = keyboard.next();
            System.out.println("Enter your end date year");
            experience1[5] = keyboard.next();
            System.out.println("Enter job description");
            experience1[6] = keyboard.next();
            System.out.println("Enter second job description or n/a");
            experience1[7] = keyboard.next();

            //Enter Skillset
            System.out.println("First Skill ");
            skill1[0] = keyboard.next();
            System.out.println("Enter Proficiency, Fundamental, Novice, Intermediate, Advanced, Expert");
            skill1[1] = keyboard.next();


            //Display Name and email
            System.out.println(" ");
            System.out.println("====================================================================");
            System.out.println("Resume");
            System.out.println(fname + " " + lname);
            System.out.println(email);
            System.out.println( " ");

            //Display School info
            System.out.println("Education");
            System.out.print(education1[0]);
            System.out.println(" in " + education1[1]);
            System.out.print(education1[2]);
            System.out.println(", " + education1[3]);
            System.out.println( " ");

            //Display work history
            System.out.println("Experience");
            System.out.println(experience1[0]);
            System.out.print(experience1[1] + ", ");
            System.out.println(experience1[2] + " " + experience1[3] + " - " + experience1[4] + " " + experience1[5]);
            System.out.println("Duties - " + experience1[6]);

            System.out.println( " ");

            //Display skills
            System.out.println("Skills");
            System.out.print(skill1[0] + ", " + skill1[1]);



        }
    }


