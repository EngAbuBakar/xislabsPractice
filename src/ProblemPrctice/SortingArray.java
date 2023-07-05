package ProblemPrctice;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] numbers={4,2,1,4,5,8};
        int temp=0;
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }

        System.out.println("Ascending order: ");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }

         int [] num={4,3,2,6,8};
        for (int i = 0; i <num.length; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if (num[i]<num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }

        }

        System.out.println("Descending order: ");
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);

        }

    }
}
