/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damier;

import java.util.Scanner;

/**
 *
 * @author bontemps
 */
public class Damier {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
        // initialisation du scanner pour variable sc
        Scanner sc = new Scanner(System.in);
        
        // condition qui dectecte ce qui est marqué sur la console de type int
        if(sc.hasNextInt()) {
            // variable qui récupère ce qui a était ecrit
            int inputUser = sc.nextInt();
            
            // boucle verticale qui commence à 1 et qui se termine par la variable inputUser et qui incrém
            for (int v = 1; v <= inputUser; v++) { //définir les hauteurs
            // boucle horizontale qui commence à 1 et qui se termine par la variable inputUser et qui incrémente    
                for(int h =1; h <= inputUser; h++) { //definir les lignes 
                    
                    // condition qui permet de détecter si la ligne verticale + horizontal est pair
                    if((v + h) % 2 == 1 ){
                        System.out.print("0");
                    } else {
                        System.out.print("■");
                    }
                       
                    
                }
                
                System.out.println();
            }
            
            
        }
    }  
    
}
