public class Main {
    public static void main(String[] args) {
        GroceryList list1 = new GroceryList();
        GroceryItemOrder item = new GroceryItemOrder("Oreos", 2.5, 5);
        System.out.println(item.getCost());
        list1.add(item);
        GroceryItemOrder item2 = new GroceryItemOrder("Instant coffee", 24.9, 3);
        list1.add(item2);
        System.out.println(item2.getCost());
        System.out.println(list1.itemCount);
        System.out.println(list1.getTotalCost());
    }
}