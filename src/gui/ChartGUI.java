/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import cists.CISTSCoord;
import cists.Event;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author m_hay
 */
public class ChartGUI extends javax.swing.JFrame implements ActionListener{
    /**
     * new JPanel.
     */
    JPanel chartJPanel;
    List<Event> chartEvents;
    CategoryDataset barDataset;
    XYDataset lineDataset;
    CISTSCoord cISTSCoord;
    
    public ChartGUI(List<Event> selectedEvents, CISTSCoord coord, String chartType, String xAxis, String yAxis){
        cISTSCoord = coord;
        chartEvents = selectedEvents;
        
        if ("Bar Chart".equals(chartType)){
            barDataset = cISTSCoord.chartManager.createCatDataset(selectedEvents);
        }
        else if("XY Line Chart".equals(chartType)){
            lineDataset = cISTSCoord.chartManager.createXYSeries(selectedEvents);
        }
       
        
        
        //JFreeChart chart = cISTSCoord.chartManager.createBarChart(dataset, "Chart", "X", "Y");
        JFreeChart chart = cISTSCoord.chartManager.createLineChart(lineDataset, "Chart", "Overall Intensity", "Anx Lvl");
        
         System.out.println("Chart Created");
        
        this.chartJPanel = new JPanel();
         
        
        this.chartJPanel.setLayout(new BoxLayout(chartJPanel, BoxLayout.Y_AXIS));
        this.add(chartJPanel, BorderLayout.CENTER);
        
        ChartPanel cPanel = new ChartPanel(chart);
      
        this.chartJPanel.add(cPanel);
     
        setSize(800, 500);
        setLocation(500, 200);
        setVisible(true);
    }
    
     
     

      
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
