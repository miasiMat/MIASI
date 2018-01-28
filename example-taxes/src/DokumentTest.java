import static org.junit.Assert.*;

import org.junit.Test;

import com.bartoszwalter.students.taxes.Dokument.DokumentAbstrakcyjny;
import com.bartoszwalter.students.taxes.Dokument.DokumentFabryka;
import com.bartoszwalter.students.taxes.Dokument.DokumentOPrace;
import com.bartoszwalter.students.taxes.Dokument.DokumentZlecenie;
import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;
import com.bartoszwalter.students.taxes.Umowa.UmowaOPrace;
import com.bartoszwalter.students.taxes.Umowa.UmowaZlecenie;

public class DokumentTest {
	
	@Test
	public void test0() {
		UmowaAbstrakcyjna umowa = new UmowaOPrace(2000);
		DokumentAbstrakcyjny dokument = DokumentFabryka.getDokument(umowa);
		
		String result = "UMOWA O PRACĘ\r\nPodstawa wymiaru składek 2000.0\r\nSkładka na ubezpieczenie emerytalne 195,20\r\nSkładka na ubezpieczenie rentowe    30,00\r\nSkładka na ubezpieczenie chorobowe  49,00\r\nPodstawa wymiaru składki na ubezpieczenie zdrowotne: 1725.8\r\nSkładka na ubezpieczenie zdrowotne: 9% = 155,32 7,75% = 133,75\r\nKoszty uzyskania przychodu w stałej wysokości 111.25\r\nPodstawa opodatkowania 1614.55 zaokrąglona 1615\r\nZaliczka na podatek dochodowy 18 % = 290.7\r\nKwota wolna od podatku = 46.33\r\nPodatek potrącony = 244,37\r\nZaliczka do urzędu skarbowego = 110,62 po zaokrągleniu = 111\r\n\r\nPracownik otrzyma wynagrodzenie netto w wysokości = 1459,48\r\n";
		
		assertEquals(result,dokument.getText());
	}
	
	@Test
	public void test1() {
		UmowaAbstrakcyjna umowa = new UmowaZlecenie(2000);
		DokumentAbstrakcyjny dokument = DokumentFabryka.getDokument(umowa);
		
		String result = "UMOWA-ZLECENIE\r\nPodstawa wymiaru składek 2000.0\r\nSkładka na ubezpieczenie emerytalne 195,20\r\nSkładka na ubezpieczenie rentowe    30,00\r\nSkładka na ubezpieczenie chorobowe  49,00\r\nPodstawa wymiaru składki na ubezpieczenie zdrowotne: 1725.8\r\nSkładka na ubezpieczenie zdrowotne: 9% = 155,32 7,75% = 133,75\r\nKoszty uzyskania przychodu (stałe) 345.16\r\nPodstawa opodatkowania 1380.6399999999999 zaokrąglona 1381\r\nZaliczka na podatek dochodowy 18 % = 248.58\r\nPodatek potrącony = 248,58\r\nZaliczka do urzędu skarbowego = 114,83 po zaokrągleniu = 115\r\n\r\nPracownik otrzyma wynagrodzenie netto w wysokości = 1455,48\r\n";
		
		assertEquals(result,dokument.getText());
	}
	
	@Test
	public void test2() {
		UmowaAbstrakcyjna umowa = new UmowaOPrace(2000);
		DokumentAbstrakcyjny dokument = DokumentFabryka.getDokument(umowa);
		
		String result = "UMOWA O PRACĘ\r\nPodstawa wymiaru składek 2000.0\r\nSkładka na ubezpieczenie emerytalne 195,20\r\nSkładka na ubezpieczenie rentowe    30,00\r\nSkładka na ubezpieczenie chorobowe  49,00\r\nPodstawa wymiaru składki na ubezpieczenie zdrowotne: 1725.8\r\nSkładka na ubezpieczenie zdrowotne: 9% = 155,32 7,75% = 133,75\r\nKoszty uzyskania przychodu w stałej wysokości 111.25\r\nPodstawa opodatkowania 1614.55 zaokrąglona 1615\r\nZaliczka na podatek dochodowy 18 % = 290.7\r\nKwota wolna od podatku = 46.33\r\nPodatek potrącony = 244,37\r\nZaliczka do urzędu skarbowego = 110,62 po zaokrągleniu = 111\r\n\r\nPracownik otrzyma wynagrodzenie netto w wysokości = 1459,48\r\n";
		
		assertEquals(result,dokument.getText());
	}
	
	@Test
	public void test3() {
		UmowaAbstrakcyjna umowa = new UmowaZlecenie(2500);
		DokumentZlecenie dokument = new DokumentZlecenie(umowa);
		
		String result = "UMOWA-ZLECENIE\r\nPodstawa wymiaru składek 2500.0\r\nSkładka na ubezpieczenie emerytalne 244,00\r\nSkładka na ubezpieczenie rentowe    37,50\r\nSkładka na ubezpieczenie chorobowe  61,25\r\nPodstawa wymiaru składki na ubezpieczenie zdrowotne: 2157.25\r\nSkładka na ubezpieczenie zdrowotne: 9% = 194,15 7,75% = 167,19\r\nKoszty uzyskania przychodu (stałe) 431.45\r\nPodstawa opodatkowania 1725.8 zaokrąglona 1726\r\nZaliczka na podatek dochodowy 18 % = 310.68\r\nPodatek potrącony = 310,68\r\nZaliczka do urzędu skarbowego = 143,49 po zaokrągleniu = 143\r\n\r\nPracownik otrzyma wynagrodzenie netto w wysokości = 1820,10\r\n";
		
		assertEquals(result,dokument.getText());
	}

}
