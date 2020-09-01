/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import cists.CustomField;
import cists.CustomFieldBoss;
import cists.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

/**
 *
 * @author m_hay
 */
public class CustomFieldGUIView extends javax.swing.JFrame {
 
    JPanel cFPanel;
    EventCustomFields tempEventCF;
    
    public List<javax.swing.JLabel> customLabels;
    public List<javax.swing.JLabel> customTFLabels;
    public List<javax.swing.JLabel> customYNLabels;
    public List<javax.swing.JLabel> customMCLabels;
    public List<javax.swing.JLabel> customSLDLabels;
    
    public List<Object> customInputs;
    public List<javax.swing.JTextField> customTextFields;
    public List<javax.swing.JComboBox> customYesNos;
    public List<javax.swing.JComboBox> customMultiCombo;
    public List<javax.swing.JSlider> customSliders;
    
    
    //public Box cFBox = Box.createVerticalBox(); 
   
    public CustomFieldGUIView(EventCustomFields aEventCF){
        super("Custom Fields Input Form");
        setLayout(new BorderLayout());
        this.cFPanel = new JPanel();
        this.cFPanel.setLayout(new FlowLayout());
        add(cFPanel, BorderLayout.CENTER);
        
        //JButton createCFButton = new JButton("Store Custom Info");
        //add(createCFButton, BorderLayout.SOUTH);
        //createCFButton.addActionListener(this);
        
        //customInputs = new ArrayList<>();
        //customTFLabels = new ArrayList<>();
       //customYNLabels = new ArrayList<>();
        //customMCLabels = new ArrayList<>();
        //customSLDLabels = new ArrayList<>();
        //customTextFields = new ArrayList<>();
        //customYesNos = new ArrayList<>();
        //customMultiCombo = new ArrayList<>();
        //customSliders = new ArrayList<>();
        
        displayEventCF(aEventCF);
        setSize(700, 700);
        setVisible(true);
        
    }
    
    /**
     * action performed method for creation of ECF object.
     */

   // public void actionPerformed(ActionEvent evt){
        // List<String> customFieldNames; 
        // List<String> customFieldInputs;
         
        // customFieldNames = new ArrayList<>();
        // customFieldInputs = new ArrayList<>();
         
        // for (JTextField eachCFInput : customTextFields){
        //    customFieldInputs.add(eachCFInput.getText());  
        // }
         
        // for (JComboBox eachCFInput : customYesNos){
        //    customFieldInputs.add(eachCFInput.getSelectedItem().toString());  
        // }
         
        // for (JComboBox eachCFInput : customMultiCombo){
        //    customFieldInputs.add(eachCFInput.getSelectedItem().toString());  
        // }
         
        // for (JSlider eachCFInput : customSliders){
        //    customFieldInputs.add(Integer.toString(eachCFInput.getValue()));  
        // }
        // 
        // for (JLabel eachCFLabel : customTFLabels){
        //    customFieldNames.add(eachCFLabel.getText());  
        // }
         
        // for (JLabel eachCFLabel : customYNLabels){
        //    customFieldNames.add(eachCFLabel.getText());  
        // }
         
        // for (JLabel eachCFLabel : customMCLabels){
        //    customFieldNames.add(eachCFLabel.getText());  
        // }
         
        // for (JLabel eachCFLabel : customSLDLabels){
        //    customFieldNames.add(eachCFLabel.getText());  
        // }
         
        // tempEventCF = new EventCustomFields(customFieldNames ,customFieldInputs);
         
        // JOptionPane.showMessageDialog(null, "Custom Inputs Saved Successully.");
    //}
    
    /**
     * methods to add input fields to the gui
    */
    
    
    public void displayEventCF(EventCustomFields aEventCF){
        
        for (int i = 0 ; i != aEventCF.customFieldNames.size() ; i++){
            javax.swing.JLabel customLabel;
            javax.swing.JTextField customField;
            customLabel = new javax.swing.JLabel(aEventCF.customFieldNames.get(i));
            customField = new javax.swing.JTextField(20);
            customField.setText(aEventCF.customFieldInputs.get(i));
            
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customField);
        //this.customFieldsInputDialog.add(cFBox);
        this.cFPanel.setVisible(true);
        }
        
    } 
    
    
}
