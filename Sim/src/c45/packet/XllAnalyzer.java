package c45.packet;


import jpcap.packet.*;

public class XllAnalyzer extends JDPacketAnalyzer
{
	public XllAnalyzer(){
		layer=APPLICATION_LAYER;
	}
	
	public boolean isAnalyzable(Packet p){
		if(p instanceof TCPPacket && (((TCPPacket)p).src_port>=6000||((TCPPacket)p).src_port<=6063) ){
                    return true;
                }else if(p instanceof UDPPacket && (((UDPPacket)p).src_port>=6000 ||
			((UDPPacket)p).src_port<=6063)){
                return true;
                }
                else return false;
	}
	
	public String getProtocolName(){
		return "XLL";
	}
	
	public String[] getValueNames(){return null;}
	
	public void analyze(Packet p){}


	
	public Object getValue(String s){ return null; }
	public Object getValueAt(int i){ return null; }
	public Object[] getValues(){ return null; }
}
