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
            this.chartTitle = barChart.setBarChartTitle(displayStyle, SINGLE_MODE);
        } else {
            this.chartTitle = pieChart.setPieChartTitle(displayStyle, SINGLE_MODE);
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
            barChart.drawBarChart(graphics, displayStyle, SINGLE_MODE);
        } else {
            pieChart.drawPieChart(graphics, displayStyle, SINGLE_MODE);
        }
    }

    private void displaySetColorAndText(Graphics graphics, int width) {
        if (chartType == BAR_CHART) {
            barChart.displayBarChart(graphics, width, displayStyle, SINGLE_MODE);
        } else {
            pieChart.displayPieChart(graphics, displayStyle, SINGLE_MODE, getHeight());
        }
    }

}
