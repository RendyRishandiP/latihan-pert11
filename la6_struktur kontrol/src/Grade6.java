/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK PGRI 2 SUMEDANG
 */
public class Grade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outerLoop:
 for( int i=0; i<5; i++ ){
 for( int j=0; j<5; j++ ){
 System.out.println("Inside for(j) loop"); //message1
 if( j == 2 ) continue outerLoop;
 }

 System.out.println("Inside for(i) loop"); //message2
 }
 }
 } 
    
  
