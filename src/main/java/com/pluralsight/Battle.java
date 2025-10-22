package com.pluralsight;

public class Battle {
    private String attacker;
    private int attackerHp;
    private String defender;
    private int defenderHp;
    private String winner;

    public Battle(String attacker, int attackerHp, String defender, int defenderHp) {
        this.attacker = attacker;
        this.attackerHp = attackerHp;
        this.defender = defender;
        this.defenderHp = defenderHp;
    }

    public void performAttack(int damage){
        this.defenderHp = defenderHp - damage;
        if (defenderHp < 0){
        defenderHp = 0;
    }
    }

    public void performCounterAttack(int damage){
        this.attackerHp = attackerHp - damage;
        if (attackerHp < 0){
            attackerHp = 0;
    }   }

    public int getAttackerHp(){
        int currentAttackerHp = attackerHp;
        return currentAttackerHp;
    }

    public int getDefenderHp(){
        int currentDefenderHp = defenderHp;
        return currentDefenderHp;
    }

    public boolean isBattleOver(){
        if (attackerHp <= 0 || defenderHp <= 0){
            return true;
        }
        return false;
    }

    public String getWinner(){
        if (attackerHp <= 0){
             this.winner = defender;
        }else if (defenderHp <= 0){
             this.winner = attacker;
        }else{
            return null;
        }
        return winner;
    }
}
