package org.example.creational.tp.factory;

public class Archer implements Character{

        public int vie;
        public String competence;
        public int attaque;

        public Archer() {
            vie=50;
            competence="Competence Archer";
            attaque=20;
        }

    @Override
    public String getName() {
        return "Archer";
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
