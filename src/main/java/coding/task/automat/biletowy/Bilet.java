package coding.task.automat.biletowy;

/**
 * @author piotr
 *
 */
public class Bilet
{
	private boolean ulgowy;
	private int cenaBiletu;
	
	/**
	 * @param ulgowy
	 */
	public Bilet(boolean ulgowy, int cenaBiletu)
	{
		this.ulgowy = ulgowy;
		this.cenaBiletu = cenaBiletu;
	}
	
	/**
	 * 
	 */
	public int pobierzCeneBiletu()
	{	
		return cenaBiletu;
	}
	
	/**
	 * @param ulgowy
	 * @return
	 */
	public boolean sprawdzCzyUlgowy()
	{
		return ulgowy;
	}
	
	/**
	 * @param cenaBiletu
	 * @return
	 */
	public int przyznajUlge()
	{
		int nowaCenaBiletu = cenaBiletu - cenaBiletu * 35/100;
		
		return nowaCenaBiletu;
	}
}