package c45.packet;


import jpcap.packet.*;

public class POP2Analyzer extends JDPacketAnalyzer
{
	public POP2Analyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){
		if(p instanceof TCPPacket &&
                        (((TCPPacket)p).src_port==109 || ((TCPPacket)p).dst_port==109)){
                    return true;
                }else if(p instanceof UDPPacket && (((UDPPacket)p).src_port==109 ||
			((UDPPacket)p).dst_port==109)){
                    return true;

                }else return false;
	}
	
	public String getProtocolName(){
		return "POP2";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}
	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
