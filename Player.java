package decoratordesignpattern;
public abstract class Player {
protected String name;
protected int intellect;
protected int defense;
protected int attack;
protected String weapon;
protected String armor;
/*
 * Returns name 
 */
public String toString()
{
	return name;
}
/*
 * upgrades power
 */
public double getPower()
{
	return attack * 3 + defense + intellect / 2;
}

}
