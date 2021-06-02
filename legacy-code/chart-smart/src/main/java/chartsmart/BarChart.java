package chartsmart;

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
}
