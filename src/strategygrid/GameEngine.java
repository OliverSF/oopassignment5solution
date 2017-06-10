package strategygrid;


//This is just a demo - please customise you own	
public class GameEngine {

	// basic demo of the functionality
	public static void main(String[] args) {
		
		Grid grid = new Grid(10);
		
		Politician enda  = new Politician("Enda");
		Politician micheal  = new Politician("Michael");
		Politician brendan  = new Politician("Brendan");
		Politician gerry  = new Politician("Gerry");
		
		//initial positions
		grid.add(enda, new Pos(0,1));
		grid.add(micheal, new Pos(6,2));
		grid.add(brendan, new Pos(4,1));
		grid.add(gerry, new Pos(7,6));
		
		//for 20 iterations, move them to random locations on the grid
		for (int i = 0; i< 10; i++){
				enda.move(grid.getRandXY());
				micheal.move(grid.getRandXY());
				brendan.move(grid.getRandXY());
				gerry.move(grid.getRandXY());
		}
		
		System.out.println("Adding New strategy ");
		System.out.println("************************* ");
		
		new Strategy2(enda);
		new Strategy2(micheal);
		new Strategy2(brendan);
		new Strategy2(gerry);
		
		for (int i = 0; i< 10; i++){
			enda.move(grid.getRandXY());
			micheal.move(grid.getRandXY());
			brendan.move(grid.getRandXY());
			gerry.move(grid.getRandXY());
	}
		
			
	}	
}

