package com.RPGUltiamteStory;

public class Attack {

    private String name;
    private double damager;
    private int armorPenetration;

    public Attack(String name, double damager, int armorPenetration)
    {
        this.name = name;
        this.damager = damager;
        this.armorPenetration = armorPenetration;
    }

    public String getName()
    {
        return this.name;
    }

    public double getDamager()
    {
        return this.damager;
    }

    public int getArmorPenetration()
    {
        return this.armorPenetration;
    }

    public void setName(String name)
    {
        if (name.length() >= 4 && name.length() <= 15){
            this.name = name;
        }
    }

    public void setDamager(double damager)
    {
        if (damager >= 0.1 && damager <= 15){
            this.damager = damager;
        }
    }

    public void setArmorPenetration(int armorPenetration)
    {
        if (armorPenetration >= 0 && armorPenetration <= 20){
            this.armorPenetration = armorPenetration;
        }
    }

    public String toString()
    {
        String toString = "The attack's name is : " + this.name + "\n";
        toString = toString + "The attack's damager stats is : " + this.damager + "\n";
        toString = toString + "The attack's armor penetration stat is : " + this.armorPenetration + "\n";
        return toString;
    }
}
