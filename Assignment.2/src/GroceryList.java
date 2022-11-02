public class GroceryList {
    GroceryItemOrder[] groceries;
    int itemCount;
    public GroceryList (){
        groceries = new GroceryItemOrder[10];
        itemCount =0;

    }
    public void add (GroceryItemOrder item){
        if (itemCount<=9)
        this.groceries[itemCount]= item;
            itemCount ++;
    }
    public double getTotalCost (){
        Double total= 0.0;
        for (int i=0;i < this.itemCount; i++ ){
            total += this.groceries[itemCount].getCost();
        }
        return total;

    }

}
