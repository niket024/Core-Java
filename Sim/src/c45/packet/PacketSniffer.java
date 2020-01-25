package c45.packet;

import c45.database.*;
import c45.algorithm.binary.*;
import java.io.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpcap.*;
import jpcap.packet.*;


public class PacketSniffer {  //implements Runnable {  

    JpcapCaptor jpcap;
    FileWriter filewriter;
    NetworkInterface[] devices = JpcapCaptor.getDeviceList();
    TCPAnalyzer tcp = new TCPAnalyzer();
    UDPAnalyzer udp = new UDPAnalyzer();
    Calculation cal = new Calculation();
    Database db;

 
   // public static boolean ATTACK_DETECTED = false;
    public void startCapture() throws SQLException {
        try {
            try {
            db = new Database();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PacketSniffer.class.getName()).log(Level.SEVERE, null, ex);
            }
            jpcap = JpcapCaptor.openDevice(devices[1], 65535, true, 20);

         // PacketAnalyzer analyzer = new PacketAnalyzer();

            while (!Thread.currentThread().isInterrupted()) {

                Packet packet = jpcap.getPacket();

               if (packet == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        continue;
                    }
                } else {
                    System.out.println("Packets Details" + packet.toString() );

                    if (packet instanceof IPPacket) {
                        IPPacket ip = (IPPacket) packet;
                    }if (packet instanceof TCPPacket){
                        tcp.analyze(packet);                         
                        //System.out.println("asa----------------"+tcp.getValue("Source Port"));
                        //	System.out.println("asa----------------"+tcp.getValue("Sequence Number"));
                        //	System.out.println("asa----------------"+tcp.getValue("Window Size"));
                        tcp.getValues();
                    String result =  cal.ReadRule(tcp.getValue());
                   // System.out.println("result"+result);
                    if(result.equals("normal")){}
                    else{

      File f=new File("c:\\dataset1.arff");
      FileOutputStream fop=new FileOutputStream(f,true);
      if(f.exists()){
      
          fop.write((tcp.getAttribute()+result+"\n").getBytes());
        //  fop.write("\n".getBytes());
          fop.flush();
          fop.close();
          System.out.println("The data has been written");
          }

                       //  filewriter = new FileWriter("c:\\dataset1.txt",true);
                         System.out.println(tcp.getAttribute()+result);
                       //  filewriter.write(tcp.getAttribute()+result);
                        //  filewriter.write("\n");
                          db.executeUpdate1(result);
                    }
                    System.out.println("result"+result);
                    }if(packet instanceof UDPPacket){
                        udp.analyze(packet);
                        udp.getValues1();
                      String result =  cal.ReadRule(udp.getValue());

                    if(result.equals("normal")){}
                    else{
                          File f=new File("c:\\dataset1.arff");
                          FileOutputStream fop=new FileOutputStream(f,true);
                          if(f.exists()){
                              fop.write(
                                      (udp.getAttribute()+result+"\n").getBytes());
                             //  fop.write("\n".getBytes());
                             fop.flush();
                             fop.close();
                             System.out.println("The data has been written");
                          }else{
                               System.out.println("This file is not exist");
                          }
          
                        // filewriter = new FileWriter("c:\\dataset1.txt",true);
                          System.out.println(udp.getAttribute()+result);

                       //  filewriter.write(udp.getAttribute()+result);
                        //  filewriter.write("\n");

                         db.executeUpdate1(result);
                    }
                       System.out.println("result"+result);
                    }
	      }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public static void main(String arg[]) throws SQLException{
    PacketSniffer packetsniffer =  new PacketSniffer();
    packetsniffer.startCapture();
  }
}