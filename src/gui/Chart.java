/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.GUI1;
import cists.Event;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * GUI class to create and display charts.
 * 
 * @author mathew hayfield
 * @since 29-01-2021
 * @version 1.0
 * 
 */
public class Chart extends javax.swing.JFrame{
    
    /**
     * Constructor
     */
    public Chart(){
    
    }
    
    public CategoryDataset createAnxLVLCatDataset(List<Event> events){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Event eachEvent : events){
            dataset.addValue(eachEvent.getAnxietyLevel(), eachEvent.getDate(), 
                    String.valueOf(eachEvent.getOverallIntensity()));
        }
        return dataset;
    }
    
    public JFreeChart createChart(CategoryDataset dataset, String name, String 
            xLabel, String yLabel){
        
        JFreeChart barChart = ChartFactory.createBarChart(
                name, xLabel, yLabel, dataset, PlotOrientation.VERTICAL,
                true, true, false
        );
        
        return barChart;
    }
  
    
}
