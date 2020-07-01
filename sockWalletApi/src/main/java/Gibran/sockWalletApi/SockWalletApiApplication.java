package Gibran.sockWalletApi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SockWalletApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SockWalletApiApplication.class, args);
		
		try {	
			final String sourceUrl = "https://live.euronext.com/en/markets/dublin/equities/list";
			final Document iseq = Jsoup.connect(sourceUrl).get();
			
			System.out.println(iseq);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
