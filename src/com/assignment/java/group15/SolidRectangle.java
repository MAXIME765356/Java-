package com.assignment.java.group15;

import java.util.Scanner;

public class SolidRectangle {
    // Properties of the class
    private double length = 20;
    private double width = 15;
    private double height = 25.0;
    private String group = "13-17";

    // Constructors
    public SolidRectangle() {
        System.out.println("Rectangle Object Created Using Default Constructor");
        System.out.println("Sucessfully created");

    }

    public SolidRectangle(double length) {
        this.length = length;

    }

    public SolidRectangle(double length, double width) {
        this.length = length;

    }

    public SolidRectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public SolidRectangle(double length, double width, double height, String group) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.group = group;
    }

    // Method
    public double getVolume() {
        return length * width * height;
    }

    // Getters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public String getGroup() {
        return this.group;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void printOutput(int numberOfOutput) {
        if (numberOfOutput == 3) {
            System.out.println("The length,width and height of this Solid Rectangle are " + getLength() + " unit(s) "
                    + getWidth() + " unit(s) " + getHeight() + " respectively ");
            System.out.println("The volume of this Rectangle is " + getVolume() + " cubic unit(s) ");
            System.out.println("This project belongs to groups " + getGroup());
        } else if (numberOfOutput == 2) {
            System.out.println("The volume of this rectangle is " + getVolume() + " cubic units ");
            System.out.println("This is group number " + getGroup());

        }
    }

    //Starting the task 
    public static void main(String[] args) {
        // Task1
        SolidRectangle rect1 = new SolidRectangle();
        System.out.println("Question 1");
        System.out.println("The results here is using the default constructor");
        System.out.println("We have been classified to group " + rect1.getGroup());
        System.out.println("The volume of this Solid Rectangle is " + rect1.getVolume() + " cubic units");

        // Task 2a
        Scanner lengthInput = new Scanner(System.in); // For the user to enter radius
        System.out.print("Enter the length of the rectangle (e.g 8.0): ");

        double length2a = lengthInput.nextDouble();

        SolidRectangle rect2a = new SolidRectangle(length2a);
        System.out.println("Question 2a");
        System.out.println("This constructor used here is receiving 1 argument");
        rect2a.printOutput(3);

        // Task 2b
        Scanner widthInput = new Scanner(System.in); // Used to get user input for width
        System.out.print("Enter the width of the rectangle (e.g 9.0): ");

        double width2b = widthInput.nextDouble();

        System.out.print("Enter the length of the rectangle (e.g 5.2): ");

        double length2b = lengthInput.nextDouble();

        System.out.print("Enter the height of the rectangle (e.g 5.2): ");

        Scanner heightInput = new Scanner(System.in);

        double height2b = heightInput.nextDouble();

        SolidRectangle rect2b = new SolidRectangle(width2b, length2b, height2b);

        System.out.println("Question 2b");
        System.out.println("This constructor used here is receiving 3 arguments");
        rect2b.printOutput(3);

        // Task 2c
        Scanner groupInput = new Scanner(System.in); // Used to get user input for group
        System.out.print("Enter the length of the rectangle (e.g 4.0): ");

        double length2c = lengthInput.nextDouble();

        System.out.print("Enter the width of the rectangle (e.g 2.0): ");

        double width2c = widthInput.nextDouble();

        System.out.print("Enter the height of the rectangle (e.g 1.0): ");

        double height2c = widthInput.nextDouble();

        System.out.print("Enter your group number here (e.g 13): ");

        String group2c = groupInput.nextLine();

        SolidRectangle rect2c = new SolidRectangle(width2c, length2c, height2c, group2c);
        System.out.println("Question 2c");
        System.out.println("This constructor used here is receiving 4 arguments");
        rect2c.printOutput(3);

        // Task 3
        SolidRectangle rect3 = new SolidRectangle();
        System.out.println("The default values of length, width, height and group of this rectangle are "
                + rect3.getLength() + " unit(s), " + rect3.getWidth() + " unit(s)," + rect3.getHeight() + "nunit(s)"
                + " and " + rect3.getGroup() + " respectively.");

        System.out.print("Enter the length of the rectangle (e.g 4.2): ");

        double length3 = lengthInput.nextDouble();

        System.out.print("Enter the width of the rectangle (e.g 2.2): ");

        double width3 = widthInput.nextDouble();

        System.out.print("Enter the height of the rectangle (e.g 2.2): ");

        double height3 = widthInput.nextDouble();

        System.out.print("Enter your group number here (e.g 1): ");

        String group3 = groupInput.nextLine();

        // Changing length, width, height and group for rect3
        rect3.setLength(length3);
        rect3.setWidth(width3);
        rect3.setHeight(height3);
        rect3.setGroup(group3);

        System.out.println("The new values of length, width, height and group are " + rect3.getLength() + " unit(s), "
                + rect3.getWidth() + " unit(s), " + rect3.getHeight() + " unit(s), " + " and " + rect3.getGroup()
                + " respectively.");
        rect3.printOutput(2);

    }

}