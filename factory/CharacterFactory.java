package org.example.creational.tp.factory;

public class CharacterFactory {

    public Character getCharacter(String characterName) {
        if (characterName == "Mage"){
            return new Mage();
        }
        else if (characterName == "guerrier"){
            return new Guerrier();
        }
        else if (characterName == "Archer"){
            return new Archer();
        }
        else{
            return null;
        }
    }
}

