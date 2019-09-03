import org.junit.*;
import static org.junit.Assert.*;

public class EncryptTest{
    @Test
    public void caesarCode_testEncryption_String(){
        Encrypt testEncryption = new Encrypt("hello",4);
        assertEquals("lipps",testEncryption.setEncrypted());
    }
}
