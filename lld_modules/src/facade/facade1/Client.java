package facade.facade1;

public class Client {
    public static void main(String[] args) {

        ReportCreatorFacade reportCreatorFacade = new ReportCreatorFacade();
        reportCreatorFacade.reportGenerate(ReportType.PDF,"aws s3");
    }
}
