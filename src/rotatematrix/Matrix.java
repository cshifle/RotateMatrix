/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rotatematrix;

/**
 *
 * @author Christopher
 */
public class Matrix {
    int [][] theMatrix;     //declare the 2d matrix
    public Matrix(){
        
        theMatrix = new int [5][5];
        //Initialize 2d matrix with values. Each row will have the value of the row number
        for(int i = 0; i< theMatrix.length; i++){
            for(int j =0; j < theMatrix[i].length; j++){
                theMatrix[i][j] = i+1;
            }
            
        }
    }
    
    void print(){
        System.out.println("This is the original Matrix....");
        for(int i = 0; i < theMatrix.length; i++){
            for(int j = 0; j <theMatrix[i].length; j++){
                System.out.print(theMatrix[i][j]);
            }
            System.out.println();
        }
    }
    
    void rotate90(){
        
    }
    
    void rotate180(){
        
    }
    
    void rotate225(){
        
        
    }
}
