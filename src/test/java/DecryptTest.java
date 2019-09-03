import org.junit.*;
import static org.junit.Assert.*;

public class DecryptTest{
    @Test
    public void caesarCode_testDecryption_String(){
        Decrypt testDecryption = new Decrypt("lipps",4);
        assertEquals("hello",testDecryption.setDecrypted());
    }
}
