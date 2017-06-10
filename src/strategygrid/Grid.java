package strategygrid;


public class Grid {

	Avatar[][] avatars; // 2-d matrix 

	public Grid(int size){
		avatars = new Avatar[size][size];
	}
	
	public Avatar get(int x, int y){
		return avatars[x][y];
	}
	
	public void add(Avatar avatar, Pos pos){
		avatars[pos.x][pos.y] = avatar;
		avatar.setGrid(this);
		avatar.setPos(pos);
	}

	public void set(Pos pos, Avatar avatar, Behaviour behave) {
		
		behave.execute(pos); // execute the behaviour. With a more sophsiticated approach it will affect how the Avatar moves on the grid
		avatars[avatar.getPos().x][avatar.getPos().y] = null;
		avatars[pos.x][pos.y] = avatar;
		avatar.setPos(pos);
	}
	
	public boolean isOccupied(Pos pos){
		if (avatars[pos.x][pos.y] != null){
			return true;
		}
		return false;
	}
	
	public Pos getRandXY(){	
		Pos pos = new Pos();
		pos.x = (int) (Math.random() * avatars.length);
		pos.y = (int) (Math.random() * avatars.length);
		
		return pos;
	}
	
	public static  double calc(Pos pos1, Pos pos2){
		
		int temp = (pos1.x - pos2.x) * (pos1.x - pos2.x) + (pos1.y - pos2.y) * (pos1.y - pos2.y);
		double dist = Math.sqrt(temp); 
		return dist;
		
	}
	
	
	
}
