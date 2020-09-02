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
import java.awt.Color;
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
import javax.swing.border.LineBorder;

/**
 *
 * @author m_hay
 */
public class CustomFieldGUI extends javax.swing.JFrame implements ActionListener {
 
    JPanel cFPanel;
    EventCustomFields tempEventCF;
    public Boolean customFieldsCreated = false;
    
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
   
    public CustomFieldGUI(CustomFieldBoss aCFBoss){
        super("Custom Fields Input Form");
        //setLayout(new BorderLayout());
        this.cFPanel = new JPanel();
        this.cFPanel.setLayout(new BoxLayout(this.cFPanel, BoxLayout.Y_AXIS));
        add(cFPanel, BorderLayout.CENTER);
        
        JButton createCFButton = new JButton("Store Custom Info");
        add(createCFButton, BorderLayout.SOUTH);
        createCFButton.addActionListener(this);
        
        customInputs = new ArrayList<>();
        customTFLabels = new ArrayList<>();
        customYNLabels = new ArrayList<>();
        customMCLabels = new ArrayList<>();
        customSLDLabels = new ArrayList<>();
        customTextFields = new ArrayList<>();
        customYesNos = new ArrayList<>();
        customMultiCombo = new ArrayList<>();
        customSliders = new ArrayList<>();
        
        generateCustomFields(aCFBoss.getCustomFieldList());
        setSize(400, 800);
        setLocation(500, 200);
        setVisible(true);
        
    }
    
    /**
     * action performed method for creation of ECF object.
     */

    public void actionPerformed(ActionEvent evt){
         List<String> customFieldNames; 
         List<String> customFieldInputs;
         
         customFieldNames = new ArrayList<>();
         customFieldInputs = new ArrayList<>();
         
         for (JTextField eachCFInput : customTextFields){
            customFieldInputs.add(eachCFInput.getText());
         }
         
         for (JComboBox eachCFInput : customYesNos){
            customFieldInputs.add(eachCFInput.getSelectedItem().toString());  
         }
         
         for (JComboBox eachCFInput : customMultiCombo){
            customFieldInputs.add(eachCFInput.getSelectedItem().toString());  
         }
         
         for (JSlider eachCFInput : customSliders){
            customFieldInputs.add(Integer.toString(eachCFInput.getValue()));  
         }
         
         for (JLabel eachCFLabel : customTFLabels){
            customFieldNames.add(eachCFLabel.getText());  
         }
         
         for (JLabel eachCFLabel : customYNLabels){
            customFieldNames.add(eachCFLabel.getText());  
         }
         
         for (JLabel eachCFLabel : customMCLabels){
            customFieldNames.add(eachCFLabel.getText());  
         }
         
         for (JLabel eachCFLabel : customSLDLabels){
            customFieldNames.add(eachCFLabel.getText());  
         }
         
         tempEventCF = new EventCustomFields(customFieldNames ,customFieldInputs);
         setCustomFieldsCreated(true);
         JOptionPane.showMessageDialog(null, "Custom Inputs Saved Successully.");
         this.dispose();
        
         
    }
    
    /**
     * methods to add input fields to the gui
    */
    public void addTextField(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JTextField customField;
        customLabel = new javax.swing.JLabel(aFieldName);
        customField = new javax.swing.JTextField(20);
        customField.setBorder(new LineBorder(Color.BLACK, 1));
        
        javax.swing.JLabel customLabelSPACE;
        customLabelSPACE = new javax.swing.JLabel("  ");
        
        javax.swing.JLabel customLabelSPACE2;
        customLabelSPACE2 = new javax.swing.JLabel("****");
        
        javax.swing.JLabel customLabelSPACE3;
        customLabelSPACE3 = new javax.swing.JLabel("  ");
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customField);
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        
        this.cFPanel.setVisible(true);
        
        this.customTFLabels.add(customLabel);
        this.customInputs.add(customField);
        this.customTextFields.add(customField);
        
        
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
        
        javax.swing.JLabel customLabelSPACE;
        customLabelSPACE = new javax.swing.JLabel("  ");
        
        javax.swing.JLabel customLabelSPACE2;
        customLabelSPACE2 = new javax.swing.JLabel("****");
        
        javax.swing.JLabel customLabelSPACE3;
        customLabelSPACE3 = new javax.swing.JLabel("  ");
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customCombo);
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        
        //this.customLabels.add(customLabel);
        this.customYNLabels.add(customLabel);
        this.customInputs.add(customCombo);
        this.customYesNos.add(customCombo);
        
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
        customField.setBorder(new LineBorder(Color.BLACK, 1));
        
        javax.swing.JLabel customLabelSPACE;
        customLabelSPACE = new javax.swing.JLabel("  ");
        
        javax.swing.JLabel customLabelSPACE2;
        customLabelSPACE2 = new javax.swing.JLabel("****");
        
        javax.swing.JLabel customLabelSPACE3;
        customLabelSPACE3 = new javax.swing.JLabel("  ");
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customField);
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        
        //this.customLabels.add(customLabel);
        this.customTFLabels.add(customLabel);
        this.customInputs.add(customField);
        this.customTextFields.add(customField);
       
        
        
        revalidate();
        repaint();
        
        System.out.println("TextNumberField Successfully Added");
    }
    
     public void addSlider(String aFieldName){
        
        javax.swing.JLabel customLabel;
        javax.swing.JSlider customSlider;
        customLabel = new javax.swing.JLabel(aFieldName);
        customSlider = new javax.swing.JSlider(1, 10);
        
        javax.swing.JLabel customLabelSPACE;
        customLabelSPACE = new javax.swing.JLabel("  ");
        
        javax.swing.JLabel customLabelSPACE2;
        customLabelSPACE2 = new javax.swing.JLabel("****");
        
        javax.swing.JLabel customLabelSPACE3;
        customLabelSPACE3 = new javax.swing.JLabel("  ");
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customSlider);
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        
        //this.customLabels.add(customLabel);
        this.customSLDLabels.add(customLabel);
        this.customInputs.add(customSlider);
        this.customSliders.add(customSlider);
        
        revalidate();
        repaint();
        
        System.out.println("Slider Successfully Added");
    }
    
    public void addMultiCombo(String aFieldName, List<String> aMultiList){
        
        DefaultComboBoxModel comboModel = new javax.swing.DefaultComboBoxModel<>
        (aMultiList.toArray(new String[0]));
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customMulti;
        customMulti = new javax.swing.JComboBox<>();
        
        
        customLabel = new javax.swing.JLabel(aFieldName);
        
        javax.swing.JLabel customLabelSPACE;
        customLabelSPACE = new javax.swing.JLabel("  ");
        
        javax.swing.JLabel customLabelSPACE2;
        customLabelSPACE2 = new javax.swing.JLabel("****");
        
        javax.swing.JLabel customLabelSPACE3;
        customLabelSPACE3 = new javax.swing.JLabel("  ");
        
        
        this.cFPanel.add(customLabel);
        this.cFPanel.add(customLabelSPACE);
        this.cFPanel.add(customMulti);
        customMulti.setModel(comboModel);
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        //this.customLabels.add(customLabel);
        this.customMCLabels.add(customLabel);
        this.customInputs.add(customMulti);
        this.customMultiCombo.add(customMulti);
        
        
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
    
    public Boolean getCustomFieldsCreated(){
        return this.customFieldsCreated;
    }
    
    public void setCustomFieldsCreated(Boolean a){
        this.customFieldsCreated = a;
    }
}
