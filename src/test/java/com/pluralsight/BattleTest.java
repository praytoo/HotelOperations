package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    private Battle battle;

    @BeforeEach
    void init(){
        battle = new Battle("Prince", 100, "Draco", 120);
    }
    @Test
    void getAttackerHp() {
        //arrange
        int expectedAttackerHp = 100;

        //act
        battle.getAttackerHp();

        //assert
        assertEquals(expectedAttackerHp,battle.getAttackerHp());
    }

    @Test
    void getDefenderHp() {
        //arrange
        int expectedDefenderHp = 120;

        //act
        battle.getDefenderHp();

        //assert
        assertEquals(expectedDefenderHp,battle.getDefenderHp());
    }

    @Test
    void performAttack() {
        //arrange
        int damage = 20;
        int expectedHp = 100;

        //act
        battle.performAttack(20);

        //assert
        assertEquals(expectedHp, battle.getDefenderHp());
    }

    @Test
    void performCounterAttack() {
        //arrange
        int damage = 20;
        int expectedHp = 90;

        //act
        battle.performCounterAttack(10);

        //assert
        assertEquals(expectedHp, battle.getAttackerHp());
    }

    @Test
    void performAttack_notBelowZero() {
        //arrange
        int damage = 130;
        int expectedHp = 0;

        //act
        battle.performAttack(130);

        //assert
        assertEquals(expectedHp, battle.getDefenderHp());
    }

    @Test
    void performCounterAttack_notBelowZero() {
        //arrange
        int damage = 110;
        int expectedHp = 0;

        //act
        battle.performCounterAttack(110);

        //assert
        assertEquals(expectedHp, battle.getAttackerHp());
    }

    @Test
    void isBattleOver() {
        //arrange
        int damageDefender = 130;
        boolean expectedBattleOver = true;

        //act
        battle.performAttack(130);
        battle.isBattleOver();

        //assert
        assertTrue(expectedBattleOver);
    }

    @Test
    void getWinner() {
        //arrange
        int currentAttackerHp = 40;
        int currentDefenderHp = 0;
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
        int currentAttackerHp = 60;
        int currentDefenderHp = 20;
        String winner = null;

        //act
        battle.performCounterAttack(80);
        battle.performAttack(40);
        battle.getWinner();

        //assert
        assertEquals(winner, battle.getWinner());
    }

}