
package View;

import Model.PopulationModel;
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.labels.PieSectionLabelGenerator;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
import org.jfree.data.general.PieDataset;
import java.text.DecimalFormat;  
  


/**
 *
 * @author bridgethester
 */

public class PieChart {
  public ChartPanel chartPanel;  
    public PieChart(PopulationModel epidemic, int timeframe) {  
   
    PieDataset dataset = createDataset(epidemic, timeframe);  
    JFreeChart chart = ChartFactory.createPieChart(  
        "Pie Chart",  
        dataset,  
        true,   
        true,  
        false);  
  
   
    PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(  
        "{0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));  
    ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);  
      
    
    chartPanel = new ChartPanel(chart);  
    
  }  
    private PieDataset createDataset(PopulationModel epidemic, int timeframe) {  
   
    DefaultPieDataset dataset=new DefaultPieDataset();  
    dataset.setValue("Susceptible", epidemic.S.get(timeframe));  
    dataset.setValue("Exposed", epidemic.E.get(timeframe));  
    dataset.setValue("Infected", epidemic.I.get(timeframe));  
    dataset.setValue("Recovered", epidemic.R.get(timeframe));  
    return dataset;  
  }  
    
    
}
