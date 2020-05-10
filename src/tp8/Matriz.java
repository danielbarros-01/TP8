/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author Dani Barros
 */
public class Matriz {
    
    public void armar(){
        int[][] arregloB = new int[4][];
        
        arregloB[0] = new int[4];
        arregloB[1] = new int[3];
        arregloB[2] = new int[5];
        arregloB[3] = new int[2];
        
        arregloB[0][0]=3;
        arregloB[0][1]=6;
        arregloB[0][2]=9;
        arregloB[0][3]=12;
        
        arregloB[1][0]=15;
        arregloB[1][1]=18;
        arregloB[1][2]=21;
        
        
        arregloB[2][0]=24;
        arregloB[2][1]=27;
        arregloB[2][2]=30;
        arregloB[2][3]=33;
        arregloB[2][4]=36;
        
        arregloB[3][0]=39;
        arregloB[3][1]=42;
        
        for(int f=0;f<arregloB.length;f++){ //va de 0 a 3, porque tenemos 4 filas
            for(int c=0;c<arregloB[f].length;c++){ //calculando el largo de cada fila con [f].length
                int numero = arregloB[f][c];
                if(numero%2==0){
                    System.out.print(arregloB[f][c]+" ");
                }
            }
            System.out.println("");
        }
    }
}
