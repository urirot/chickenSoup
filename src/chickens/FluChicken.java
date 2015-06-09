package chickens;

import javax.swing.ImageIcon;

import shots.BlackShot;
import shots.BlueShot;
import shots.RedShot;
import shots.YellowShot;
import chickenSoup.ChickenMatrix;
import chickenSoup.Cord;

public class FluChicken extends Chicken {
	
	public FluChicken(Cord cord, ChickenMatrix chickens) {
		super(cord, chickens);
		this.kind = "flu";
		this.button.setIcon(new ImageIcon("green.png"));
	}

	@Override
	public void visit(RedShot shot) {
		System.out.println("Red shot green chicken");
		
	}

	@Override
	public void visit(BlueShot shot) {
		System.out.println("blue shot green chicken");
		
	}

	@Override
	public void visit(YellowShot shot) {
		System.out.println("yellow shot green chicken");
		
	}
	
	@Override
	public void visit(BlackShot shot) {
		System.out.println("black shot green chicken");
		
	}

}