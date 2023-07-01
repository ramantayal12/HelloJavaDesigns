package GoogleGuice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class BillingService {

    ReportGenerator reportGenerator;

    @Inject
    public BillingService(@Named("XMLReporterImpl") ReportGenerator reportGenerator){
        this.reportGenerator = reportGenerator;
    }

    public String generateReport(){
        return "Billing Service generates " + reportGenerator.generate ();
    }
}
