/**
 * 
 */
package parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author debmalyajash
 *
 */
public class FormProcessor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if (args != null && args.length > 0) {
			proces(args[0]);
		} else {
			System.err.println("Usage: FormProcessor <symbol> e.g. FormProcessor goog");
			proces("raju");
		}

	}

	/**
	 * @param string
	 * @throws IOException 
	 */
	public static void proces(final String symbol) throws IOException {
//		
		Document doc = Jsoup.connect("https://www.sec.gov/Archives/edgar/data/1288776/000128877615000008/goog2014123110-k.htm").get();
		Elements fonts = doc.getElementsByTag("font");
		for (Element each:fonts) {
			System.out.println(each.text());
		}
		
	}

}
