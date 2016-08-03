package coding.task.automat.biletowy;

/**
 * @author piotr
 *
 */
public class BiletJednorazowy extends Bilet
{
	private String rodzaj;
	private int cenaBiletu;
	
	/**
	 * @param rodzaj
	 * @param ulgowy
	 */
	public BiletJednorazowy(String rodzaj, boolean ulgowy, int cenaBiletu)
	{
		super(ulgowy, cenaBiletu);
		this.rodzaj = rodzaj;
	}
	
	/**
	 * 
	 * @param rodzaj
	 * @return
	 */
	public String ustalRodzajBiletu(BiletJednorazowy bilet)
	{
		if(!(rodzaj == "normalny" || rodzaj == "specjalny"))
		{
			return "Niepoprawny rodzaj";
		}
		
		return rodzaj;
	}
	
	/**
	 * 
	 * @return
	 */
	public String pobierzRodzajBiletu()
	{
		return rodzaj;
	}
	
	public int zweryfikujCeneBiletu()
	{
		if(!((cenaBiletu == 300 || cenaBiletu == 320) || (cenaBiletu == 195 || cenaBiletu == 208)))
		{
			return 0;
		}
		
		return cenaBiletu;
	}
}