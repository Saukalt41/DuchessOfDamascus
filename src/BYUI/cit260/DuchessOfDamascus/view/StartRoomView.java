/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;
import BYUI.cit260.DuchessOfDamascus.model.Player;
import DuchessOfDamascus.DuchessOfDamascus;
/**
 *
 * @author Stephen
 */
public class StartRoomView extends View {

    public StartRoomView() {
        super("\n"
                + "\n************************************************"
                + "\n| Welcome " + DuchessOfDamascus.getPlayer().getName() + "."
                + "\n| You have entered the first room of the temple "
                + "\n| of the sun. Here you have three paths to "
                + "\n| choose from. In order to escape you must "
                + "\n| venture down each path."
                + "\n|_______________________________________________"
                + "\n|"
                + "\n|"
                + "\n| Choose one of these options:"
                + "\n|"
                + "\n| M - Go to the game menu"
                + "\n| G - Go down the first path"
                + "\n| V - Go down the second path"
                + "\n| R - Go down the third path");
    }

    @Override
    public void doAction(String choice) {
         switch (choice.trim().toUpperCase().charAt(0)) {
            case 'M':
                this.goToMenu();
                break;
            case 'G':
                this.goToFirstPath();
                break;
            case 'S':
                this.goToSecondPath();
                break;
            case 'L':
                this.goToThirdPath();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    
}

    private void goToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void goToFirstPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToSecondPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToThirdPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
