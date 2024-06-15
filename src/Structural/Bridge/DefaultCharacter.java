package Structural.Bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultCharacter implements Character{
    private String name;
    private Item item;

    @Override
    public void move() {
        System.out.println(name + " / " + item.getName());
    }

    @Override
    public void skillQ() {
        System.out.println(name + " / skill Q");
    }

    @Override
    public void skillW() {
        System.out.println(name + " / skill W");
    }

    @Override
    public void skillE() {
        System.out.println(name + " / skill E");
    }

    @Override
    public void skillR() {
        System.out.println(name + " / skill R");
    }
}
