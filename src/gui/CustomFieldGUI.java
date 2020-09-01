/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import cists.CustomField;
import cists.CustomFieldBoss;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.JPanel;

/**
 *
 * @author m_hay
 */
public class CustomFieldGUI extends javax.swing.JFrame{
 
    JPanel cFPanel;
    public List<javax.swing.JLabel> customLabels; 
    public List<Object> customInputs;
    //public Box cFBox = Box.createVerticalBox(); 
   
    public CustomFieldGUI(CustomFieldBoss aCFBoss){
        super("Custom Fields Input Form");
        setLayout(new BorderLayout());
        this.cFPanel = new JPanel();
        this.cFPanel.setLayout(new FlowLayout());
        add(cFPanel, BorderLayout.CENTER);
        setSize(700, 700);
        setVisible(true);
        customInputs = new ArrayList<>();
        customLabels = new ArrayList<>();
        generateCustomFields(aCFBoss.getCustomFieldList());
        
        
    }
    
    
    
    /**
     * methods to add input fields to the gui
    */
    public void addTextField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JTextField customField;
        customLabel = new javax.swing.JLabel(aFieldName);
        customField = new javax.swing.JTextField(20);
        
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customField);
        //this.customFieldsInputDialog.add(cFBox);
        this.cFPanel.setVisible(true);
        this.customLabels.add(customLabel);
        this.customInputs.add(customField);
        
        
        this.revalidate();
        //this.customFieldsInputDialog.repaint();
        //this.customFieldPanel.updateUI();
        
        System.out.println("TextField Successfully Added");
    }
    
    public void addYesNoField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customCombo;
        customCombo = new javax.swing.JComboBox<>();
        customCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        customLabel = new javax.swing.JLabel(aFieldName);
        
        
        this.cFPanel.add(customLabel, customCombo);
        this.customLabels.add(customLabel);
        this.customInputs.add(customCombo);
        
        revalidate();
        repaint();
        
        System.out.println("ComboBox Successfully Added");
    }
    
     public void addNumberField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JTextField customField;
        customLabel = new javax.swing.JLabel(aFieldName);
        customField = new javax.swing.JTextField();
        customField.setText("0");
        
        this.cFPanel.add(customLabel, customField);
        this.customLabels.add(customLabel);
        this.customInputs.add(customField);
        
        
        revalidate();
        repaint();
        
        System.out.println("TextNumberField Successfully Added");
    }
    
     public void addSlider(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JSlider customSlider;
        customLabel = new javax.swing.JLabel(aFieldName);
        customSlider = new javax.swing.JSlider(1, 10);
        this.cFPanel.add(customLabel, customSlider);
        this.customLabels.add(customLabel);
        this.customInputs.add(customSlider);
        
        revalidate();
        repaint();
        
        System.out.println("Slider Successfully Added");
    }
    
    public void addMultiCombo(String aFieldName, List<String> aMultiList){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customMulti;
        customMulti = new javax.swing.JComboBox<>();
        customMulti.setModel(new javax.swing.DefaultComboBoxModel<>
        (aMultiList.toArray(new String[0])));
        
        customLabel = new javax.swing.JLabel(aFieldName);
        
        
        this.cFPanel.add(customLabel, customMulti);
        this.customLabels.add(customLabel);
        this.customInputs.add(customMulti);
        
        
        revalidate();
        repaint();
        
        System.out.println("MultiComboBox Successfully Added");
    } 
    
    public void generateCustomFields(List<CustomField> aCustomFieldList){
        
        //if (this.cFBox != null){
         //   cFBox = Box.createVerticalBox();
         //   this.customFieldPanel.add(cFBox);
        //}
        
        aCustomFieldList.forEach((eachCF) -> {
            if ("textbox".equals(eachCF.getFieldType().toString())){
                addTextField(eachCF.getFieldName());
        }
            else if ("yesNo".equals(eachCF.getFieldType().toString())){
                addYesNoField(eachCF.getFieldName());
        }
            else if ("multiChoice".equals(eachCF.getFieldType().toString())){
                addMultiCombo(eachCF.getFieldName(), eachCF.getMultiList());
        }
            else if ("number".equals(eachCF.getFieldType().toString())){
                addNumberField(eachCF.getFieldName());  
        }
            else {
                addSlider(eachCF.getFieldName());
        }
        }
            );
    }
    
    public void generateCustomField(CustomField aCustomField){
        
        //if (this.cFBox != null){
          //  cFBox = Box.createVerticalBox();
            //this.customFieldPanel.add(cFBox);
        //}
            if ("textbox".equals(aCustomField.getFieldType().toString())){
                addTextField(aCustomField.getFieldName());
        }
            else if ("yesNo".equals(aCustomField.getFieldType().toString())){
                addYesNoField(aCustomField.getFieldName());
        }
            else if ("multiChoice".equals(aCustomField.getFieldType().toString())){
                addMultiCombo(aCustomField.getFieldName(), aCustomField.getMultiList());
        }
            else if ("number".equals(aCustomField.getFieldType().toString())){
                addNumberField(aCustomField.getFieldName());  
        }
            else {
                addSlider(aCustomField.getFieldName());
        }

    }
    
}
