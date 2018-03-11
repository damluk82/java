import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class testzip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
//		String zipName = "d:/Tempz/fabfab-stoffe.de-b2c-responsive-shop-content-201610281224.zip";
		ZipFile zipfile = new ZipFile("d:/Tempz/fabfab-stoffe.de-b2c-responsive-shop-content-201610281224.zip");
		

//		InputStream theFile = new FileInputStream(zipName);
//		ZipInputStream stream = new ZipInputStream(theFile);
		
		
		
		for( Enumeration e = zipfile.entries(); e.hasMoreElements(); )
		{   
		    ZipEntry entry = (ZipEntry) e.nextElement();
		    System.out.println( entry.getName() + " " +  entry.getSize() );
		   
		}
		
		

		
	}

}
