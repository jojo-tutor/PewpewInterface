/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pewpew.main;

import com.pewpew.model.PlayerImpl;
import java.util.Scanner;

/**
 *
 * @author cicctfac1
 */
public class MainClass {

    public static void main(String[] args) {
        String playerName, opponentName;
        int choice = 0;

        System.out.println(" ==== THE JAVATAR  ==== ");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Player name: ");
        playerName = scan.nextLine();
        System.out.println("Enter Opponent name: ");
        opponentName = scan.nextLine();

        PlayerImpl player = new PlayerImpl(playerName);
        PlayerImpl opponent = new PlayerImpl(opponentName);

        do{
            do{
                System.out.println("\n\n==============================");
                System.out.println("========  ACTION SET  ========");
                System.out.println("==============================");
                System.out.println("=== 1. Attack              ===");
                System.out.println("=== 2. Recharge            ===");
                System.out.println("=== 3. Heal                ===");
                System.out.println("==============================");
                System.out.print("Enter Choice : ");

                choice = scan.nextInt();
            }while(choice < 1 || choice > 3);

            // PLAYERS ACTION
            if(choice == 1){
                player.attack(opponent);
            }
            else if(choice == 2){
                player.recharge();
            }
            else if(choice == 3){
                player.heal();
            }

            choice = (int)((Math.random() * 100) % 3) + 1;
            // OPPONENT ACTION
            if(choice == 1){
                opponent.attack(player);
            }
            else if(choice == 2){
                opponent.recharge();
            }
            else if(choice == 3){
                opponent.heal();
            }

            System.out.println("\n"+player);
            System.out.println(opponent);

        }while(player.getLife() > 0 && opponent.getLife() > 0);


    }
    






}
