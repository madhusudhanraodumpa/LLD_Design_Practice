package facade.facade1;

public class ReportCreatorFacade {
    public void reportGenerate(ReportType type,String location) {

        Report report = new Report();
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
        report.setData(new ReportData());


        ReportCreator writer = new ReportCreator();
        switch(type)
        {
            case HTML:
                writer.writeHtmlReport(report, location);
                break;

            case PDF:
                writer.writePdfReport(report, location);
                break;
        }
    }
}
