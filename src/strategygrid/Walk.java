package strategygrid;


public class Walk implements Behaviour {

	@Override
	public void execute(Pos xy) {
		System.out.println(" I will WALK to position " + xy);
	}
}

