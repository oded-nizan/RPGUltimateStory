package com.RPGUltiamteStory;

public class Attacks {

    private Attack[] basicAttacks;
    private Attack[] tier2Attacks;
    private Attack[] masterTierAttacks;

    public Attacks(Attack[] basicAttacks, Attack[] tier2Attacks, Attack[] masterTierAttacks)
    {
        this.basicAttacks = basicAttacks;
        this.tier2Attacks = tier2Attacks;
        this.masterTierAttacks = masterTierAttacks;
    }

    public Attack[] getBasicAttacks()
    {
        return this.basicAttacks;
    }

    public Attack[] getTier2Attacks()
    {
        return this.tier2Attacks;
    }

    public Attack[] getMasterTierAttacks()
    {
        return this.masterTierAttacks;
    }

    public void setBasicAttacks(Attack[] basicAttacks)
    {
        if (basicAttacks.length <= 3 && basicAttacks.length > 0)
        {
            this.basicAttacks = basicAttacks;
        }
    }

    public void setTier2Attacks(Attack[] tier2Attacks)
    {
        if (tier2Attacks.length <= 5)
        {
            this.tier2Attacks = tier2Attacks;
        }
    }

    public void setMasterTierAttacks(Attack[] masterTierAttacks) {
        if (masterTierAttacks.length <= 3) {
            this.masterTierAttacks = masterTierAttacks;
        }
    }

    public String toString()
    {
        String toString = "The 3 basic attacks of this character are : " + this.basicAttacks + "\n";
        toString = toString + "The 5 higher tier attacks of this character are : " + this.tier2Attacks + "\n";
        toString = toString + "The 3 master tier attacks of this character are : " + this.masterTierAttacks + "\n";
        return toString;
    }
}
