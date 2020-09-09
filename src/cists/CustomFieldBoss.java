<<<<<<< HEAD
package cists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * CustomFieldBoss objects will manage all the CustomField objects and contains 
 * methods to create customField objects.
 *
 * @author MJ Hayfield
 * @since 11-06-2020
 * @version 1.0
 */
public class CustomFieldBoss implements Serializable{
    
     /**
     * List containing all CustomField objects.
     */
    public List<CustomField> customFieldList;
    
    /**
     * List containing the multiple choice option for the creation of a multiple
     * choice field.
     */
    List<String> multiList;
    
    /**
     * Variable to be used when creating a new CustomField object. 
     */
    CustomField tempCustomField; 
    
    /**
     * Count of the number of fields created.
     */
    static int fieldCount = 0;
    
    /**
     * Initialises a new instance of the CustomFieldBoss class, called from the
     * loadCustomFieldBoss() method if no save file can be found.
     */
    public CustomFieldBoss(){
        
        customFieldList = new ArrayList<>();
        multiList = new ArrayList<>();
        
    } 
    
    /**
     * Creates a new multiple choice type of CustomField object with user entered
     * information, calls constructor for CustomField.
     * @param aMultiList list of Strings for the multiple choice options
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     * @return CustomField object
     */
    public CustomField createCustomFieldMulti(List<String> aMultiList, CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName, aMultiList);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    /**
     * Creates a new CustomField object with user entered information, 
     * calls constructor for CustomField.
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     * @return CustomField object
     */
    public CustomField createCustomField(CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    /**
     * Getter for the list of custom field objects.
     * @return ArrayList of CustomField objects.
     */
    public List<CustomField> getCustomFieldList(){
        return this.customFieldList;
    }
    
    /**
     * Getter for the custom field count.
     * @return int representing the number of created custom fields.
     */
    public int getFieldCount(){
        return CustomFieldBoss.fieldCount;
    }
    
    /**
     * Method to print out a list of each custom field represented by their name
     * and type.
     */
    public void displayCustomFields(){
        List<CustomField> aCustomFieldList;
        aCustomFieldList = this.getCustomFieldList();
        aCustomFieldList.forEach((eachCF) -> {
            System.out.println("Field Name: " + eachCF.getFieldName() + ", Field"
                    + " Type : " + eachCF.getFieldType());
        });
    }
    
} 

=======
package cists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * CustomFieldBoss objects will manage all the CustomField objects and contains 
 * methods to create customField objects.
 *
 * @author MJ Hayfield
 * @since 11-06-2020
 * @version 1.0
 */
public class CustomFieldBoss implements Serializable{
    
     /**
     * List containing all CustomField objects.
     */
    public List<CustomField> customFieldList;
    
    /**
     * List containing the multiple choice option for the creation of a multiple
     * choice field.
     */
    List<String> multiList;
    
    /**
     * Variable to be used when creating a new CustomField object. 
     */
    CustomField tempCustomField; 
    
    /**
     * Count of the number of fields created.
     */
    static int fieldCount = 0;
    
    /**
     * Initialises a new instance of the CustomFieldBoss class, called from the
     * loadCustomFieldBoss() method if no save file can be found.
     */
    public CustomFieldBoss(){
        
        customFieldList = new ArrayList<>();
        multiList = new ArrayList<>();
        
    } 
    
    /**
     * Creates a new multiple choice type of CustomField object with user entered
     * information, calls constructor for CustomField.
     * @param aMultiList list of Strings for the multiple choice options
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     * @return CustomField object
     */
    public CustomField createCustomFieldMulti(List<String> aMultiList, CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName, aMultiList);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    /**
     * Creates a new CustomField object with user entered information, 
     * calls constructor for CustomField.
     * @param aFieldType Enum for the type of field
     * @param aFieldName String, name of the field
     * @return CustomField object
     */
    public CustomField createCustomField(CustomField.FieldType 
            aFieldType, String aFieldName){
        
        tempCustomField = new CustomField(aFieldType, aFieldName);
        fieldCount = fieldCount++;
        customFieldList.add(tempCustomField);
        System.out.println("CF Object created");
        return tempCustomField;
    }
    
    /**
     * Getter for the list of custom field objects.
     * @return ArrayList of CustomField objects.
     */
    public List<CustomField> getCustomFieldList(){
        return this.customFieldList;
    }
    
    /**
     * Getter for the custom field count.
     * @return int representing the number of created custom fields.
     */
    public int getFieldCount(){
        return CustomFieldBoss.fieldCount;
    }
    
    /**
     * Method to print out a list of each custom field represented by their name
     * and type.
     */
    public void displayCustomFields(){
        List<CustomField> aCustomFieldList;
        aCustomFieldList = this.getCustomFieldList();
        aCustomFieldList.forEach((eachCF) -> {
            System.out.println("Field Name: " + eachCF.getFieldName() + ", Field"
                    + " Type : " + eachCF.getFieldType());
        });
    }
    
} 

>>>>>>> 1845e33bb69c178c291579b77d621224fd9171e9
