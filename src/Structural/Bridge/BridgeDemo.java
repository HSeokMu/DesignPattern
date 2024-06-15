package Structural.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Character knight = new Knight(new OneHandSword());
        knight.move();
        knight.skillW();
        knight.skillE();

        Character berserker = new Berserker(new TwoHandSword());
        berserker.move();
        berserker.skillQ();
        berserker.skillR();
    }
}
