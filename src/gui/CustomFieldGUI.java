<<<<<<< HEAD
package gui;

import cists.CustomField;
import cists.CustomFieldBoss;
import cists.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * GUI to display the custom fields.
 * 
 * @author m_hay
 * @since 20-06-2020
 * @version 1.0
 * 
 */
public class CustomFieldGUI extends javax.swing.JFrame implements ActionListener {
 
    /**
     * new JPanel.
     */
    JPanel cFPanel;
    
    /**
     * variable to reference the EventCustomField object.
     */
    EventCustomFields tempEventCF;
    
    /**
     * whether the GUI components have been created.
     */
    public Boolean customFieldsCreated = false;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customTFLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customYNLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customMCLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customSLDLabels;
    
    /**
     * list of Swing components.
     */
    public List<Object> customInputs;
    
    /**
     * list of JTextFields.
     */
    public List<javax.swing.JTextField> customTextFields;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customYesNos;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customMultiCombo;
    
    /**
     * list of JSliders.
     */
    public List<javax.swing.JSlider> customSliders;
    
    /**
     * Creates a new CustomFieldGUI using the customFieldBoss, adds a button
     * with a listener and calls the generateCustomFields() method to generate
     * the form.
     * @param aCFBoss CustomFieldBoss object.
     */
    public CustomFieldGUI(CustomFieldBoss aCFBoss){
        super("Custom Fields Input Form");
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
     * @param evt
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
     * method to add text input fields to the GUI.
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
        
        System.out.println("TextField Successfully Added");
    }
    
    /**
     * method to add Yes/No input fields to the GUI.
    */
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
        
        this.customYNLabels.add(customLabel);
        this.customInputs.add(customCombo);
        this.customYesNos.add(customCombo);
        
        revalidate();
        repaint();
        
        System.out.println("ComboBox Successfully Added");
    }
    
    /**
     * method to add number input fields to the GUI.
    */
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
        
        this.customTFLabels.add(customLabel);
        this.customInputs.add(customField);
        this.customTextFields.add(customField);
       
        
        
        revalidate();
        repaint();
        
        System.out.println("TextNumberField Successfully Added");
    }
    
     /**
     * method to add slider input fields to the GUI.
    */
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
    
     /**
     * method to add multi-choice combo input fields to the GUI.
    */
    public void addMultiCombo(String aFieldName, List<String> aMultiList, 
            String[] aMultiArray){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customMulti;
        customMulti = new javax.swing.JComboBox<>();
        customMulti.setModel(new javax.swing.DefaultComboBoxModel<>
        (aMultiArray));
        
        
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
        
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        this.customMCLabels.add(customLabel);
        this.customInputs.add(customMulti);
        this.customMultiCombo.add(customMulti);
        
        
        
        revalidate();
        repaint();
        
        System.out.println("MultiComboBox Successfully Added");
    } 
    
    /**
     * method that generates the custom fields from the list of customField objects.
     * @param aCustomFieldList 
     */
    public void generateCustomFields(List<CustomField> aCustomFieldList){
       
        aCustomFieldList.forEach((eachCF) -> {
            generateCustomField(eachCF);
        }
            );
    }
    
    /**
     * method that generates a custom field from the customField object.
     * @param aCustomField 
     */
    public void generateCustomField(CustomField aCustomField){
        
            if ("textbox".equals(aCustomField.getFieldType().toString())){
                addTextField(aCustomField.getFieldName());
        }
            else if ("yesNo".equals(aCustomField.getFieldType().toString())){
                addYesNoField(aCustomField.getFieldName());
        }
            else if ("multiChoice".equals(aCustomField.getFieldType().toString())){
                addMultiCombo(aCustomField.getFieldName(), aCustomField.getMultiList(),
                        aCustomField.getMultiArray());
        }
            else if ("number".equals(aCustomField.getFieldType().toString())){
                addNumberField(aCustomField.getFieldName());  
        }
            else {
                addSlider(aCustomField.getFieldName());
        }

    }
    
    /**
     * returns whether the custom fields have been created.
     * @return Boolean customFieldsCreated.
     */
    public Boolean getCustomFieldsCreated(){
        return this.customFieldsCreated;
    }
    
    /**
     * sets whether a the custom fields have been created.
     * @param a Boolean.
     */
    public void setCustomFieldsCreated(Boolean a){
        this.customFieldsCreated = a;
    }
}
=======
package gui;

import cists.CustomField;
import cists.CustomFieldBoss;
import cists.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * GUI to display the custom fields.
 * 
 * @author m_hay
 * @since 20-06-2020
 * @version 1.0
 * 
 */
