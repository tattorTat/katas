package chartsmart;

import javax.swing.*;
import java.awt.*;

public class IndividualDisplay extends JPanel {

    public static final int BAR_CHART = 406;
    public static final String SINGLE_MODE = "rpfll";
    private final BarChart barChart = new BarChart();
    private final PieChart pieChart = new PieChart();
    private String displayStyle;
    private String chartTitle;
    private int chartType;

    private void setSizeAndChartTitle() {
        this.setPreferredSize(new Dimension(600, 600));
        setChartTitle();
    }

    private void setChartTitle() {
        if (chartType == BAR_CHART) {
            this.chartTitle = barChart.getTitle(displayStyle, SINGLE_MODE);
        } else {
            this.chartTitle = pieChart.getTitle(displayStyle, SINGLE_MODE);
        }
    }

    public String getTitle() {
        return chartTitle;
    }

    /**
     * Shows the chart
     */
    public void setChartTypeAndDisplayStyleAndChartTitle(int chartType, String displayStyle, boolean shouldSetSizeAndChartTitle) {
        this.chartType = chartType;
        this.displayStyle = displayStyle;
        if (shouldSetSizeAndChartTitle) {
            setSizeAndChartTitle();
        }
    }

    public void paint(Graphics graphics) {
        DrawChart(graphics);
    }

    private void DrawChart(Graphics graphics) {
        displaySetColorAndText(graphics, getWidth());
        drawChartByType(graphics);
    }

    private void drawChartByType(Graphics graphics) {
        if (chartType == BAR_CHART) {
            barChart.drawChart(graphics, displayStyle, SINGLE_MODE);
        } else {
            pieChart.drawChart(graphics, displayStyle, SINGLE_MODE);
        }
    }

    private void displaySetColorAndText(Graphics graphics, int width) {
        if (chartType == BAR_CHART) {
            barChart.displayChart(graphics, displayStyle, SINGLE_MODE, width, getHeight());
        } else {
            pieChart.displayChart(graphics, displayStyle, SINGLE_MODE, width, getHeight());
        }
    }
}
