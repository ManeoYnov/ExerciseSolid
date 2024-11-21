package org.example.creational.tp.factory;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Mage mage = (Mage) factory.getCharacter("Mage");
        System.out.println(mage.getName());
        System.out.println(mage.useSpecialSkill());
    }
}
