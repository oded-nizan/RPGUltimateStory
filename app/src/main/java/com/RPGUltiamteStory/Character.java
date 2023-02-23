package com.RPGUltiamteStory;

import java.util.Random;

public class Character {

    private String characterName;
    private double characterHealth;
    private double characterArmor;
    private double characterDamage;
    private int characterAccuracy;

    private Attacks characterAttacks;

    public Character(String characterName, double characterHealth, double characterArmor, double characterDamage, int characterAccuracy, Attacks characterAttacks)
    {
        this.characterName = characterName;
        this.characterHealth = characterHealth;
        this.characterArmor = characterArmor;
        this.characterDamage = characterDamage;
        this.characterAccuracy = characterAccuracy;
        this.characterAttacks = characterAttacks;
    }

    public String getCharacterName()
    {
        return this.characterName;
    }

    public double getCharacterHealth()
    {
        return this.characterHealth;
    }

    public double getCharacterArmor()
    {
        return this.characterArmor;
    }

    public double getCharacterDamage()
    {
        return this.characterDamage;
    }

    public int getCharacterAccuracy()
    {
        return this.characterAccuracy;
    }

    public Attacks getCharacterAttacks()
    {
        return this.characterAttacks;
    }

    public void setCharacterName(String characterName)
    {
        if (characterName.length() >= 2 && characterName.length() <= 12)
        {
            this.characterName = characterName;
        }
    }

    public void setCharacterHealth(double characterHealth)
    {
        if (characterHealth >= 0 && characterHealth <= 1500)
        {
            this.characterHealth = characterHealth;
        }
    }

    public void setCharacterArmor(double characterArmor)
    {
        if (characterArmor >= 0 && characterArmor <= 20)
        {
            this.characterArmor = characterArmor;
        }
    }

    public void setCharacterDamage(double characterDamage)
    {
        if (characterDamage >= 0 && characterDamage <= 50)
        {
            this.characterDamage = characterDamage;
        }
    }

    public void setCharacterAccuracy(int characterAccuracy)
    {
        if (characterAccuracy >= 1 && characterAccuracy <= 100)
        {
            this.characterAccuracy = characterAccuracy;
        }
    }

    public void setCharacterAttacks(Attacks characterAttacks)
    {
        this.characterAttacks = characterAttacks;
    }

    public boolean isHit()
    {
        Random randomNum = new Random();
        int x = randomNum.nextInt(100);
        if (x <= this.characterAccuracy)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String toString = "The character's name is : " + this.characterName + "\n";
        toString = toString + "The character's health is : " + this.characterHealth + "\n";
        toString = toString + "The character's armor is : " + this.characterArmor + "\n";
        toString = toString + "The character's damage is : " + this.characterDamage + "\n";
        toString = toString + "The character's accuracy is : " + this.characterAccuracy + "\n";
        toString = toString + "The character's attacks are : " + this.characterAttacks + "\n";
        return toString;
    }
}
