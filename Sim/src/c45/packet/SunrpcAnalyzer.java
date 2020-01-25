package c45.packet;


import jpcap.packet.*;

public class SunrpcAnalyzer extends JDPacketAnalyzer
{
	public SunrpcAnalyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){
		if(p instanceof TCPPacket &&
                        (((TCPPacket)p).src_port==111 || ((TCPPacket)p).dst_port==111)){
                    return true;
                }else if(p instanceof UDPPacket && (((UDPPacket)p).src_port==111 ||
			((UDPPacket)p).dst_port==111)){
                    return true;
                    
                }else return false;
	}
	
	public String getProtocolName(){
		return "sunrpc";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}
	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
