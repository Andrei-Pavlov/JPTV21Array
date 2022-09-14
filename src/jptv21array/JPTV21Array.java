/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21array;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numsum = 0;
        int min = 10;
        int max = 0;
        Random random = new Random();
        System.out.println("---- Одномерные массивы ----");
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10);
        }
        for(int i = 0; i <nums.length; i++){
            System.out.printf("%3d",nums[i]);
            numsum = numsum + nums[i];
            if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
        }
        System.out.println("");
        System.out.println("sum = "+numsum);
        System.out.println("");
        System.out.println("min = "+min);
        System.out.println("");
        System.out.println("max = "+max);
        System.out.println("---- Многомерные массивы ----");
        int numsum1 = 0;
        int numsumi = 0;
        int disumn = 0;
        int disumn1 = 0;
        int min1 = 100;
        int n = 3;
        int max1 = 0;
        int[][] nums2 = new int[3][3];
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2.length; j++){
                nums2[i][j] = random.nextInt(100);
            }
        }
        for(int i = 0; i <nums2.length; i++){
            for(int j = 0; j<nums2.length; j++){
                numsum1 = numsum1 + nums2[0][j];
                if(min1 > nums2[i][j]) min1 = nums2[i][j];
                if(max1 < nums2[i][j]) max1 = nums2[i][j];
                if(i == j) disumn = disumn +nums2[j][i];
                if(i == n-j) disumn1 = disumn1 + nums2[j][i];
                System.out.printf("%4d",nums2[i][j]);
            }
            System.out.println("");
            numsumi = numsumi + nums2[i][0];
            
        }
        System.out.println("sum = "+numsumi);
        System.out.println("");
        System.out.println("sum = "+numsum1);
        System.out.println("");
        System.out.println("disumn = "+disumn);
        System.out.println("");
        System.out.println("disumn 2 = "+disumn1);
        System.out.println("");
        System.out.println("min = "+min1);
        System.out.println("");
        System.out.println("max = "+max1);
    }
    
}
