package model.abilities;

import java.util.ArrayList;

import model.effects.Effect;
import model.world.Champion;
import model.world.Damageable;

public class CrowdControlAbility extends Ability {
	private Effect effect;

	public CrowdControlAbility(String name, int cost, int baseCoolDown, int castRadius, AreaOfEffect area, int required,
			Effect effect) {
		super(name, cost, baseCoolDown, castRadius, area, required);
		this.effect = effect;

	}

	public Effect getEffect() {
		return effect;
	}

	public String toString() {
		return ("Type: Crowd Control Ability" + "\r\n" + super.toString() + "Effect: " + this.getEffect().getName() +"\r\n" +"\r\n"); 
	}
	
	public String toString2() {
		return ("Type: Crowd Control Ability" + "; " + super.toString2() + "Effect: " + this.getEffect().getName() +"\r\n" +"\r\n");
	}
	
	@Override
	public void execute(ArrayList<Damageable> targets) throws CloneNotSupportedException {
		for(Damageable d: targets)
		{
			Champion c =(Champion) d;
			c.getAppliedEffects().add((Effect) effect.clone());
			effect.apply(c);
		}
		
	}

}
