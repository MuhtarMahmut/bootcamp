class Item{
   private String itemName;
   private  double itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if(itemPrice <= 0 ){
            throw new IllegalArgumentException("Item price can not b set to negative or zero");
        }
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Item item1 = new Item();
        //item1.itemName = "Book";
        //item1.itemPrice = -10;

        item1.setItemName("Book");
        item1.setItemPrice(10);

        System.out.println(item1);


    }

}
