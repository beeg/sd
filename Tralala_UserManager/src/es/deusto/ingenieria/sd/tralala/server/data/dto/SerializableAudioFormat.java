package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class SerializableAudioFormat implements Serializable {

	  /** ID to send over the network (serialized) */
	  private static final long serialVersionUID = 5390244411884999459L;

	  /** See {@link Encoding} */
	  private SerializableEncoding encoding = null;

	  /** The number of samples played or recorded per second, for sounds that have this format. */
	  private float sampleRate;

	  /** The number of bits in each sample of a sound that has this format. */
	  private int sampleSizeInBits;

	  /** The number of audio channels in this format (1 for mono, 2 for stereo). */
	  private int channels;

	  /** The number of bytes in each frame of a sound that has this format. */
	  private int frameSize;

	  /** The number of frames played or recorded per second, for sounds that have this format. */
	  private float frameRate;

	  /** Indicates whether the audio data is stored in big-endian or little-endian order. */
	  private boolean bigEndian;

	  /** The set of properties */
	  private Map<String, Object> properties = new HashMap<String, Object>();

	  /**
	   * Creates a new serializable audio format.
	   * 
	   * @param af
	   *          the audio format
	   */
	  public SerializableAudioFormat(AudioFormat af) {
	    this.encoding = new SerializableEncoding(af.getEncoding());
	    this.sampleRate = af.getSampleRate();
	    this.sampleSizeInBits = af.getSampleSizeInBits();
	    this.channels = af.getChannels();
	    this.frameSize = af.getFrameSize();
	    this.frameRate = af.getFrameRate();
	    this.bigEndian = af.isBigEndian();
	    this.properties.putAll(af.properties());
	  }

	  /**
	   * Converts back to the standard {@link AudioFormat}
	   */
	  public AudioFormat getAudioFormat() {
	    return new AudioFormat(encoding.getEncoding(), sampleRate, sampleSizeInBits, channels, frameSize, frameRate,
	            bigEndian, properties);
	  }

	  /**
	   * {@inheritDoc}
	   * 
	   * @see java.lang.Object#toString()
	   */
	  @Override
	  public String toString() {
	    StringWriter sw = new StringWriter();
	    sw.append("Encoding=" + encoding);
	    sw.append(" Samplerate=" + sampleRate + " Hz");
	    sw.append(" Samplesize=" + sampleSizeInBits + " bit");
	    sw.append(" Channels=" + (channels == 1 ? "mono" : "stereo"));
	    sw.append(" Framerate=" + frameRate);
	    sw.append(" Framesize=" + frameSize + " bytes/frame");
	    sw.append(" Endian=" + (bigEndian ? "big-endian" : "little-endian"));
	    return sw.toString();
	  }

	  /**
	   * This class is similiar to {@link AudioFormat.Encoding}.
	   * 
	   * @see Encoding
	   */
	  public static class SerializableEncoding implements Serializable {

	    /** ID to send over the network (serialized) */
	    private static final long serialVersionUID = 6710734978015728509L;

	    /** Specifies signed, linear PCM data. */
	    public static final SerializableEncoding PCM_SIGNED = new SerializableEncoding("PCM_SIGNED");

	    /** Specifies unsigned, linear PCM data. */
	    public static final SerializableEncoding PCM_UNSIGNED = new SerializableEncoding("PCM_UNSIGNED");

	    /** Specifies u-law encoded data. */
	    public static final SerializableEncoding ULAW = new SerializableEncoding("ULAW");

	    /** Specifies a-law encoded data. */
	    public static final SerializableEncoding ALAW = new SerializableEncoding("ALAW");

	    /** Encoding name. */
	    private String name;

	    /**
	     * Constructs a new encoding.
	     * 
	     * @param name
	     *          the name of the new type of encoding
	     */
	    public SerializableEncoding(String name) {
	      this.name = name;
	    }

	    /**
	     * @param encoding
	     *          The encoding
	     */
	    public SerializableEncoding(Encoding encoding) {
	      this.name = encoding.toString();
	    }

	    /**
	     * @return The encoding
	     */
	    public Encoding getEncoding() {
	      return new AudioFormat.Encoding(name);
	    }

	    /**
	     * @see java.lang.Object#toString()
	     */
	    public final String toString() {
	      return name;
	    }
	  }
}