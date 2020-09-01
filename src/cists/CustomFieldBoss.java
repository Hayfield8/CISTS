/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cists;

import gui.GUI1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m_hay
 */
public class CustomFieldBoss implements Serializable{
    
     /**
     * List containing all CustomField objects.
     */
    public List<CustomField> customFieldList;
    
    List<String> multiList;
    
    CustomField tempCustomField; 
    
    static int fieldCount = 0;
    
    public CustomFieldBoss(){
        
        customFieldList = new ArrayList<>();
        multiList = new ArrayList<>();
        
    } 
    
    public CustomField createCustomFieldMulti(List<String> aMultiList, CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName, aMultiList);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    public CustomField createCustomField(CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    public List<CustomField> getCustomFieldList(){
        return this.customFieldList;
    }
    
    public int getFieldCount(){
        return CustomFieldBoss.fieldCount;
    }
    
    public void displayCustomFields(){
        List<CustomField> aCustomFieldList;
        aCustomFieldList = this.getCustomFieldList();
        aCustomFieldList.forEach((eachCF) -> {
            System.out.println("Field Name: " + eachCF.getFieldName() + ", Field"
                    + " Type : " + eachCF.getFieldType());
        });
    }
    
} 

