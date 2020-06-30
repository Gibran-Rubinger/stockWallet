package Gibran.sockWalletApi;

public class IseqLibrary {

	public void MyIseq() {
		final String sourceUrl = "https://live.euronext.com/en/markets/dublin/equities/list";

		try {	
			final Document iseq = Jsoup.connect(sourceUrl);
		} catch (Exception ex) {

		}
	}

}
