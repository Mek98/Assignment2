public class GroceryItemOrder {
    String name;
    Double pricePerUnit;
    int quantity;

    public GroceryItemOrder(String name, Double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity=quantity;
    }
    public Double getCost (){
        return quantity* pricePerUnit;
    }
    public void setQuantity (int quantity){
        this.quantity=quantity;

    }
}
