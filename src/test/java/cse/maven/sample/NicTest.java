
package cse.maven.sample;
import junit.framework.TestCase;

/**
 *
 * @author Dell
 */
public class NicTest extends TestCase{

    @Override
    
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetYear()throws Exception {
        System.out.println("getYear");
        Nic instance = new Nic("90297456V");
        int expResult = 1990;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    public void testGetMonth()throws Exception {
        System.out.println("getMonth");
        Nic instance = new Nic("90297456V");
        int expResult = 10;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    public void testGetDate()throws Exception {
        System.out.println("getDate");
        Nic instance = new Nic("90297456V");;
        int expResult = 23;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    public void testGetGender()throws Exception {
        System.out.println("getGender");
        Nic instance = new Nic("90297456V");
        String expResult = "Male";
        boolean result = instance.isMale();
        assertEquals(expResult, result);
    }

    public void testIsVoter()throws Exception {
        System.out.println("isVoter");
        Nic instance = new Nic("90297456V");
        String expResult = "True";
        int result = instance.isVoter();
        assertEquals(expResult, result);
    }
}
