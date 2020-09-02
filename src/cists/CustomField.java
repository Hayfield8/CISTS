/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m_hay
 */
public class CustomField implements Serializable{

//Variables
    
    public static int count;
    public enum FieldType {
        textbox,
        yesNo,
        multiChoice,
        number,
        slider   
    }
    
    public FieldType fieldType;
    
    String fieldName;
    
    List<String> multiList;
    
    
    
    //Constructor
    public CustomField(FieldType aFieldType, String aFieldName, List<String> 
            aList) {
    
        fieldType = aFieldType;
        fieldName = aFieldName;
        multiList = new ArrayList<>();
        multiList = aList;
        count = count++;
        
        System.out.println("CustomField Created Successfully");
    }    
    
    public CustomField(FieldType aFieldType, String aFieldName) {
    
        fieldType = aFieldType;
        fieldName = aFieldName;
        count = count++;
        System.out.println("CustomField Created Successfully");
    }    
    
//Getters
    
    public FieldType getFieldType() {
        return this.fieldType;
    }
    
    public String getFieldName() {
        return this.fieldName;
    }
   
    public List<String> getMultiList() {
        return this.multiList;
    }
    
//Setters
    
    void setFieldType(FieldType aFieldType){
        this.fieldType = aFieldType;
    }
    
    void setFieldName(String aFieldName) {
        this.fieldName = aFieldName;
    }
    
    void addToList(String aString){
        this.multiList.add(aString);
    }
    
    void clearList(){
        this.multiList.clear();
    }
    
    @Override
    public String toString(){
        String string = getFieldName() + "  " + getFieldType().toString();
        return string;
    }
}
