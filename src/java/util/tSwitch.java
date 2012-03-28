/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author steve
 */
public class tSwitch {
    private int switchNum;
    private String description;
    private boolean switched;

    /**
     * @return the switchNum
     */
    public int getSwitchNum() {
        return switchNum;
    }

    /**
     * @param switchNum the switchNum to set
     */
    public void setSwitchNum(int switchNum) {
        this.switchNum = switchNum;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the switched
     */
    public boolean isSwitched() {
        return switched;
    }

    /**
     * @param switched the switched to set
     */
    public void setSwitched(boolean switched) {
        this.switched = switched;
    }
}
