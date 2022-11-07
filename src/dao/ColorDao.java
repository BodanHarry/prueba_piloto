/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import modelos.ColorModel;

/**
 *
 * @author hebod
 */
public class ColorDao {
    
    private ColorModel colorModel = new ColorModel();
    
    public void insert(String color){
        colorModel.getColorList().add(color);
    }
    
    public List<String> getAllColors(){
        return colorModel.getColorList();
    }
}
