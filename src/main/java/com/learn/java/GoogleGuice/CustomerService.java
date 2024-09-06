package com.learn.java.GoogleGuice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CustomerService {

  ReportGenerator reportGenerator;

  @Inject
  public CustomerService(@Named("CSVReporterImpl") ReportGenerator reportGenerator) {
    this.reportGenerator = reportGenerator;
  }

  public String generateReport() {
    return "Customer Service Generates " + reportGenerator.generate();
  }

}
