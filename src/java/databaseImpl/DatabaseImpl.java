/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseImpl;

import database.ConflictingUserException;
import database.Database;
import database.UserNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import util.tSwitch;

/**
 *
 * @author steve
 */
public class DatabaseImpl implements Database {

    @Override
    public boolean authenticate(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void createUser(String username, String password) throws ConflictingUserException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void changePassword(String username, String passwordOld, String passwordNew) throws UserNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Integer> getTrains() {
        Set<Integer> trains = (Set<Integer>) new HashSet<Integer>();
        trains.add(3);
        trains.add(26);
        return trains;
    }

    @Override
    public Set<tSwitch> getSwitches() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void toggle(tSwitch s, boolean switched) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
