package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    private Battle battle;

    @BeforeEach
    void init(){
        battle = new Battle("Prince", 100, "Drako", 120);
    }
    @Test
    void getAttackerHp() {
        //arrange
        int expectedAttackerHp = 100;

        //act
        int attackerHp = battle.getAttackerHp();

        //assert
        assertEquals(expectedAttackerHp,attackerHp);
    }

    @Test
    void getDefenderHp() {
        //arrange
        int expectedDefenderHp = 120;

        //act
        int defernderHp = battle.getDefenderHp();

        //assert
        assertEquals(expectedDefenderHp,defernderHp);
    }

    @Test
    void performAttack() {
        //arrange
        int damage = 20;
        int expectedHp = 100;

        //act
        battle.performAttack(damage);

        //assert
        assertEquals(expectedHp, battle.getDefenderHp());
    }

    @Test
    void performCounterAttack() {
        //arrange
        int damage = 10;
        int expectedHp = 90;

        //act
        battle.performCounterAttack(damage);

        //assert
        assertEquals(expectedHp, battle.getAttackerHp());
    }

    @Test
    void performAttack_notBelowZero() {
        //arrange
        int damage = 130;
        int expectedHp = 0;

        //act
        battle.performAttack(damage);

        //assert
        assertEquals(expectedHp, battle.getDefenderHp());
    }

    @Test
    void performCounterAttack_notBelowZero() {
        //arrange
        int damage = 110;
        int expectedHp = 0;

        //act
        battle.performCounterAttack(damage);

        //assert
        assertEquals(expectedHp, battle.getAttackerHp());
    }

    @Test
    void isBattleOver() {
        //arrange
        int damageDefender = 130;
        boolean expectedBattleOver = true;

        //act
        battle.performAttack(damageDefender);
        battle.isBattleOver();

        //assert
        assertTrue(expectedBattleOver);
    }

    @Test
    void getWinner() {
        //arrange
        String winner = "Prince";

        //act
        battle.performAttack(130);
        battle.performCounterAttack(60);
        battle.getWinner();

        //assert
        assertEquals(winner, battle.getWinner());
    }

    @Test
    void getWinner2() {
        //arrange
        String winner = null;

        //act
        battle.performCounterAttack(80);
        battle.performAttack(40);
        battle.getWinner();

        //assert
        assertEquals(winner, battle.getWinner());
    }

}