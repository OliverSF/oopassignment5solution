package strategygrid;



/**
 * @author conorhayes
 * We can create new Strategy objects and attach them to the Avatar thus
 * changing how it reacts to the distance variable 
 */
public class Strategy1 implements Strategy {

	private Avatar avatar;

	public Strategy1 (Avatar avatar){
		this.avatar = avatar;
	}


	/*
	 * the decide method determines which behaviour to attach to an Avatar
	 * Different strategies will have different decide methods 
	 * 
	 */
	@Override
	public void setBehaviour(double distance) {
		if(distance < 3){
			avatar.setBehaviour(new Walk());
		} else
			if(distance >= 3 && distance <7){
				avatar.setBehaviour(new Run());
			}
			else{
				avatar.setBehaviour(new Fly());
			}
	}

}
