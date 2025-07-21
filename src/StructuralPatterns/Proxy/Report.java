package StructuralPatterns.Proxy;

import java.time.LocalDate;

public interface Report {
    String prepareReport(LocalDate date);
}
