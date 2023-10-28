package interactiveepidemiologytool;

import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartSimulation {
    
    public ChartPanel makeChart(PopulationModel epidemic, int timeframe) {
        XYSeries chartS = new XYSeries("S");    // Label lines for chart
        XYSeries chartE = new XYSeries("E");
        XYSeries chartI = new XYSeries("I");
        XYSeries chartR = new XYSeries("R");

        for (int i = 0; i < timeframe; i++) {
            chartS.add(i, epidemic.S.get(i));   // Add points to lines
            chartE.add(i, epidemic.E.get(i));
            chartI.add(i, epidemic.I.get(i));
            chartR.add(i, epidemic.R.get(i));
        }

        XYSeriesCollection simulation = new XYSeriesCollection();   // Combine lines into collection
        simulation.addSeries(chartS);
        simulation.addSeries(chartE);
        simulation.addSeries(chartI);
        simulation.addSeries(chartR);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Population Simulation During Epidemic",
                "Days",
                "Population",
                simulation,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.yellow);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));
        renderer.setSeriesPaint(2, Color.green);
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
        renderer.setSeriesPaint(3, Color.blue);
        renderer.setSeriesStroke(3, new BasicStroke(2.0f));
        plot.setRenderer(renderer);
        
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        
        ChartPanel panel = new ChartPanel(chart);
        
        return panel;
}
}
