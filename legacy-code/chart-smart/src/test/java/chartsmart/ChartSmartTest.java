package chartsmart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.approvaltests.awt.AwtApprovals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@EnabledOnOs(OS.MAC)
@UseReporter(ClipboardReporter.class)
class ChartSmartTest {

  @Test
  void testMainWindow() {
    MainWindow chartSmart = new MainWindow();
    AwtApprovals.verify(chartSmart);
  }

  @Test
  void testBarChartWindow() {
    IndividualDisplay chartSmart = new IndividualDisplay();
    chartSmart.setChartTypeAndSetChartSize(406, "rpfll", true);
    AwtApprovals.verify(chartSmart);
    assertEquals("Bar Chart - Single Mode", chartSmart.getTitle());
  }

  @Test
  void testPieChartWindow() {
    IndividualDisplay chartSmart = new IndividualDisplay();
    chartSmart.setChartTypeAndSetChartSize(323, "rpfll", true);
    AwtApprovals.verify(chartSmart);
    assertEquals("Pie Chart - Single Mode", chartSmart.getTitle());
}

  @Test
  void testBarChartSmallWindow() {
    IndividualDisplay chartSmart = new IndividualDisplay();
    chartSmart.setChartTypeAndSetChartSize(406, "shareddisplay", true);
    AwtApprovals.verify(chartSmart);
    assertEquals("Bar Chart - Compare Mode", chartSmart.getTitle());
  }

  @Test
  void testPieChartSmallWindow() {
    IndividualDisplay chartSmart = new IndividualDisplay();
    chartSmart.setChartTypeAndSetChartSize(323, "shareddisplay", true);
    AwtApprovals.verify(chartSmart);
    assertEquals("Pie Chart - Compare Mode", chartSmart.getTitle());
  }
}
