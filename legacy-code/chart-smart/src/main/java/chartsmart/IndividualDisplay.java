package chartsmart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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

    private String setPieChartTitle(String displayStyle, String singleMode) {
        return pieChart.setPieChartTitle(displayStyle, singleMode);
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
            drawPieChart(graphics);
        }
    }

    private void drawPieChart(Graphics graphics) {
        Font font;
        String[] pieChartData = new String[0];
        List<String> getPositionalData = new ArrayList<>();
        pieChartData = getPieChartData(getPositionalData, pieChartData);
        if (displayStyle.equals(SINGLE_MODE)) {
            font = new Font("Bookman Old Style", Font.BOLD, 55);
            graphics.setColor(Color.WHITE);
            graphics.setFont(font);
            graphics.drawString(getPositionalData.get(0), 200, 340);
        } else {
            font = new Font("Bookman Old Style", Font.BOLD, 30);
            graphics.setFont(font);
            graphics.setColor(Color.WHITE);
            graphics.drawString(pieChartData[0], 145, 205);
            graphics.drawString(pieChartData[1], 170, 235);
        }
    }

    private String[] getPieChartData(List<String> getPositionalData, String[] pieChartData) {
        if (displayStyle.equals(SINGLE_MODE)) {
            getPositionalData.add("Pie Chart");
        } else {
            pieChartData = new String[2];
            pieChartData[1] = "Small";
            pieChartData[0] = "Pie Chart";
        }
        return pieChartData;
    }

    private void displaySetColorAndText(Graphics graphics, int width) {
        if (chartType == BAR_CHART) {
            barChart.displayBarChart(graphics, width, displayStyle, SINGLE_MODE);
        } else {
            displayPieChart(graphics);
        }
    }

    private void displayPieChart(Graphics graphics) {
        if (displayStyle.equals(SINGLE_MODE)) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(100, 100, 450, getHeight() - 150);
        } else {
            graphics.setColor(Color.BLUE);
            double isq = 405;
            float padding = 90;
            int sc = (int) (isq - padding * 2);
            graphics.fillOval(100, 100, sc, sc);
        }
    }

}
