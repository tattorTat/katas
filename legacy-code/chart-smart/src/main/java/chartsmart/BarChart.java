package chartsmart;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class BarChart implements Serializable {
    public BarChart() {
    }

    String[] getBarChartData(String displayStyle) {
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

    void displayBarChart(Graphics graphics, String displayStyle, JComponent jComponent) {
        if (displayStyle.equals(IndividualDisplay.SINGLE_MODE)) {
            graphics.setColor(Color.RED);
            graphics.fillRect(100, 90, jComponent.getWidth() - 200, 420);
        } else {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(95, 95, 210, 210);
        }
    }
}
