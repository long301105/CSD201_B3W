/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Slot1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=3;
        int[] array= new int[n];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Input a["+"}=");
            } catch (Exception e) {
            }
    }
        System.out.println(array);
        System.out.println("\n---");
        for (int i = 0; i <n; i++) {
            array[i]=1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println("\n----");
        for (int i : array) {
            i=1;
        }
        for (int i : array) {
            System.out.println(i+" ");
        }
        System.out.println("Số lượng: " + array.length);
        String str="smafkasdmfsdf";
        System.out.println(str.length());
        
    }
    
}
