package chartsmart;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PieChart implements Serializable {
    public PieChart() {
    }

    String getTitle(String displayStyle, String singleMode) {
        String chartTitle;
        if (displayStyle.equals(singleMode)) {
            chartTitle = "Pie Chart - Single Mode";
        } else {
            chartTitle = "Pie Chart - Compare Mode";
        }
        return chartTitle;
    }

    void drawChart(Graphics graphics, String displayStyle, String singleMode) {
        String[] pieChartData = new String[0];
        List<String> getPositionalData = new ArrayList<>();
        String[] pieChartData1 = pieChartData;
        getPiChartData(graphics, displayStyle, singleMode, getPositionalData, pieChartData1);
    }

    private void getPiChartData(Graphics graphics, String displayStyle, String singleMode, List<String> getPositionalData, String[] pieChartData1) {
        Font font;
        if (displayStyle.equals(singleMode)) {
            getPositionalData.add("Pie Chart");
        } else {
            pieChartData1 = new String[2];
            pieChartData1[1] = "Small";
            pieChartData1[0] = "Pie Chart";
        }

        String[] pieChartData = pieChartData1;
        if (displayStyle.equals(singleMode)) {
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

    void displayChart(Graphics graphics, String displayStyle, String singleMode, int width, int height) {
        if (displayStyle.equals(singleMode)) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(100, 100, 450, height - 150);
        } else {
            graphics.setColor(Color.BLUE);
            double isq = 405;
            float padding = 90;
            int sc = (int) (isq - padding * 2);
            graphics.fillOval(100, 100, sc, sc);
        }
    }
}
