/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cists;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author m_hay
 */
public class EventCustomFields implements Serializable {
    
    public List<String> customFieldNames; 
    public List<String> customFieldInputs;
    
    public EventCustomFields(List<String> aCFNames, List<String> aCFInputs){
        customFieldNames = aCFNames;
        customFieldInputs = aCFInputs;
    }
}
