package c45.packet;


import jpcap.packet.*;
import java.util.*;

public class TCPAnalyzer extends JDPacketAnalyzer
{
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
	Hashtable values=new Hashtable();
        String service="other";
        String attribute="";
	HTTPAnalyzer httpanalyzer =  new HTTPAnalyzer();
	SMTPAnalyzer smtpanalyzer = new SMTPAnalyzer();
        POP3Analyzer pop3Analyzer = new POP3Analyzer();
        POP3Analyzer pop2Analyzer = new POP3Analyzer();
	EchoAnalyzer echoanalyzer = new EchoAnalyzer();
	FTPAnalyzer  ftpanalyzer = new FTPAnalyzer();
        RJEAnalyzer rjeAnalyzer = new RJEAnalyzer();
	FTPdataAnalyzer ftpdataanalyzer = new FTPdataAnalyzer();
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        LoginAnalyzer loginAnalyzer =new LoginAnalyzer();
        SSHAnalyzer sshAnalyzer =  new SSHAnalyzer();
        TelnetAnalyzer telnetAnalyzer = new TelnetAnalyzer();
        FingerAnalyzer fingerAnalyzer =  new FingerAnalyzer();
        FTPdataAnalyzer ftpdataAnalyzer = new FTPdataAnalyzer();
        Imap4Analyzer imap4Analyzer =  new Imap4Analyzer();

	public TCPAnalyzer(){
		layer=TRANSPORT_LAYER;
	}	
	public boolean isAnalyzable(Packet p){
		return (p instanceof TCPPacket);
	}	
	public String getProtocolName(){
		return "TCP";
	}	
	public String[] getValueNames(){
		return valueNames;
	}	
	public void analyze(Packet p){
		values.clear();
		if(!isAnalyzable(p)) return ;
		TCPPacket tcp=(TCPPacket)p;
                System.out.println("port"+tcp.src_port);
                System.out.println("port"+tcp.dst_port);
		values.put(valueNames[0],new Long(tcp.hop_limit));
		values.put(valueNames[1],new String("tcp"));
		values.put(valueNames[2],new String(findService(p)));
		//values.put(valueNames[3],new Long(tcp.ack_num));
		if(tcp.psh){
                    values.put(valueNames[3],new String("SH"));
		}else if(tcp.syn){
                    values.put(valueNames[3],new String("SO"));
		}else if(tcp.rsv1){
                    values.put(valueNames[3],new String("RST0"));                    
		}else if(tcp.rsv2){
                    values.put(valueNames[3],new String("RSTR"));
		}else{
                    values.put(valueNames[3],new String("SF"));
		}
                values.put(valueNames[4],String.valueOf(tcp.data.length));
		values.put(valueNames[5],new Integer(tcp.dst_port));
		values.put(valueNames[6],new Integer(0));
		values.put(valueNames[7],new Short(tcp.urgent_pointer));
		values.put(valueNames[8],new Integer(0));
		values.put(valueNames[9],new Integer(0));
		values.put(valueNames[10],new Integer(0));
                values.put(valueNames[11],new Long(tcp.offset));
                service="other";
	}

	public String findService(Packet p){
		if(httpanalyzer.isAnalyzable(p)){
                   service=httpanalyzer.getProtocolName();  
		}else if (smtpanalyzer.isAnalyzable(p)){
                     service=smtpanalyzer.getProtocolName();
		}else if(echoanalyzer.isAnalyzable(p)){
                     service=echoanalyzer.getProtocolName();
		}else if(rjeAnalyzer.isAnalyzable(p)){
                     service=rjeAnalyzer.getProtocolName();
		}else if(ftpanalyzer.isAnalyzable(p)){
                     service=ftpanalyzer.getProtocolName();
		}else if(ftpdataanalyzer.isAnalyzable(p)){
                     service=ftpdataanalyzer.getProtocolName();
		}else if(pop3Analyzer.isAnalyzable(p)){
                     service=pop3Analyzer.getProtocolName();
		}else if(pop2Analyzer.isAnalyzable(p)){
                     service=pop2Analyzer.getProtocolName();
		}else if(nameAnalyzer.isAnalyzable(p)){
                     service=nameAnalyzer.getProtocolName();
		}else if(loginAnalyzer.isAnalyzable(p)){
                     service=loginAnalyzer.getProtocolName();
		}else if(sshAnalyzer.isAnalyzable(p)){
                     service=sshAnalyzer.getProtocolName();
		}else if(fingerAnalyzer.isAnalyzable(p)){
                     service=fingerAnalyzer.getProtocolName();
		}else if(fingerAnalyzer.isAnalyzable(p)){
                     service=fingerAnalyzer.getProtocolName();
		}else if(ftpdataAnalyzer.isAnalyzable(p)){
                     service=ftpdataAnalyzer.getProtocolName();
		}else if(telnetAnalyzer.isAnalyzable(p)){
                     service=telnetAnalyzer.getProtocolName();
		}else if(imap4Analyzer.isAnalyzable(p)){
                     service=imap4Analyzer.getProtocolName();
		}
                return service;
	}

	public Object getValue(String valueName){
		return values.get(valueName);
	}
        public Hashtable getValue(){
		return values;
	}

        public String getAttribute(){
		return attribute;
	}
	
	Object getValueAt(int index){
		if(index<0 || index>=valueNames.length) return null;
		return values.get(valueNames[index]);
	}	
	public Object[] getValues(){
            attribute="";

		Object[] v=new Object[valueNames.length];
		
		for(int i=0;i<valueNames.length;i++){
			v[i]=values.get(valueNames[i]);
                        attribute+=values.get(valueNames[i])+",";
          //      System.out.println(valueNames+":"+values.get(valueNames[i]));
                }		
		return v;
        }
}
