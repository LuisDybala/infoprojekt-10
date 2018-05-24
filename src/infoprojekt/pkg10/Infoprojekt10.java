/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoprojekt.pkg10;

/**
 *
 * @author pc_x
 */
public class Infoprojekt10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w = 3;
        int n = 10;
        int[] stimmen = new int [n];
        
        for(int i=0; i<n; i++){
            stimmen[i] = (int) (Math.random()*w+1);
        }
    }
    
}
