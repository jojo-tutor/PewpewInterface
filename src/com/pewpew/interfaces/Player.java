/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pewpew.interfaces;

import com.pewpew.model.PlayerImpl;

/**
 *
 * @author cicctfac1
 */
public interface Player {
    public void attack(PlayerImpl opponent);
    public void recharge();
    public void heal();
}
