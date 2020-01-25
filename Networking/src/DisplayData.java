import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DisplayData {
	public static void main(String[] args) {
		String urls = "https://www.moneycontrol.com/india/stockpricequote/banks-private-sector/yesbank/YB";
		try {
			URL url = new URL(urls);
			URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while ((i = stream.read()) != -1) {
				System.out.print((char) i);
			}
			//System.out.println(getURLSource(urls));


		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String getURLSource(String url) throws IOException {
		URL urlObject = new URL(url);
		URLConnection urlConnection = urlObject.openConnection();
		urlConnection.setRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

		return toString(urlConnection.getInputStream());
	}

	private static String toString(InputStream inputStream) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))) {
			String inputLine;
			StringBuilder stringBuilder = new StringBuilder();
			while ((inputLine = bufferedReader.readLine()) != null) {
				stringBuilder.append(inputLine);
			}

			return stringBuilder.toString();
		}
	}
}
