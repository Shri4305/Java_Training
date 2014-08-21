package training.ideas.java.stringOpration;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/13/2014.
 */
public class StringCompressionTest {

    @Test

    public void  compression_test(){
        String inputString = "AAABBC";
        Assert.assertEquals("A3B2C", StringCompression.compression(inputString));
    }

    @Test
    public void  given_string_single_single_only_compression_test(){
        String inputString = "SDFG";
        Assert.assertEquals("SDFG", StringCompression.compression(inputString));
    }

    @Test
    public void  given_string_only_lastCharaHaveCount_compression_test(){
        String inputString = "SDFGGGGGGGGGGGGGGGGGG";
        Assert.assertEquals("SDFG18", StringCompression.compression(inputString));
    }
    @Test
    public void  given_string_only_FirstCharaHaveCount_compression_test(){
        String inputString = "SSSSSSSSFGH";
        Assert.assertEquals("S8FGH", StringCompression.compression(inputString));
    }

}
