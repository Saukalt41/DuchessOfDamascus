/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.model;


/**
 *
 * @author Blanco
 */
public class YahtzeeRoom extends Rooms {
    private double points;
    private double playerScore;
    private double NpcScore;
    
    public YahtzeeRoom(double points) {
        this.points = points;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
    
}
