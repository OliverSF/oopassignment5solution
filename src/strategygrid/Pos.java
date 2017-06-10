package strategygrid;


/**
 * @author conorhayes
 * Pos is a simple class that
 * holds (x,y) values
 */
public class Pos {
	public int x,y;

	public Pos(int x, int y){
		this.x = x;
		this.y =y;
	}

	public Pos() {
		this.x = 0;
		this.y =0;
	}
	
	public String toString(){
		return new String (this.x + "," + this.y);
	}
}

