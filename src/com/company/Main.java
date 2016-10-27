package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	while(true){
        System.out.println("Enter a grade");
        Scanner input = new Scanner(System.in);
        int newGrade = input.nextInt();
        int grades[] = {newGrade};
        int sum = 0;

        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }

        double average = sum / grades.length;

        if(newGrade == -1){
            System.out.println(grades);
            System.exit(0);
        }

        else{

        }
    }

    }
}
