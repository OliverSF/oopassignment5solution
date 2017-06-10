package strategygrid;



/**
 * @author conorhayes
 * We can create new Strategy objects and attach them to the Avatar thus
 * changing how it reacts to the distance variable 
 */
public class Strategy2 implements Strategy {

	private Avatar avatar;

	public Strategy2 (Avatar avatar){
		this.avatar = avatar;
		this.avatar.setStrategy(this);
	}


	/*
	 * the decide method determines which behaviour to attach to an Avatar
	 * Different strategies will have different decide methods 
	 * 
	 */
	@Override
	public void setBehaviour(double distance) {
		
		double random = Math.random() * distance;
		
		if(random < 2){
			avatar.setBehaviour(new Walk());
		} else
			if(random >= 2 && random <6){
				avatar.setBehaviour(new Run());
			}
			else{
				avatar.setBehaviour(new Fly());
			}

	}

}
