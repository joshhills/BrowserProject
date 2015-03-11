import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * @author Josh Hills
 * @version 1.1
 * 
 * Class models a browser 'bookmark' with a graphic, name, and link.
 */
public class Bookmark {

	// Custom icon.
	private Icon ico;
	// User-defined name for identification.
	private String name;
	// Link location.
	private URL url;
	
	// Constructor initialises private fields.
	public Bookmark(Icon ico, String name, URL url) {
		
		this.ico = ico;
		this.name = name;
		this.url = url;
		
	}
	
	/* Accessor methods. */
	
	public Icon getIcon() {
		return ico;
	}
	
	public void setIcon(Icon ico) {
		this.ico = ico;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public URL getURL() {
		return url;
	}
	
	public void setURL(URL url) {
		this.url = url;
	}
	
}
