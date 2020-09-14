package decoratordesignpattern;

public class WeaponUpgrade extends Player{
private Player player;
/*
 * makes this player = player;
 */
public WeaponUpgrade(Player Player)
{
	this.player = player;
}
/*
 * returns string
 */
public String toString()
{
	return "\nUpgraded weapon";
}
/*
 * adds to attack
 */
public double getPower()
{
	return attack + 5;
}
}
