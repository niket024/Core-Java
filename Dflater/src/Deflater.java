import java.util.*;
import java.util.zip.Inflater;
public class Deflater
{
public static void main(String[] args)
{
	try {
	     // Encode a String into bytes
	     String inputString = "blahblahblah??";
	     byte[] input = inputString.getBytes("UTF-8");

	     // Compress the bytes
	     byte[] output = new byte[100];
	     Deflater df=new Deflater();
	     
//	     df.setInput(input);
//	     df.finish();
//	     int compressedDataLength = df.deflate(output);

	     // Decompress the bytes
	     Inflater decompresser = new Inflater();
	     decompresser.setInput(output, 0, compressedDataLength);
	     byte[] result = new byte[100];
	     int resultLength = decompresser.inflate(result);
	     decompresser.end();

	     // Decode the bytes into a String
	     String outputString = new String(result, 0, resultLength, "UTF-8");
	 } catch(java.io.UnsupportedEncodingException ex) {
	     // handle
	 } catch (java.util.zip.DataFormatException ex) {
	     // handle
	 }
}
}
