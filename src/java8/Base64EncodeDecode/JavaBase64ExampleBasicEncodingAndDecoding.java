package java8.Base64EncodeDecode;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class JavaBase64ExampleBasicEncodingAndDecoding {
	public static void main(String[] args) {
		// Getting encoder
//	 
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		// Encoding string

		String str = encoder.encodeToString("JavaTpoint".getBytes());
		System.out.println("Encoded string: " + str);

		// Decoding string
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded string: " + dStr);
	}
}
