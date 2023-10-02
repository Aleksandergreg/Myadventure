public class Food extends Item{
    private int healthPoints;
    //make an overloaded constructor with super(itemName, itemDescription) so it inherits the variables from the Item Class
public Food (String itemName, String itemDescription, int healthPoints){
    super(itemName, itemDescription);
    this.healthPoints = healthPoints;
}
public int getHealthPoints(){
    return healthPoints;
}
}
