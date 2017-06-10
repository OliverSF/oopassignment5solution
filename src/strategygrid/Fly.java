package strategygrid;


public class Fly implements Behaviour {

	@Override
	public void execute(Pos xy) {
		System.out.println(" I will FLY to position " + xy);
	}
}

