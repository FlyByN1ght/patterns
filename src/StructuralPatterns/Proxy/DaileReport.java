package StructuralPatterns.Proxy;

import java.time.LocalDate;

public class DaileReport implements Report {
    @Override
    public String prepareReport(LocalDate date) {

        return "Report for " + date.toString();
    }
}
