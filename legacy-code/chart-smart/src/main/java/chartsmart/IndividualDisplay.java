package chartsmart;

import javax.swing.*;
import java.awt.*;

public class IndividualDisplay extends JPanel {
    public static final int BAR_CHART = 406;
    public static final String SINGLE_MODE = "rpfll";
    private Chart currentChart;

    private void setChartSize() {
        this.setPreferredSize(new Dimension(600, 600));
    }

    public String getTitle() {
        return currentChart.getTitle();
    }

    public void setChartTypeAndSetChartSize(int chartType, String displayStyle, boolean shouldSetSizeAndChartTitle) {
        if (chartType == BAR_CHART) {
            currentChart = new BarChart(displayStyle, SINGLE_MODE);
        } else {
            currentChart = new PieChart(displayStyle, SINGLE_MODE);
        }
        if (shouldSetSizeAndChartTitle) {
            setChartSize();
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
        currentChart.drawChart(graphics);
    }

    private void displaySetColorAndText(Graphics graphics, int width) {
        currentChart.displayChart(graphics, width, getHeight());
    }
}
