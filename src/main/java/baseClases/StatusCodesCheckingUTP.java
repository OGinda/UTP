package baseClases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StatusCodesCheckingUTP {
    public static String[] links = {"https://utorg.pro/", "https://utorg.pro/business", "https://utorg.pro/about/",
            "https://utorg.pro/privacy-policy/", "https://utorg.pro/contacts/", "https://utorg.pro/career/",
            "https://utorg.pro/blogs/", "https://utorg.pro/buy-btc-with-usd/",
            "https://utorg.pro/buy-btc-with-eur/", "https://utorg.pro/buy-btc-with-gbp/", "https://utorg.pro/buy-btc-with-inr/",
            "https://utorg.pro/buy-btc-with-aud/", "https://utorg.pro/buy-btc-with-cad/", "https://utorg.pro/buy-btc-with-dkk/",
            "https://utorg.pro/business", "https://utorg.pro/career/", "https://utorg.pro/blogs/", "https://utorg.pro/about/",
            "https://utorg.pro/contacts/", "https://policies.google.com/privacy", "https://policies.google.com/terms"
    };

    private int b = 0;
    public int fails;

    public StatusCodesCheckingUTP getStatus() throws IOException {
        for (int i = 0; i < links.length; i++) {
            URL url = new URL(links[i]);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            int responseCode = http.getResponseCode();
            System.out.println(responseCode + " : " + links[i]);
            if (responseCode != 200 && responseCode != 204) {
                System.out.println(links[i] + " failed with code: " + responseCode);
                failsCount();
                continue;
            }
        }
        return this;
    }

    public int failsCount() {
        b = +1;
        fails = fails + b;
        return fails;
    }
}
