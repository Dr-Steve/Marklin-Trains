// Much of this code was borrowed from:
//  http://java.sun.com/developer/releases/javacomm/SimpleWrite.java
/**
 * Import necessary libraries
 */
import gnu.io.*; // RXTX.qbang.org
import java.io.*;
import java.util.*;

/**
 * SerialInterface is the gateway to the serial interface of the controller.
 * It performs necessary setup and maintains the connection for sending commands.
 */
public class SerialInterface {
	/**
	 * Instance variables
	 */
	static Enumeration<?>		portList;
	static CommPortIdentifier	portId;
	static SerialPort			serialPort;
	static OutputStream			outputStream;
	static boolean				outputBufferEmptyFlag = false;
	static boolean 				portFound;
	static String				defaultPort = "COM3";
	
	/**
	 * Constructor, simply call the "setupPort" method
	 */
	public SerialInterface(String comPort)
	{
		setupPort(comPort);
	}
	
	/**
	 * Perform the initial setup of the serial connection
	 */
	private void setupPort(String comPort)
	{
    	portFound = false;
    	if (comPort.length() > 0)
    	{
    		defaultPort = comPort;
    	}
    	
		portList = CommPortIdentifier.getPortIdentifiers();
		boolean portNotFound = true;
		while (portList.hasMoreElements() && portNotFound) {
		    portId = (CommPortIdentifier) portList.nextElement();
		    if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL)
		    {
		    	if (portId.getName().equals(defaultPort))
		    	{
		    		// Exit loop
		    		portNotFound = false;
		    		
		    		System.out.println("Found port " + defaultPort);
		    		portFound = true;
		    		try
		    		{
		    			serialPort = (SerialPort) portId.open("SerialInterface", 2000);
		    		}
		    		catch (PortInUseException e)
		    		{
		    			System.out.println("Port in use.");
                        System.out.println("Program is closing... done.");
                        System.exit(-1);
		    		} 
		    		
		    		try
		    		{
		    			outputStream = serialPort.getOutputStream();
		    		}
		    		catch (IOException e)
		    		{
		    			//TODO: do nothing?
		    		}
	
		    		try
		    		{
		    			// Set correct settings for Marklin interface
		    			serialPort.setSerialPortParams(
		    					2400, 
							    SerialPort.DATABITS_8, 
							    SerialPort.STOPBITS_2, 
							    SerialPort.PARITY_NONE
						);
		    		}
		    		catch (UnsupportedCommOperationException e)
		    		{
		    			//TODO: do nothing?
		    		}
		    		
		    		try
		    		{
		    			serialPort.notifyOnOutputEmpty(true);
		    		}
		    		catch (Exception e)
		    		{
		    			System.out.println("Error setting event notification");
		    			System.out.println(e.toString());
		    			System.exit(-1);
		    		}
		    	}
		    }
		}
	
		if (!portFound)
		{
		    System.out.println("Port " + defaultPort + " not found.");
		    System.out.println("Please connect Serial-USB adapter.");
		    System.out.println("Program is closing... done.");
		    System.exit(-1);
		}
	}
	
	/**
	 * Close the serial port
	 */
	public void closePort()
	{
		shortSleep(500);
	    serialPort.close();
	}
	
	/**
	 * Wait for a specified number of milliseconds
	 */
	public void shortSleep(int ms)
	{
		try
		{
	       Thread.sleep(ms);  // Be sure data is xferred before closing
	    }
		catch (Exception e)
		{
			//TODO: do nothing?
		}
	}
	
	/**
	 * Write the given char/int/byte to the serial interface
	 */
	public void writeToInterface(int i)
	{
		writeToInterface((byte)i);
	}
	public void writeToInterface(char c)
	{
		writeToInterface((byte)c);
	}
	public void writeToInterface(byte b)
	{
		try
	    {
	    	outputStream.write(b);
	    }
	    catch (IOException e)
	    {
	    	//TODO: do nothing?
	    }
	}
}