package Structural.Composit;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 객체
 */
public class Inventory implements ItemComponent {
    @Getter
    final List<ItemComponent> items = new ArrayList<>();
    String name;

    public Inventory(String name) {
        this.name = name;
    }

    // 리스트에 아이템 & 가방 추가
    public void add(ItemComponent item) {
        this.items.add(item);
    }

    @Override
    public int getPrice() {
        // ItemComponent.getPrice(); 재귀호출
        return items.stream()
                    .mapToInt(ItemComponent::getPrice)
                    .sum();
    }

    @Override
    public String getName() {
        return name;
    }
}
