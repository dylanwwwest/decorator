package decoratordesignpattern;
public class Mage extends Player {
	/*
	 * sets mage base stats
	 */
public String mage(String Name)
{
	intellect = 7;
	attack = 3;
	defense = 4;
	weapon = "Staf";
	armor = "Robe";
	return Name;
	
}
/*
 * returns the string
 */
public String toString()
{
	return "Mage:" + name + "Carries a weapon, and wears armor";
	
}
}
