package cists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * CustomField objects represent a custom created input field that will generate
 * in the GUI.
 *
 * @author MJ Hayfield
 * @since 11-06-2020
 * @version 1.0
 */
public class CustomField implements Serializable{

//Variables
    /**
     * Keeps count of all CustomField objects created.
     */
    public static int count;
    
    /**
     * Enumeration of the different types of new field available.
     */
    public enum FieldType {
        textbox,
        yesNo,
        multiChoice,
        number,
        slider   
    }
    public FieldType fieldType;
    
    /**
     * The name of the new field.
     */
    String fieldName;
    
    /**
     * ArrayList for the multiple choice options.
     */
    List<String> multiList;
    
    /**
     * String Array for the multiple choice options, allows for the correct
     * generation in the GUI.
     */
    String multiChoice[]; 
    
    
    
    //Constructor
    /**
     * Initialises a new instance of the multiple choice type of the CustomField 
     * class with the user provided information, called from CustomFieldBoss.
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     * @param aList list of Strings for the multiple choice options
     */
    public CustomField(FieldType aFieldType, String aFieldName, List<String> 
            aList) {
    
        fieldType = aFieldType;
        fieldName = aFieldName;
        multiList = new ArrayList<>();
        multiList = aList;
        count = count++;
        multiChoice = aList.toArray(new String[0]);
        System.out.println("CustomField Created Successfully");
    }    
    
    /**
     * Initialises a new instance of the CustomField class with the user provided
     * information, called from CustomFieldBoss.
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     */
    public CustomField(FieldType aFieldType, String aFieldName) {
    
        fieldType = aFieldType;
        fieldName = aFieldName;
        count = count++;
        System.out.println("CustomField Created Successfully");
    }    
    
     
//Getters
    
    /**
     * getter for the field type of this custom field.
     * @return fieldType enum.
     */
    public FieldType getFieldType() {
        return this.fieldType;
    }
    
    /**
     * getter for the name of this custom field
     * @return String name.
     */
    public String getFieldName() {
        return this.fieldName;
    }
   
    /**
     * getter for the list of multi-choice options of this custom field.
     * @return ArrayList multiList. 
     */
    public List<String> getMultiList() {
        return multiList;
    }
    
    /**
     * getter for the string array of multi-choice options of this custom field.
     * @return String[] multiChoice. 
     */
    public String[] getMultiArray() {
        return this.multiChoice;
    }
    
//Setters
    
    /**
     * setter for the field type.
     * @param aFieldType enum. 
     */
    void setFieldType(FieldType aFieldType){
        this.fieldType = aFieldType;
    }
    
    /**
     * setter for the field name.
     * @param aFieldName String.
     */
    void setFieldName(String aFieldName) {
        this.fieldName = aFieldName;
    }
    
    /**
     * adds a string on the end of the multiList.
     * @param aString 
     */
    void addToList(String aString){
        this.multiList.add(aString);
    }
    
    /**
     * clears the multiList.
     */
    void clearList(){
        this.multiList.clear();
    }
    
    /**
     * provides a string representing the state of the object. 
     * @return String string.
     */
    @Override
    public String toString(){
        String string = getFieldName() + "  " + getFieldType().toString();
        return string;
    }
}
