/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK PGRI 2 SUMEDANG
 */
public class TestPassByReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int []ages = {10,11,12};
 for(int i=0;i<ages.length;i++){
 System.out.println(ages[i]);
 }
 test(ages);
 for(int i=0;i<ages.length;i++){
 System.out.println(ages[i]);
 }
 }
 public static void test(int []arr){
 for(int i=0;i<arr.length;i++){
 arr[i]=i+50;
 }
 }
 } 
 