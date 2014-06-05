/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

/**
 *
 * @author Blanco
 */
public class GameControls {
            
    public static void StartNewGame() {
        //Create New Game
        GameControl.game = new Game();
        
        //Save as current game
        DuchessOfDamascuss.setCurrentGame(game);
        
        //set (save) the player in the game object
        GameControl.game.setPlayer(DuchessOfDamascus.getPlayer());
         
        GameControl.createInventoryList(); //create the inventory list
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
    
    }
}
