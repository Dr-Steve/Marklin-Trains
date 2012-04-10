/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import database.Database;
import databaseImpl.DatabaseImpl;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author steve
 */
public class MainAction extends ActionSupport {
    
    private List<String> availableTrains;
    private String selectedTrain;
    
    private Database database;
    
    @Override
    public String execute(){       
        
        //default the chosen train to the first
        setSelectedTrain(getAvailableTrains().get(0));
        
        System.out.println("tetsing!@$QP3iotrjWPGRjs");
        
        return SUCCESS;
    }

    public String go(){
        getAvailableTrains();
        return SUCCESS;
    }
    
    public String stop(){
        getAvailableTrains();
        return SUCCESS;
    }
    
    /**
     * @return the availableTrains
     */
    public List<String> getAvailableTrains() {
        database = new DatabaseImpl();
        //set up controllable trains
        availableTrains = new LinkedList<String>();        
        for (Integer train : database.getTrains()){
            availableTrains.add(train.toString());
        }
        return availableTrains;
    }

    /**
     * @param availableTrains the availableTrains to set
     */
    public void setAvailableTrains(List<String> availableTrains) {
        this.availableTrains = availableTrains;
    }

    /**
     * @return the selectedTrain
     */
    public String getSelectedTrain() {
        return selectedTrain;
    }

    /**
     * @param selectedTrain the selectedTrain to set
     */
    public void setSelectedTrain(String selectedTrain) {
        this.selectedTrain = selectedTrain;
    }
}
