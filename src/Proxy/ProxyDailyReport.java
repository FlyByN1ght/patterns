package Proxy;

import java.time.LocalDate;
import java.util.HashMap;

public class ProxyDailyReport implements Report {
    private DaileReport daileReport;
    private static HashMap<LocalDate, String> cache = new HashMap<>();


    public ProxyDailyReport(DaileReport daileReport) {
        this.daileReport = daileReport;
    }

    @Override
    public String prepareReport(LocalDate date) {
        if (cache.get(date) == null) {
            String report = daileReport.prepareReport(date);
            cache.put(date, report);
            return report;
        }
        return cache.get(date);
    }
}
