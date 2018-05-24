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
        int w = 0; //Kandidaten für die Wahl
        int n = 0; //Abgegebene Stimmen
        int[] stimmen = new int [n]; //wer wen gewählt hat
        
        for(int i=0; i<n; i++){
            stimmen[i] = (int) (Math.random()*w+1);
        }
        int[] stapel = new int[n];//nach der Methode
        int e=0; //Zähler wie viel auf dem Stapel ist
        
        
        for(int i=0;i<n;i++){ //so viele durchläufe wie stimmen
            if(e==0){
                stapel[e] = stimmen[i];//wenn auf dem Stapel noch nichts liegt
                e++;
            }
            else{
                if(stimmen[i]==stapel[e-1]){ //wenn auf dem Stapel das gleiche liegt
                    stapel[e] = stimmen[i];
                    e++;
                }
                else{
                    stapel[e-1] = 0;//wenn es nicht gleich ist
                    e = e-1;
                }
            }
            
        }
        System.out.println(stapel[e-1]);
    }
    
}
