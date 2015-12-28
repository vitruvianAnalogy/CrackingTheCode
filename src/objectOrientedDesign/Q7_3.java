package objectOrientedDesign;
import java.util.*;

public class Q7_3 {

}

class CDPlayer{
	private CD c;
	private Playlist p;
	
	public CD getCD(){
		return c;
	}
	public void setCD(CD cd){
		
	}
	public Playlist getPlayList(){
		return p;
	}
	public void setPlaylist(Playlist p){
		
	}
	public CDPlayer(Playlist p){
		this.p = p;
	}
	public CDPlayer(CD c){
		this.c = c;
	}
	
	
}

class Playlist{
	
}

class Jukebox{
	private Playlist p;
	private CD c;
	public void display(){
		
	}
}

class CD{
	String title;
	ArrayList<Song> list = new ArrayList<Song>();
}

class Song{
	String title;
	String singer;
	String CD;
}