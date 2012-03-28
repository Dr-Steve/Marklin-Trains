public class TrainControl {
  /*
      X - invalidate this command string
      S {CR} - emergency stop
      G {CR} - clear, go
      V {CR}- speed control is echoed to seriel buffer use echo mode 2
      L # S # [F #] {CR} - engine address, speed and function command loco 1...80 speed 1...14 function 0...1
      L # D {CR} - direction control
      M # R [time] {CR} - magnetic solenoid, time in 0.1 seconds
      M # G [time] {CR} - no time = 200 ms default time=0, solenoid is not turned off
      M {CR} - magnetic solenoid turned off
      D # {CR} - define number of s88 to be active
      A # {CR} - read one s88 in "10001111" format echo modes
      C # {CR} - read one contact of the s88 use echo modes
      R # {CR} - remove s88 memory from storage A, D = 1...4 Contact 1...64
      J # W # {CR} - job x to wait for 1 to 12.7 seconds
      J # W # P/N {CR} - wait for contact to be positive or negative p=pressed, n=released, use echo modes
      K # {CR} - kill job / job number 1...3 contact 1...64
      W # {CR} - send all s88 changes to seriel buffer. Watch must use echo modes
      Q {CR} - ASCII mode off, binary mode on
      E # {CR} - echo modes activated 0/1/2 / echo mode 0...2, this invokes ASCII modes
   */
  public static final char invalidate = 0x58;
  public static final char CR = 0x0D;

  public boolean invalidateCommand() { return false; }
  public boolean emergencyStop() { return false; }
  public boolean clearAndGo() { return false; }
  public boolean echoSpeedControl() { return false; }
  public boolean controlTrain() { return false; }
  public boolean changeDirection() { return false; }
  public boolean a() { return false; }
  public boolean b() { return false; }
  public boolean solenoidOff() { return false; }
  public boolean activateS88() { return false; }
  public boolean readS88Binary() { return false; }
  public boolean readS88Echo() { return false; }
  public boolean removeStoredS88() { return false; }
  public boolean suspendJob() { return false; }
  public boolean killJob() { return false; }
  public boolean sendAllS88() { return false; }
  public boolean asciiOff() { return false; }
  public boolean echoModes() { return false; }
}
