package strategygrid;

public abstract class Avatar {

	private Behaviour behaviour; // behaviour e.g. walk, run or fly
	private Pos currPos; // current position on the grid
	private Grid grid; // reference to the Grid object
	private String name; // Avatar's name
	
	private Strategy strategy; // strategy determining when to walk run or fly
	

	public Avatar(String name){
		this.behaviour = new Walk(); //default. Can be changed at runtime
		this.strategy = new Strategy1(this); //default. Can be changed at runtime
		this.name = name;
	}

	public void setBehaviour(Behaviour behave){
		this.behaviour = behave;
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void setGrid(Grid grid){
		this.grid = grid;
	}

	public void setPos(Pos pos){
		this.currPos = pos;
	}
	
	public Pos getPos(){
		return this.currPos;
	}

	public boolean move(Pos newPos){
		System.out.print(name + ";");
		if(this.grid.isOccupied(newPos)){
			System.out.println(" Position " + newPos + " is OCCUPIED.");
			return false;
		}
		
		double dist = Grid.calc(currPos, newPos); // calculate the distance
		System.out.printf(" Distance from " + currPos + " to " + newPos+ " = %.2f;", dist);
		strategy.setBehaviour(dist); // this method decides the behaviour
		grid.set(newPos, this, behaviour); // update the position
		return true;
	}



	public String getName() {
		return this.name;
	}
}
