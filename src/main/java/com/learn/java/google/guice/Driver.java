package com.learn.java.google.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Driver {

  public static void main(String[] args) {

    // basic implementation of guice
    // The default binding creates a new instance everytime it is injected.

    // old method of generating objects
    ReportGenerator reportGenerator = new CSVGenerator();
    CustomerService customerService = new CustomerService(reportGenerator);
    System.out.println(customerService.generateReport());

    // using google injector
    Injector injector = Guice.createInjector(new ReportGenerateModule());
    ReportGenerator reportGenerator1 = injector.getInstance(CSVGenerator.class);
    CustomerService customerService1 = new CustomerService(reportGenerator1);
    System.out.println(customerService1.generateReport());

    // using @Inject annotation
    Injector injector1 = Guice.createInjector(new ReportGenerateModule());
    CustomerService customerService2 = injector1.getInstance(CustomerService.class);
    System.out.println(customerService2.generateReport());

    // @Inject on another method
    BillingService billingService = injector1.getInstance(BillingService.class);
    System.out.println(billingService.generateReport());

  }
}
