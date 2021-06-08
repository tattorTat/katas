package chartsmart;

import java.awt.*;
import java.io.Serializable;

public class BarChart implements Serializable, Chart {
    private final String displayStyle;
    private final String singleMode;

    public BarChart(String displayStyle, String singleMode) {
        this.displayStyle = displayStyle;
        this.singleMode = singleMode;
    }

    private String[] getBarChartData(String displayStyle) {
        String[] charts;
        if (displayStyle.equals(IndividualDisplay.SINGLE_MODE)) {
            charts = new String[1];
            charts[0] = "Bar Chart";
        } else {
            charts = new String[2];
            int i = 0;
            charts[i++] = "Bar Chart";
            charts[i] = "Small";
        }
        return charts;
    }

    @Override
    public void displayChart(Graphics graphics, int width, int height) {
        if (displayStyle.equals(singleMode)) {
            graphics.setColor(Color.RED);
            graphics.fillRect(100, 90, width - 200, 420);
        } else {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(95, 95, 210, 210);
        }
    }

    @Override
    public void drawChart(Graphics graphics) {
        Font font;
        String[] charts = getBarChartData(displayStyle);
        if (displayStyle.equals(singleMode)) {
            int bottomY = 500;
            graphics.setColor(Color.CYAN);
            graphics.fillRect(112, bottomY - 200, 75, 200);
            graphics.fillRect(187, bottomY - 400, 75, 400);
            graphics.fillRect(262, bottomY - 300, 75, 300);
            graphics.fillRect(337, bottomY - 250, 75, 250);
            graphics.fillRect(412, bottomY - 340, 75, 340);
            font = new Font("Arial Black", Font.BOLD, 55);
            graphics.setColor(Color.BLACK);
            graphics.setFont(font);
            graphics.drawString(charts[0], 130, 400);
        } else {
            font = new Font("Arial Black", Font.BOLD, 25);
            graphics.setColor(Color.CYAN);
            int bottomY = 300;
            graphics.fillRect(100, bottomY - 100, 40, 100);
            graphics.fillRect(140, bottomY - 200, 40, 200);
            graphics.fillRect(180, bottomY - 150, 40, 150);
            graphics.fillRect(220, bottomY - 125, 40, 125);
            graphics.fillRect(260, bottomY - 170, 40, 170);
            graphics.setColor(Color.RED);
            graphics.setFont(font);
            graphics.drawString(charts[0], 130, 250);
            graphics.drawString(charts[1], 130, 270);
        }
    }

    @Override
    public String getTitle() {
        String chartTitle;
        if (displayStyle.equals(singleMode)) {
            chartTitle = "Bar Chart - Single Mode";
        } else {
            chartTitle = "Bar Chart - Compare Mode";
        }
        return chartTitle;
    }
}
