/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomkuncijawaban;

import java.util.Random;

/**
 *
 * @author Fonda
 */
public class main {
    public static void main(String[] Args){
        Random rand = new Random();
        String[] huruf = {"A","B","C","D","E"}; 
        
        for(int i=1;i<=40;i++){
            int angka = rand.nextInt(5);
            System.out.print(i+" ");
            System.out.println(huruf[angka]);
        }
    }

}
