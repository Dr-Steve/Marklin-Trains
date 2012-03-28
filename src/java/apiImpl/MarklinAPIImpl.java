
package apiImpl;

import api.MarklinAPI;
import java.util.Set;

/**
 *
 * @author steve
 */
public class MarklinAPIImpl implements MarklinAPI{

    @Override
    public void emergencyStop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int setSpeed(Integer train, int speed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int increaseSpeed(Integer train) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int decreaseSpeed(Integer train) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void stopTrain(Integer train) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void toggleSwitch(Integer tSwitch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pause(Set<Integer> trains) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}
