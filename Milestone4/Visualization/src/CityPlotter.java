import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CityPlotter extends JFrame {
    public CityPlotter() {
        super("City Plotter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XYSeriesCollection dataset = createDataset(
                "C:\\Users\\PNW_checkout\\Documents\\Algo\\project\\Milestone4\\city_attributes.csv");
        JFreeChart chart = ChartFactory.createScatterPlot(
                "City Plot",
                "Longitude",
                "Latitude",
                dataset);
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setDomainPannable(true);
        plot.setRangePannable(true);

        // Set tooltips for each data point individually
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries series = dataset.getSeries(i);
            plot.getRenderer().setSeriesToolTipGenerator(i, new CustomXYToolTipGenerator(series));
        }

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        chartPanel.setMouseWheelEnabled(true);

        setContentPane(chartPanel);
    }

    private XYSeriesCollection createDataset(String csvFilePath) {
        XYSeriesCollection dataset = new XYSeriesCollection();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            br.readLine(); // Skip the header row

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String city = data[0];
                try {
                    double longitude = Double.parseDouble(data[5]);
                    double latitude = Double.parseDouble(data[6]);
                    String tooltipText = "City: " + city + "  Distance: " + data[2] + "  Gallons: " + data[3]
                            + "  Weather: " + data[4] + "  ETA: " + data[7];
                    XYSeries series = new XYSeries(city);
                    series.add(longitude, latitude);
                    series.setDescription(tooltipText);
                    dataset.addSeries(series);
                } catch (NumberFormatException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        return dataset;
    }

    private static class CustomXYToolTipGenerator implements XYToolTipGenerator {
        private final XYSeries series;

        public CustomXYToolTipGenerator(XYSeries series) {
            this.series = series;
        }

        @Override
        public String generateToolTip(XYDataset dataset, int seriesIndex, int itemIndex) {
            if (seriesIndex < dataset.getSeriesCount() && itemIndex < dataset.getItemCount(seriesIndex)) {
                // Retrieve the tooltip text set in the description
                return series.getDescription();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CityPlotter plotter = new CityPlotter();
            plotter.pack();
            plotter.setLocationRelativeTo(null);
            plotter.setVisible(true);
        });
    }
}






