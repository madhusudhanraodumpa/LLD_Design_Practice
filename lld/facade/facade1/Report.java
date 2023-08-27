package facade.facade1;

public class Report {
    ReportData data;
    ReportHeader header;
    ReportFooter footer;

    public ReportData getData() {
        return data;
    }

    public void setData(ReportData data) {
        System.out.println("Setting report data..");
        this.data = data;
    }

    public ReportHeader getHeader() {
        return header;
    }

    public void setHeader(ReportHeader header) {
        System.out.println("Setting report header..");
        this.header = header;
    }

    public ReportFooter getFooter() {
        return footer;
    }

    public void setFooter(ReportFooter footer) {
        System.out.println("Setting report footer..");
        this.footer = footer;
    }
}
