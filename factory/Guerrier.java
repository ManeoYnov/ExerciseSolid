package org.example.creational.tp.factory;

public class Guerrier implements Character {
    public int vie;
    public String competence;
    public int attaque;

    public Guerrier() {
        this.vie = 100;
        this.competence = "competence guerrier";
        this.attaque = 10;
    }

    @Override
    public String getName() {
        return "Guerrier";
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
