package training.ideas.java.stringOpration;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class stringDeCompressionTest {

    @Test

    public void  compression_test(){
        String inputString = "A3B2C";
        Assert.assertEquals("AAABBC", stringDeCompression.decompression(inputString));
    }
}
