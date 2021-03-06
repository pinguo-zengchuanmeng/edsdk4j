package edsdk.bindingsv34;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import edsdk.bindingsv34.EdSdkLibrary.EdsGetStreamLength;
import edsdk.bindingsv34.EdSdkLibrary.EdsReadStream;
import edsdk.bindingsv34.EdSdkLibrary.EdsSeekStream;
import edsdk.bindingsv34.EdSdkLibrary.EdsTellStream;
import edsdk.bindingsv34.EdSdkLibrary.EdsWriteStream;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : EDSDK/Header/EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsIStream extends Structure {
	/** C type : void* */
	public Pointer context;
	/** C type : EdsReadStream* */
	public EdsReadStream read;
	/** C type : EdsWriteStream* */
	public EdsWriteStream write;
	/** C type : EdsSeekStream* */
	public EdsSeekStream seek;
	/** C type : EdsTellStream* */
	public EdsTellStream tell;
	/** C type : EdsGetStreamLength* */
	public EdsGetStreamLength getLength;
	public EdsIStream() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("context", "read", "write", "seek", "tell", "getLength");
	}
	/**
	 * @param context C type : void*<br>
	 * @param read C type : EdsReadStream*<br>
	 * @param write C type : EdsWriteStream*<br>
	 * @param seek C type : EdsSeekStream*<br>
	 * @param tell C type : EdsTellStream*<br>
	 * @param getLength C type : EdsGetStreamLength*
	 */
	public EdsIStream(Pointer context, EdsReadStream read, EdsWriteStream write, EdsSeekStream seek, EdsTellStream tell, EdsGetStreamLength getLength) {
		super();
		this.context = context;
		this.read = read;
		this.write = write;
		this.seek = seek;
		this.tell = tell;
		this.getLength = getLength;
	}
	public EdsIStream(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsIStream implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsIStream implements Structure.ByValue {
		
	};
}
