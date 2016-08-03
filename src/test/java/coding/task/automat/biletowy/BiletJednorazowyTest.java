/**
 * 
 */
package coding.task.automat.biletowy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author piotr
 *
 */
public class BiletJednorazowyTest extends TestCase
{
	private BiletJednorazowy bilet1, bilet2, bilet3, bilet4;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		bilet1 = new BiletJednorazowy("normalny", false, 300);
		bilet2 = new BiletJednorazowy("normalny", true, 195);
		bilet3 = new BiletJednorazowy("specjalny", false, 320);
		bilet4 = new BiletJednorazowy("specjalny", true, 208);
		
	}
	
	public void testUstalRodzajBiletu()
	{
		//assertEquals("normalny", bilet1.ustalRodzajBiletu());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		
	}
	
//	@Test
//	public void testPobierzCeneBiletu()
//	{
//		assertEquals(300, bilet1.pobierzCeneBiletu());
//		assertEquals(195, bilet2.pobierzCeneBiletu());
//		assertEquals(320, bilet3.pobierzCeneBiletu());
//		assertEquals(208, bilet4.pobierzCeneBiletu());
//	}
}