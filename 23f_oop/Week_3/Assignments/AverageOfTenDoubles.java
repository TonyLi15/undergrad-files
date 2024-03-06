package Week_3.Assignments;
/*
 * Chapter 5 Self-Test 3
 * Write a program that uses an array to find the average of 10 double values.
 * Use any 10 values you like.
 */


public class AverageOfTenDoubles {
    public static void main(String[] args){
        double[] nums = {1.9, 2.8, 3.7, 4.6, 5.5, 6.4, 7.3, 8.2, 9.1, 10.0};
        double sum = 0;
        for(int i = 0; i < nums.length; i++) sum += nums[i];
        System.out.println("The average is: " + sum / nums.length);
    }
}
