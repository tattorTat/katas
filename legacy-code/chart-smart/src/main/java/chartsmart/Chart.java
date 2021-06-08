package chartsmart;

import java.awt.*;

public interface Chart {
    void displayChart(Graphics graphics, int width, int height);

    void drawChart(Graphics graphics);

    String getTitle();

    static Chart create(int chartType, String displayStyle) {
        if (chartType == IndividualDisplay.BAR_CHART) {
            return new BarChart(displayStyle, IndividualDisplay.SINGLE_MODE);
        } else {
            return new PieChart(displayStyle, IndividualDisplay.SINGLE_MODE);
        }
    }
}
