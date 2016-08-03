/**
 * 
 */
package coding.task.automat.biletowy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author piotr
 *
 */
public class BiletTest extends TestCase
{
	private Bilet bilet1, bilet2;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		bilet1 = new BiletJednorazowy("normalny", true, 195);
		bilet2 = new BiletJednorazowy("normalny", false, 300);
	}

	public void testSprawdzCzyUlgowy()
	{
		assertEquals(true, bilet1.sprawdzCzyUlgowy());
		assertEquals(false, bilet2.sprawdzCzyUlgowy());
	}
	
	public void testPrzyznajUlge()
	{
		assertEquals(195, bilet1.przyznajUlge());
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}
}
