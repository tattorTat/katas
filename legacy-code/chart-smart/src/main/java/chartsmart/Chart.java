package chartsmart;

import java.awt.*;

public interface Chart {
   void displayChart(Graphics graphics, int width, int height);

    void drawChart(Graphics graphics);

    String getTitle();
}
