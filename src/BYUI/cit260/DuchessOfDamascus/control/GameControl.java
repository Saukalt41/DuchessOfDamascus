/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

import BYUI.cit260.DuchessOfDamascus.model.Game;
import BYUI.cit260.DuchessOfDamascus.model.Player;
import DuchessOfDamascus.DuchessOfDamascus;

/**
 *
 * @author Blanco
 */
public class GameControl {
    private static InventoryItem[] Inventory;
            
    public static void StartNewGame() {
        //Create New Game
        GameControl.game = new Game();
        
        //Save as current game
        DuchessOfDamascuss.setCurrentGame(game);
        
        //set (save) the player in the game object
        GameControl.game.setPlayer(DuchessOfDamascus.getPlayer());
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        GameControl.game.createInventoryList(inventoryList); //create the inventory list
        GameControl.createMap(); //create the map
        GameControl.createLocations(); //create locations inside the map
        GameControl.createCluesList(); //create list of clues
        
        //move to the starting position
        MapControl.movePlayerToStartingLocation(StartingRoom);
        
    private static void SaveGame(){
        System.out.println("\n**** Calling SaveGame stub function ****");
    }  
    
    private static void createInventoryList(){
        //Created array(list) of inventory Items
        InventoryItem ore = new InventoryItem();
        ore.setDescription("Part of the Solis Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmmount(0);
        Inventory[Constants.ORE] = ore;
        
        GameControl.game.setInventory(Inventory);
    }
    
    private static void createMap(){
        System.out.println("\n**** Calling createMap stub function ****");   
                }

    public static void createNewGame(Player player) {
     System.out.println("\n**** Calling createNewGame stub function ****");
    }

        private static Game game;


        private static void createLocations() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void createCluesList() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public GameControl() {
        }

    private static class InventoryItem {

        public InventoryItem() {
        }
    }
    }

