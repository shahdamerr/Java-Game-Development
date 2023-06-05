package model.abilities;

import java.util.ArrayList;

import model.world.Damageable;

public class DamagingAbility extends Ability {

	private int damageAmount;

	public DamagingAbility(String name, int cost, int baseCoolDown, int castRadius, AreaOfEffect area, int required,
			int damageAmount) {
		super(name, cost, baseCoolDown, castRadius, area, required);
		this.damageAmount = damageAmount;
	}
	public String toString() {
		return ("Type: Damaging Ability" + "\r\n" + super.toString() + "Damaging Amount: " + this.getDamageAmount() +"\r\n" +"\r\n"); 
	}
	
	public String toString2() {
		return ("Type: Damaging Ability" + "; " + super.toString2() + "Damaging Amount: " + this.getDamageAmount() +"\r\n" +"\r\n"); 
	}

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}

	@Override
	public void execute(ArrayList<Damageable> targets) {
		for (Damageable d : targets)

			d.setCurrentHP(d.getCurrentHP() - damageAmount);

	}
}
