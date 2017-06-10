package strategygrid;


public class Run implements Behaviour {

	@Override
	public void execute(Pos xy) {
		System.out.println(" I will RUN to position " + xy);
	}
}

