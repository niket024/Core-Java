package c45.packet;


import jpcap.packet.*;

public class FTPdataAnalyzer extends JDPacketAnalyzer
{
	public FTPdataAnalyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){
		if(p instanceof TCPPacket &&
		   (((TCPPacket)p).src_port==20 || ((TCPPacket)p).dst_port==20))
			return true;
		else return false;
	}
	
	public String getProtocolName(){
		return "ftp_data";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}
	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