public class CustomFieldGUI extends javax.swing.JFrame implements ActionListener {
 
    /**
     * new JPanel.
     */
    JPanel cFPanel;
    
    /**
     * variable to reference the EventCustomField object.
     */
    EventCustomFields tempEventCF;
    
    /**
     * whether the GUI components have been created.
     */
    public Boolean customFieldsCreated = false;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customTFLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customYNLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customMCLabels;
    
    /**
     * list of JLabels.
     */
    public List<javax.swing.JLabel> customSLDLabels;
    
    /**
     * list of Swing components.
     */
    public List<Object> customInputs;
    
    /**
     * list of JTextFields.
     */
    public List<javax.swing.JTextField> customTextFields;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customYesNos;
    
    /**
     * list of JComboBoxes.
     */
    public List<javax.swing.JComboBox> customMultiCombo;
    
    /**
     * list of JSliders.
     */
    public List<javax.swing.JSlider> customSliders;
    
    /**
     * Creates a new CustomFieldGUI using the customFieldBoss, adds a button
     * with a listener and calls the generateCustomFields() method to generate
     * the form.
     * @param aCFBoss CustomFieldBoss object.
     */
    public CustomFieldGUI(CustomFieldBoss aCFBoss){
        super("Custom Fields Input Form");
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
     * @param evt
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
     * method to add text input fields to the GUI.
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
        
        System.out.println("TextField Successfully Added");
    }
    
    /**
     * method to add Yes/No input fields to the GUI.
    */
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
        
        this.customYNLabels.add(customLabel);
        this.customInputs.add(customCombo);
        this.customYesNos.add(customCombo);
        
        revalidate();
        repaint();
        
        System.out.println("ComboBox Successfully Added");
    }
    
    /**
     * method to add number input fields to the GUI.
    */
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
        
        this.customTFLabels.add(customLabel);
        this.customInputs.add(customField);
        this.customTextFields.add(customField);
       
        
        
        revalidate();
        repaint();
        
        System.out.println("TextNumberField Successfully Added");
    }
    
     /**
     * method to add slider input fields to the GUI.
    */
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
    
     /**
     * method to add multi-choice combo input fields to the GUI.
    */
    public void addMultiCombo(String aFieldName, List<String> aMultiList, 
            String[] aMultiArray){
        
        javax.swing.JLabel customLabel;
        javax.swing.JComboBox customMulti;
        customMulti = new javax.swing.JComboBox<>();
        customMulti.setModel(new javax.swing.DefaultComboBoxModel<>
        (aMultiArray));
        
        
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
        
        this.cFPanel.add(customLabelSPACE2);
        this.cFPanel.add(customLabelSPACE3);
        this.customMCLabels.add(customLabel);
        this.customInputs.add(customMulti);
        this.customMultiCombo.add(customMulti);
        
        
        
        revalidate();
        repaint();
        
        System.out.println("MultiComboBox Successfully Added");
    } 
    
    /**
     * method that generates the custom fields from the list of customField objects.
     * @param aCustomFieldList 
     */
    public void generateCustomFields(List<CustomField> aCustomFieldList){
       
        aCustomFieldList.forEach((eachCF) -> {
            generateCustomField(eachCF);
        }
            );
    }
    
    /**
     * method that generates a custom field from the customField object.
     * @param aCustomField 
     */
    public void generateCustomField(CustomField aCustomField){
        
            if ("textbox".equals(aCustomField.getFieldType().toString())){
                addTextField(aCustomField.getFieldName());
        }
            else if ("yesNo".equals(aCustomField.getFieldType().toString())){
                addYesNoField(aCustomField.getFieldName());
        }
            else if ("multiChoice".equals(aCustomField.getFieldType().toString())){
                addMultiCombo(aCustomField.getFieldName(), aCustomField.getMultiList(),
                        aCustomField.getMultiArray());
        }
            else if ("number".equals(aCustomField.getFieldType().toString())){
                addNumberField(aCustomField.getFieldName());  
        }
            else {
                addSlider(aCustomField.getFieldName());
        }

    }
    
    /**
     * returns whether the custom fields have been created.
     * @return Boolean customFieldsCreated.
     */
    public Boolean getCustomFieldsCreated(){
        return this.customFieldsCreated;
    }
    
    /**
     * sets whether a the custom fields have been created.
     * @param a Boolean.
     */
    public void setCustomFieldsCreated(Boolean a){
        this.customFieldsCreated = a;
    }
}
>>>>>>> 1845e33bb69c178c291579b77d621224fd9171e9
