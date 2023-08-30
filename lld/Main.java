import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static final String DATE_FORMAT = "MM/dd/yyyy HH:mm";
    private static final String TIME_ZONE = "GMT";
    public static void main(String[] args) {
        String site = null;
        String url_host ="https://WWW.amazon.in/Pigeon-Rapido-Cute-1800-Watt-Induction/dp/B06XFW58FJ/ref=sr_1_11?keywords=induction%2Bstove%2Bkitchen%2Bset&qid=1655532087&sprefix=induction%2Bstoves%2Bset%2Caps%2C540&sr=8-11&th=1";

        try {
            URI uri = new URI(url_host);
            site = uri.getHost();
            if(site != null){
                site =  site.replace("www.","");
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        System.out.println(site);
    }
}