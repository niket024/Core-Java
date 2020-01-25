package c45.packet;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import java.sql.*;

import jpcap.*;
import jpcap.packet.Packet;

public class IDSMain {
	
	static JpcapWriter writer;


	public static void main(String[] args) {
		Runnable r = new Runnable() {
                    public void run() {
                        PacketSniffer sniffer = new PacketSniffer();
                        try {
                    sniffer.startCapture();
                } catch (SQLException ex) {
                    Logger.getLogger(IDSMain.class.getName()).log(Level.SEVERE, null, ex);
                }
			}
		};
		

		Thread th1 = new Thread(r);
		th1.start();

		long lastPlay = 0;	

		

		while (true) {
		    try {
		    	String th1State = "unknown";
		    	if(th1.isAlive()) {
		    		th1State = "alive";
		    	}
		    	else {
		    		th1State = "dead";
		    	}
        		Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



		  if ((System.currentTimeMillis() - lastPlay) > 60000)
            {

		   lastPlay = System.currentTimeMillis();
              
	        }
		}



		
		
				
	}


}
