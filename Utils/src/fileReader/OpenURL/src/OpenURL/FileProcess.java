package fileReader.OpenURL.src.OpenURL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class FileProcess {

	static ArrayList<URI> TelisURL = new ArrayList<URI>();

	static ArrayList<URI> readInput(File f) {

		try {

			String sCurrentLine;
			URI URLPrefix = new URI(
					"https://phonebook.wob.vw.vwg/Hrv/UserLogin?remoteUserId=");
			URI FullURI;
			BufferedReader in = new BufferedReader(new FileReader(f));
			int x = 0;

			while ((sCurrentLine = in.readLine()) != null) {
				// System.out.println(sCurrentLine);
				FullURI = new URI(URLPrefix + sCurrentLine);
				TelisURL.add(FullURI);
				System.out.println(TelisURL.get(x));
				x++;

			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException ex) {
			System.out.println("URLExteption");
		}

		return TelisURL;
		
	}

}
