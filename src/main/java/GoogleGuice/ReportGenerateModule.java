package GoogleGuice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ReportGenerateModule extends AbstractModule {

    @Override
    protected void configure() {
        bind (ReportGenerator.class).to(CSVGenerator.class);

        // can't do this as this will lead to multiple bindings to same class
            /*bind (ReportGenerator.class).to (XMLGenerator.class);*/
        // so we use @Named annotation to bind same class to multiple implementations

        bind (ReportGenerator.class).annotatedWith (Names.named ("CSVReporterImpl"))
                .to(CSVGenerator.class);
        bind (ReportGenerator.class).annotatedWith (Names.named ("XMLReporterImpl"))
                .to(XMLGenerator.class);
    }
}
