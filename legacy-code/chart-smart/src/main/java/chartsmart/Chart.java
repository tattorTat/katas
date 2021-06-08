package chartsmart;

import java.awt.*;

public interface Chart {
    void displayChart(Graphics graphics, String displayStyle, String singleMode, int width, int height);

    void drawChart(Graphics graphics, String displayStyle, String singleMode);

    String getTitle(String displayStyle, String singleMode);
}
