package chartsmart;

import java.io.Serializable;

public class PieChart implements Serializable {
    public PieChart() {
    }

    String setPieChartTitle(String displayStyle, String singleMode) {
        String chartTitle;
        if (displayStyle.equals(singleMode)) {
            chartTitle = "Pie Chart - Single Mode";
        } else {
            chartTitle = "Pie Chart - Compare Mode";
        }
        return chartTitle;
    }
}
