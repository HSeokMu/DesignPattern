package Structural.Composit;

import lombok.AllArgsConstructor;

/**
 * Leaf 객체
 */
@AllArgsConstructor
public class Item implements ItemComponent{
    String name;
    int price;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
