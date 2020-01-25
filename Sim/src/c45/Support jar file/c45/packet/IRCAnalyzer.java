package c45.packet;


import jpcap.packet.*;

public class IRCAnalyzer extends JDPacketAnalyzer
{
	public IRCAnalyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){
		if(p instanceof TCPPacket || p instanceof UDPPacket &&
		   (((TCPPacket)p).src_port>=6665||((TCPPacket)p).dst_port<=6669) || 
			(((UDPPacket)p).src_port>=6665||((UDPPacket)p).dst_port<=6669))
			return true;
		else return false;
	}
	
	public String getProtocolName(){
		return "IRC";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}
	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
