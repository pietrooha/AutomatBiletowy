package coding.task.automat.biletowy;

/**
 * @author piotr
 *
 */
public class BiletCzasowy extends Bilet
{
	private double czasWaznosci;
	private boolean ulgowy;
	private int cenaBiletu;
	
	/**
	 * @param czasWaznosci
	 * @param ulgowy
	 */
	public BiletCzasowy(double czasWaznosci, boolean ulgowy, int cenaBiletu) {
		super(ulgowy, cenaBiletu);
		this.czasWaznosci = czasWaznosci;
	}
	
	/* (non-Javadoc)
	 * @see coding.task.automat.biletowy.Bilet#drukujBilet()
	 */
	public int zweryfikujCeneBiletu()
	{
		if(!((cenaBiletu == 300 || cenaBiletu == 450) || (cenaBiletu == 600 || cenaBiletu == 1100)))
		{
			return 0;
		}
		
		return cenaBiletu;
	}
}