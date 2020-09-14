package decoratordesignpattern;

public class ArmorUpgrade extends Player {
	private Player player;
	/*
	 * makes this player = player
	 */
	public ArmorUpgrade(Player player)
	{
		this.player = player;
	}
	/*
	 * returns string
	 */
	public String toString()
	{
		return "\nUpgraded armor";
	}
	/*
	 * adds attack
	 */
	public double getPower()
	{
		return attack + 3;
	}

}
