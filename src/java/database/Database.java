/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Set;
import util.tSwitch;

/**
 *
 * @author steve
 */
public interface Database {
    
    public boolean authenticate(String username, String password);
    
    public void createUser(String username, String password)
            throws ConflictingUserException;
    
    public void changePassword(String username,
            String passwordOld, String passwordNew)
            throws UserNotFoundException;
    
    //returns a set of all the active train numbers
    public Set<Integer> getTrains();
    
    //returns a set of all active switches
    public Set<tSwitch> getSwitches();
    
    //set state of a switch
    public void toggle(tSwitch s, boolean switched);
}
