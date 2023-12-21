
package com.mycompany.viva3.Question1;


public class BlackMage {
    
    private int hp;
    private double evasion;
    private double critResistance;
    
    // constructor
    public BlackMage() {
        this.hp = 100;
        this.evasion = 0.05;
        this.critResistance = 0.1;
    }
    
    // accessor 
    public int getHP() {
        return this.hp;
    }
    
    public double getEvasion() {
        return this.evasion;
    }
    
    public double getCritResistance() {
        return this.critResistance;
    }
    
    // mutator
    public void setHP(int hp) {
        this.hp = hp;
    }
    
    public void setEvasion(double evasion) {
        
        if(evasion < 0) {
            this.evasion = 0;
        } else if (evasion > 1) {
            this.evasion = 1;
        } else {
            this.evasion = evasion;
        }
        
    }
    
    public void setCritResistance(double critResistance) {
        
        if(critResistance < 0) {
            this.critResistance = 0;
        } else if (critResistance > 1) {
            this.critResistance = 1;
        } else {
            this.critResistance = critResistance;
        }
    }
}
