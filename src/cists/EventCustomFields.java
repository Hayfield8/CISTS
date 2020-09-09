<<<<<<< HEAD
package cists;

import java.io.Serializable;
import java.util.List;

/**
 *
 * EventCustomFields objects represents details about the user's custom details 
 * during the event. The details are held in two lists, one for the field names 
 * and a second containing the form data. 
 *
 * @author MJ Hayfield
 * @since 20-05-2020
 * @version 1.0
 */
public class EventCustomFields implements Serializable {
    /**
     * A list that will hold the names of the custom fields.
     */
    public List<String> customFieldNames; 
    
    /**
     * A list that will hold the added user data for each field.
     * each in the same position of it's corresponding name in customFieldNames. 
     */
    public List<String> customFieldInputs;
    
    /**
     * Initialises a new instance of a Event class with the given details.
     * @param aCFNames
     * @param aCFInputs 
     */
    public EventCustomFields(List<String> aCFNames, List<String> aCFInputs){
        customFieldNames = aCFNames;
        customFieldInputs = aCFInputs;
    }
}
=======
package cists;

import java.io.Serializable;
import java.util.List;

/**
 *
 * EventCustomFields objects represents details about the user's custom details 
 * during the event. The details are held in two lists, one for the field names 
 * and a second containing the form data. 
 *
 * @author MJ Hayfield
 * @since 20-05-2020
 * @version 1.0
 */
public class EventCustomFields implements Serializable {
    /**
     * A list that will hold the names of the custom fields.
     */
    public List<String> customFieldNames; 
    
    /**
     * A list that will hold the added user data for each field.
     * each in the same position of it's corresponding name in customFieldNames. 
     */
    public List<String> customFieldInputs;
    
    /**
     * Initialises a new instance of a Event class with the given details.
     * @param aCFNames
     * @param aCFInputs 
     */
    public EventCustomFields(List<String> aCFNames, List<String> aCFInputs){
        customFieldNames = aCFNames;
        customFieldInputs = aCFInputs;
    }
}
>>>>>>> 1845e33bb69c178c291579b77d621224fd9171e9
