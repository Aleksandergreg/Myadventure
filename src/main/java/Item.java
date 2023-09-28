public class Item {
    private String itemName;
    private String itemDescription;
public Item(String itemName, String itemDescription){
    this.itemDescription = itemDescription;
    this.itemName = itemName;
}
public String getItemName(){
    return itemName;
}
public String getItemDescription(){
    return itemDescription;
}

}
