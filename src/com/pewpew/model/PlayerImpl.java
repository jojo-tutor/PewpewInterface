/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pewpew.model;

import com.pewpew.interfaces.Player;

/**
 *
 * @author cicctfac1
 */
public class PlayerImpl implements Player{

    private String name;
    private int life;
    private int mana;

    public PlayerImpl(String name) {
        this.name = name;
        this.life = 5;
        this.mana = 0;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}
