/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.Set;

/**
 *
 * @author steve
 */
public interface MarklinAPI {
    
    public void emergencyStop();
    
    public int setSpeed(Integer train, int speed);
    
    public int increaseSpeed(Integer train);
    
    public int decreaseSpeed(Integer train);
    
    public void stopTrain(Integer train);
    
    //remember to update the database!
    public void toggleSwitch(Integer tSwitch);
    
    //pause the given set, but remember it so we can continue
    //them with resume
    public void pause(Set<Integer> trains);
    
    public void resume();
}
