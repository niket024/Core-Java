package c45.packet;


import java.util.Hashtable;
import jpcap.packet.*;

public class UDPAnalyzer extends JDPacketAnalyzer{

	DomainAnalyzer domainanalyzer = new DomainAnalyzer();
	private static final String[] valueNames={
		"duration",
		"protocol_type",
		"service",
		"flag",
		"src_bytes",
		"dst_bytes",
		"land",
		"urgent",
		"logged_in",
		"is_host_login",
		"is_guest_login",
                "count"};
	private UDPPacket udp;
        Hashtable values=new Hashtable();
       HTTPAnalyzer httpanalyzer =  new HTTPAnalyzer();
	XllAnalyzer xllAnalyzer = new XllAnalyzer();
        POP3Analyzer pop3Analyzer = new POP3Analyzer();
        POP3Analyzer pop2Analyzer = new POP3Analyzer();
	EchoAnalyzer echoanalyzer = new EchoAnalyzer();
	FTPAnalyzer  ftpanalyzer = new FTPAnalyzer();
        RJEAnalyzer rjeAnalyzer = new RJEAnalyzer();
	FTPdataAnalyzer ftpdataanalyzer = new FTPdataAnalyzer();
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        WhoisAnalyzer whoisAnalyzer =new WhoisAnalyzer();
        SSHAnalyzer sshAnalyzer =  new SSHAnalyzer();
        LDAPAnalyzer ldapAnalyzer =  new LDAPAnalyzer();
        String service="other";
        String attribute="";
	
	public UDPAnalyzer(){
		layer=TRANSPORT_LAYER;
	}
	public boolean isAnalyzable(Packet p){
		return (p instanceof UDPPacket);
	}	
	public String getProtocolName(){
		return "UDP";
	}	
	public String[] getValueNames(){
		return valueNames;
	}
        public void analyze(Packet p){
		values.clear();
		if(!isAnalyzable(p)) return;
		udp=(UDPPacket)p;
		//TCPPacket tcp=(TCPPacket)p;
              //  System.out.println("port"+udp.src_port);
               // System.out.println("port"+udp.dst_port);
		values.put(valueNames[0],new Long(udp.usec));
		values.put(valueNames[1],new String("udp"));
		values.put(valueNames[2],new String(findService(p)));
                values.put(valueNames[3],new String("SF"));
                values.put(valueNames[4],String.valueOf(udp.data.length));
		values.put(valueNames[5],new Integer(udp.dst_port));
		values.put(valueNames[6],new Integer(0));
		values.put(valueNames[7],new Integer(0));
		values.put(valueNames[8],new Integer(0));
		values.put(valueNames[9],new Integer(0));
		values.put(valueNames[10],new Integer(0));
                values.put(valueNames[11],new Long(udp.offset));
                service="other";
	}	
	public Object getValue(String valueName){
		for(int i=0;i<valueNames.length;i++)
			if(valueNames[i].equals(valueName))
				return getValueAt(i);		
		return null;
	}

        public String getAttribute(){
		return attribute;
	}
	
	public Object getValueAt(int index){
		switch(index){
			case 0: return new Integer(udp.src_port);
			case 1: return new Integer(udp.dst_port);
			case 2: return new Integer(udp.length);
			default: return null;
		}
	}
	
	public Object[] getValues(){
		Object[] v=new Object[3];
		for(int i=0;i<3;i++)
			v[i]=getValueAt(i);
		
		return v;
	}
        public Hashtable getValue(){
		return values;
	}

        public Object[] getValues1(){
            attribute="";
		Object[] v=new Object[valueNames.length];
		for(int i=0;i<valueNames.length;i++) {
                    v[i]=values.get(valueNames[i]);
                     attribute+=values.get(valueNames[i])+",";
               // System.out.println(valueNames+":"+values.get(valueNames[i]));
                }
		return v;
        }

	public String findService(Packet p){
		if(httpanalyzer.isAnalyzable(p)){
                   service=httpanalyzer.getProtocolName();
		}else if(echoanalyzer.isAnalyzable(p)){
                     service=echoanalyzer.getProtocolName();
		}else if(rjeAnalyzer.isAnalyzable(p)){
                     service=rjeAnalyzer.getProtocolName();
		}else if(pop3Analyzer.isAnalyzable(p)){
                     service=pop3Analyzer.getProtocolName();
		}else if(pop2Analyzer.isAnalyzable(p)){
                     service=pop2Analyzer.getProtocolName();
		}else if(nameAnalyzer.isAnalyzable(p)){
                     service=nameAnalyzer.getProtocolName();
		}else if(whoisAnalyzer.isAnalyzable(p)){
                     service=whoisAnalyzer.getProtocolName();
		}else if(xllAnalyzer.isAnalyzable(p)){
                     service=xllAnalyzer.getProtocolName();
		}else if(ldapAnalyzer.isAnalyzable(p)){
                     service=ldapAnalyzer.getProtocolName();
		}
                return service;
	}
}
