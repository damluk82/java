package fileReader.OpenURL.src.OpenURL;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;

public class TelisTest {

	static Desktop dt = Desktop.getDesktop();

	public static void openTelis(ArrayList<URI> a) {

		for (URI i : a) {

			try {
				dt.browse(i);
			} catch (Exception e) {
				System.out.println("Exception");
			}

		}

	}

}
