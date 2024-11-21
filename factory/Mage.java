package org.example.creational.tp.factory;

public class Mage implements Character{
    public int vie;
    public String competence;
    public int attaque;

    public Mage() {
        vie=50;
        competence="Competence Mage";
        attaque=20;
    }

    @Override
    public String getName() {
        return "Mage";
    }

    @Override
    public int getHealth() {
        return vie;
    }

    @Override
    public int getAttack() {
        return attaque;
    }

    @Override
    public String useSpecialSkill() {
        return competence;
    }
}
