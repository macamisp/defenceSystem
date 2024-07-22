/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macami-3
 */
public class Run {
    
    

    public static void main(String[] args) {
        DefenceObserverable defenceObserverable=new DefenceObserverable();
        defenceObserverable.addDefenceObserver(new Helicopter());
        defenceObserverable.addDefenceObserver(new Tank());
        defenceObserverable.addDefenceObserver(new Submarine());
        
        new MainController(defenceObserverable).setVisible(true);
    }

    
    }
    

