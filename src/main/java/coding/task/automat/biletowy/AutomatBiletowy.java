package coding.task.automat.biletowy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author piotr
 *
 */
public class AutomatBiletowy {
	//monety prezentowane sa w postaci groszy, przy czym 100 to 1 pln, 200 to 2 pln i 500 to 5 pln
	private int zbiorObslugiwanychMonet[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
	private ArrayList<Integer> zawartoscAutomatu;
	private Bilet bilet;
	private int cenaBiletu;
	private Scanner scanner;
	private String ulga = "nie";
	private String cena = "3 ZŁ";
	/**
	 * 
	 */
	public void przygotujAutomat()
	{
		zawartoscAutomatu = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
		{
			zawartoscAutomatu.add(10);
			zawartoscAutomatu.add(20);
			zawartoscAutomatu.add(50);
			zawartoscAutomatu.add(100);
			zawartoscAutomatu.add(200);
			zawartoscAutomatu.add(500);
		}
	}
	
	/**
	 * 
	 */
	public void sprawdzZawartoscAutomatu()
	{
		System.out.println("Zawartość automatu: " + zawartoscAutomatu);
	}
	
	/**
	 * 
	 */
	public void sprawdzIleMonetMaAutomat()
	{
		System.out.println("Liczba monet w automacie: " + zawartoscAutomatu.size());
	}
	
	/**
	 * @param moneta
	 * @return
	 */
	public boolean sprawdzMonete(int moneta)
	{	
		boolean zawieraSie = false;
		
		for(int kolejnaMoneta : zbiorObslugiwanychMonet)
		{
			if(moneta == kolejnaMoneta)
			{
				zawieraSie = true;
			}
		}
			
		return zawieraSie;
	}
	
	/**
	 * @param moneta
	 */
	public void przyjmijMonete(int moneta)
	{
		if(sprawdzMonete(moneta) == true)
		{
			//zawartoscAutomatu.add(moneta);
		} else
		{
			System.out.println("Wrzucona moneta nie jest obsługiwana przez automat.");
		}	
	}
	
	/**
	 * 
	 */
	public void przyjmijZaplate(Scanner scanner, int cena)
	{
		System.out.println("Teraz zapłać należność.");
		
		int wartoscWrzuconychMonet = 0;
		cenaBiletu = cena;
		
		while(true)
		{	
			if(!(wartoscWrzuconychMonet >= cenaBiletu))
			{
				int wrzucanaMoneta = scanner.nextInt();
				if(sprawdzMonete(wrzucanaMoneta) == true)
				{
					//przyjmijMonete(wrzucanaMoneta);
					wartoscWrzuconychMonet = wartoscWrzuconychMonet + wrzucanaMoneta;
					System.out.println("Wrzucono: " + wartoscWrzuconychMonet + " gr");
							
					if(wartoscWrzuconychMonet == cenaBiletu)
					{
						System.out.println("Za chwilę nastąpi drukowanie biletu...");
					} else if(wartoscWrzuconychMonet > cenaBiletu)
					{
						System.out.println("Za chwilę nastąpi drukowanie biletu i wydanie reszty...");
						int reszta = wartoscWrzuconychMonet - cenaBiletu;
						wydajReszte(reszta);
					}
				} else
				{
					System.out.println("Wrzucona moneta nie jest obsługiwana przez automat.");
				}
			} else
			{
				break;
			}
		}
		scanner.close();		
	}
	
	public void wydajReszte(int reszta)
	{
		if(reszta == 10)
		{
			System.out.println("Wydawanie reszty: " + reszta);
		}
	}
	
	/**
	 * @param rodzajBiletu
	 * @param ulgowy
	 */
	public void wybierzBiletJednorazowy(String rodzajBiletu, boolean ulgowy)
	{	
		if(rodzajBiletu == "normalny" && ulgowy == false)
		{
			cenaBiletu = 300;
		} else if(rodzajBiletu == "normalny" && ulgowy == true)
		{
			cenaBiletu = 195;
			ulga = "tak";
			cena = "1 ZŁ 95 GR";
		} else if(rodzajBiletu == "specjalny" && ulgowy == false)
		{
			cenaBiletu = 320;
			cena = "3 ZŁ 20 GR";
		} else if(rodzajBiletu == "specjalny" && ulgowy == true)
		{
			cenaBiletu = 208;
			ulga = "tak";
			cena = "2 ZŁ 8 GR";
		} else
		{
			cenaBiletu = 0;
		}
		
		bilet = new BiletJednorazowy(rodzajBiletu, ulgowy, cenaBiletu);
		System.out.println("\nWYBRANO BILET:\nRodzaj biletu: " + rodzajBiletu + "\nUlgowy: " + ulga + "\nCena biletu: " + cena);
	}
	
	/**
	 * @param czasWaznosci
	 * @param ulgowy
	 */
	public void wybierzBiletCzasowy(double czasWaznosci, boolean ulgowy)
	{
		if(czasWaznosci == 0.5 && ulgowy == false)
		{
			cenaBiletu = 300;
		} else if(czasWaznosci == 0.5 && ulgowy == true)
		{
			cenaBiletu = 195;
			ulga = "tak";
			cena = "1 ZŁ 95 GR";
		} else if(czasWaznosci == 1  && ulgowy == false)
		{
			cenaBiletu = 450;
			cena = "4 ZŁ 50 GR";
		}  else if(czasWaznosci == 1  && ulgowy == true)
		{
			cenaBiletu = 292;
			ulga = "tak";
			cena = "2 ZŁ 92 GR";
		} else if(czasWaznosci == 1.5  && ulgowy == false)
		{
			cenaBiletu = 600;
			cena = "6 ZŁ";
		} else if(czasWaznosci == 1.5  && ulgowy == true)
		{
			cenaBiletu = 420;
			ulga = "tak";
			cena = "4 ZŁ 20 GR";
		} else if(czasWaznosci == 24  && ulgowy == false)
		{
			cenaBiletu = 1100;
			cena = "11 ZŁ";
		} else if(czasWaznosci == 24  && ulgowy == true)
		{
			cenaBiletu = 715;
			ulga = "tak";
			cena = "7 ZŁ 15 GR";
		} else
		{
			cenaBiletu = 0;
		}
		
		bilet = new BiletCzasowy(czasWaznosci, ulgowy, cenaBiletu);
		System.out.println("\nWYBRANO BILET:\nCzas ważności biletu: " + czasWaznosci + " h" + "\nUlga: " + ulga + "\nCena biletu: " + cena);
	}
	
	/**
	 * 
	 */
	public void wybierzBilet()
	{
		String typBiletu;
		String ulga;
		boolean ulgowy;
		double czasWaznosci = 0;
		
		scanner = new Scanner(System.in);
			System.out.println("Aby wybrać bilet jednorazowy proszę wpisać J, natomiast aby wybrać bilet czasowy proszę wpisać C.");
			typBiletu = scanner.next();
			
			if(typBiletu.equals("J"))
			{
				System.out.println("Wybrano bilet jednorazowy. Teraz jeśli ma to być bilet normalny wpisz N, a jeśli specjalny podaj S.");
				String rodzajBiletu = scanner.next();
				
				if(rodzajBiletu.equals("N"))
				{
					rodzajBiletu = "normalny";
					System.out.println("Jeśli bilet ma być ulgowy wpisz U. Jeśli nie podaj B.");
					ulga = scanner.next();
					ulgowy = false;
					
					if(ulga.equals("U"))
					{
						ulgowy = true;
					} else if(ulga.equals("B"))
					{
						ulgowy = false;
					}
					wybierzBiletJednorazowy(rodzajBiletu, ulgowy);
				} else if(rodzajBiletu.equals("S"))
				{
					rodzajBiletu = "specjalny";
					System.out.println("Jeśli bilet ma być ulgowy wpisz U. Jeśli nie podaj B.");
					ulga = scanner.next();
					ulgowy = false;
					
					if(ulga.equals("U"))
					{
						ulgowy = true;
					} else if(ulga.equals("B"))
					{
						ulgowy = false;
					}
			
					wybierzBiletJednorazowy(rodzajBiletu, ulgowy);
				}
			} else if(typBiletu.equals("C"))
			{
				System.out.println("Wybrano bilet czasowy. Aby wybrać 30 min wpisz 30, 60 min wpisz 60, 90 min wpisz 90 albo 24 h wpisz 24.");
				String czasTrwania = scanner.next();
				
				if(czasTrwania.equals("30"))
				{
					czasWaznosci = 0.5;
				} else if(czasTrwania.equals("60"))
				{
					czasWaznosci = 1;
				} else if(czasTrwania.equals("90"))
				{
					czasWaznosci = 1.5;
				} else if(czasTrwania.equals("24"))
				{
					czasWaznosci = 24;
				}
				
				System.out.println("Jeśli bilet ma być ulgowy wpisz U. Jeśli nie podaj B.");
				ulga = scanner.next();
				ulgowy = false;
				
				if(ulga.equals("U"))
				{
					ulgowy = true;
				} else if(ulga.equals("B"))
				{
					ulgowy = false;
				}
				wybierzBiletCzasowy(czasWaznosci, ulgowy);
			}
			int cena = bilet.pobierzCeneBiletu();
			przyjmijZaplate(scanner, cena);
			scanner.close();
	}
	
	/**
	 * 
	 */
	public void wyswietlDostepneBilety()
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Witamy w systemie sprzedaży biletów.");
		System.out.println("W naszej sprzedaży dostępne są bilety jednorazowe lub czasowe.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("BILETY JEDNORAZOWE\n");
		System.out.println("Normalny  - cena 3 zł");
		System.out.println("Specjalny - cena 3.2 zł");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("BILETY CZASOWE\n");
		System.out.println("30 min - cena 3 zł");
		System.out.println("60 min - cena 4.5 zł");
		System.out.println("90 min - cena 6 zł");
		System.out.println("24 h   - cena 11 zł");
		System.out.println("---------------------------------------------------------------------");
	}
}
