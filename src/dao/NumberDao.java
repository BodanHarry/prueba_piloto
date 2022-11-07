/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelos.NumberModel;

/**
 *
 * @author hebod
 */
public class NumberDao {
    NumberModel numberModel = new NumberModel();
    int[] numeros = numberModel.get();
    
    public int getLowestNumber(){
        int lowest = numeros[0];
        int pos = 0;
        
        do{
            int actualNumber = this.numeros[pos];
            if(actualNumber < lowest){
                lowest = actualNumber;
            }
            pos++;
        }while(pos < this.numeros.length);
        
        return lowest;
    }
    
    public int getHighestNumber(){
        int highest = this.numeros[0];
        int pos = 0;
        
        while(pos < this.numeros.length){
            int actualNumber = this.numeros[pos];
            if(actualNumber > highest){
                highest = actualNumber;
            }
            pos++;
        }
        return highest;
    }
}
