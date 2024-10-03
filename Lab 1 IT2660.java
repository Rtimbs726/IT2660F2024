//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Ryan Timbs
 */

 public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1(); }

    public static int max(int a, int b) {
      if (a > b) {
          return a;
      } else {
          return b;
      }
  }

  public static int min(int a, int b) {
      if (a < b) {
          return a;
      } else {
          return b;
      }
  }

  public static int sum(int[] nums) {
      int sum = 0;
      for (int num : nums) {
          sum += num;
      }
      return sum;
  }

  public static double average(int[] nums) {
      int sum = sum(nums);
      return (double) sum / nums.length;
  }

  public static int max(int[] nums) {
      int max = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] > max) {
              max = nums[i];
          }
      }
      return max;
  }

  public static int min(int[] nums) {
      int min = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] < min) {
              min = nums[i];
          }
      }
      return min;
  }
// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num; }
    public static void main(String[] args) {
      int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

      int i = 0;
      while (i < nums.length) {
          System.out.print(nums[i] + " ");
          i++;
      }
      System.out.println();

      for (int j = nums.length - 1; j >= 0; j--) {
          System.out.print(nums[j] + " ");
      }
      System.out.println();
      System.out.println("First value: " + nums[0]);
      System.out.println("Last value: " + nums[nums.length - 1]);
      System.out.println("Max value: " + max(nums));
      System.out.println("Min value: " + min(nums));
      System.out.println("Sum: " + sum(nums));
      System.out.println("Average: " + average(nums));
  }
}
}