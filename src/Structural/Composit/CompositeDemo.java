package Structural.Composit;

public class CompositeDemo {
    public static void main(String[] args) {
        Inventory mainInventory = new Inventory("메인 인벤토리");

        Item onehandSword = new Item("한손검", 5000);
        Item armor = new Item("갑옷", 7000);

        mainInventory.add(onehandSword);
        mainInventory.add(armor);

        Inventory foodInventory = new Inventory("음식 인벤토리");

        Item egg = new Item("달걀", 100);
        Item meat = new Item("고기", 200);

        foodInventory.add(egg);
        foodInventory.add(meat);

        mainInventory.add(foodInventory);

        System.out.println(mainInventory.getPrice());
    }
}
