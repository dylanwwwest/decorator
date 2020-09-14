package decoratordesignpattern;
public class Skill extends Player {
private Player player;
/*
 * makes this player = player
 */
public Skill(Player player)
{
	this.player = player;
}
/*
 * returns string 
 */
public String toString()
{
	return "\nGained a skill";
}
/*
 * upgrades attack
 */
public double getPower()
{
	return attack + 3;
}
}
