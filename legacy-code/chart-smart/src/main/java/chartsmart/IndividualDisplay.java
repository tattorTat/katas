package chartsmart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IndividualDisplay extends JPanel {

    public static final int BAR_CHART = 406;
    public static final String SINGLE_MODE = "rpfll";
    private String displayStyle;
    private String chartTitle;
    private int chartType;

    private void setSizeAndChartTitle() {
        this.setPreferredSize(new Dimension(600, 600));
        setChartTitle();
    }

    private void setChartTitle() {
        if (chartType == BAR_CHART) {
            setBarChartTitle();
        } else {
            setPieChartTitle();
        }
    }

    private void setPieChartTitle() {
        if (displayStyle.equals(SINGLE_MODE)) {
            String chartTitle1 = "Pie Chart - Single Mode";
            this.chartTitle = chartTitle1;
        } else {
            String chartTitle1 = "Pie Chart - Compare Mode";
            this.chartTitle = chartTitle1;
        }
    }

    private void setBarChartTitle() {
        if (displayStyle.equals(SINGLE_MODE)) {
            String chartTitle1 = "Bar Chart - Single Mode";
            this.chartTitle = chartTitle1;
        } else {
            String chartTitle1 = "Bar Chart - Compare Mode";
            this.chartTitle = chartTitle1;
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
        displaySetColorAndText(graphics);
        extracted(graphics);
    }

    private void extracted(Graphics graphics) {
        Font font;
        if (chartType == BAR_CHART) {
            String[] charts = getBarChartData();
            if (displayStyle.equals(SINGLE_MODE)) {
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
        } else {
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

    private String[] getBarChartData() {
        String[] charts;
        if (displayStyle.equals(SINGLE_MODE)) {
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

    private void displaySetColorAndText(Graphics graphics) {
        if (chartType == BAR_CHART) {
            if (displayStyle.equals(SINGLE_MODE)) {
                graphics.setColor(Color.RED);
                graphics.fillRect(100, 90, getWidth() - 200, 420);
            } else {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(95, 95, 210, 210);
            }
        } else {
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

}
