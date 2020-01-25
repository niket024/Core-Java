package c45.packet;


import jpcap.packet.*;

public class PrivateAnalyzer extends JDPacketAnalyzer
{
	public PrivateAnalyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){

            if(p instanceof TCPPacket &&
		   (((TCPPacket)p).src_port>=49152||((TCPPacket)p).src_port<=65535) ||
			(((TCPPacket)p).dst_port>=49152||((TCPPacket)p).dst_port<=65535))
			return true;
		else return false;
		
	}
	
	public String getProtocolName(){
		return "private";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}
	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
