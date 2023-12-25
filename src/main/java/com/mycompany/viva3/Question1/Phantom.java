
package com.mycompany.viva3.Question1;

import java.util.Random;

public class Phantom {
    
    private double accuracy;
    private double critRate;
    
    // constructor
    public Phantom() {
        this.accuracy = 1;
        this.critRate = 1;
    }
    
    public Phantom(double accuracy, double critRate) {
        
        if(accuracy < 0) {
            this.accuracy = 0;
        } else if (accuracy > 1) {
            this.accuracy = 1;
        } else {
            this.accuracy = accuracy;
        }
        
        if(critRate < 0) {
            this.critRate = 0;
        } else if (critRate > 1) {
            this.critRate = 1;
        } else {
            this.critRate = critRate;
        }
    }
    
    // accessor
    public double getAccuracy() {
        return this.accuracy;
    }
    
    public double getCritRate() {
        return this.critRate;
    }
    
    // mutator
    public void setAccuracy(double accuracy) {
        
        if(accuracy < 0) {
            this.accuracy = 0;
        } else if (accuracy > 1) {
            this.accuracy = 1;
        } else {
            this.accuracy = accuracy;
        }
    }
    
    public void setCritRate(double critRate) {
        
        if(critRate < 0) {
            this.critRate = 0;
        } else if (critRate > 1) {
            this.critRate = 1;
        } else {
            this.critRate = critRate;
        }
    }
    
    // method use for calculate the damage
    public int damage(BlackMage blackMage) {
        
        // generate a number between 0 and 1
        Random rand = new Random();
        double i = rand.nextDouble();
        
        // calculate the effective value
        double eff_accuracy = this.accuracy * (1 - blackMage.getEvasion());
        double eff_critRate = this.critRate - blackMage.getCritResistance();
        
        // calculate the damage
        if(i < eff_accuracy) {
            if(i < eff_critRate) 
                return 4;
            else 
                return 2;
        } else {
            return 0;
        } 
    }

    
    // use toString method to display the combat log 
    public void toString(BlackMage blackMage) {
        
        int originalHP = blackMage.getHP();
        
        while(blackMage.getHP() > 0){
            int hit = damage(blackMage);
            int newHP = blackMage.getHP() - hit;
            if(newHP < 0) {
                newHP = 0;
            }
            blackMage.setHP(newHP);
            System.out.println("[NORM] Phanton has dealt " + hit + " damage to the Black Mage (" + newHP + "/" + originalHP + ")");
        }
    }
    
    
}
