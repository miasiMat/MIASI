import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;
import com.bartoszwalter.students.taxes.Umowa.UmowaFabryka;

public class UmowaTest {

	@Test
	public void test0() {
		UmowaAbstrakcyjna umowa = UmowaFabryka.getUmowa('P', 2000);
		Assert.assertEquals('P', umowa.getTypUmowy());
	}
	
	@Test
	public void test1() {
		UmowaAbstrakcyjna umowa = UmowaFabryka.getUmowa('Z', 2000);
		Assert.assertEquals('Z', umowa.getTypUmowy());
	}

	@Test
	public void test2() {
		UmowaAbstrakcyjna umowa = UmowaFabryka.getUmowa('P', 2000);
		Assert.assertEquals(umowa.getPodstawa(), 2000,1);
		Assert.assertEquals(umowa.getSkladkaEmerytalna(), 195,1);
		Assert.assertEquals(umowa.getSkladkaRentowa(), 30,1);
		Assert.assertEquals(umowa.getUbezpieczenieChorobowe(), 49,1);
		Assert.assertEquals(umowa.getObliczonaPodstawa(), 1725,1);
		Assert.assertEquals(umowa.getSkladkaZdrowotna1(), 155,1);
		Assert.assertEquals(umowa.getSkladkaZdrowotna2(), 133,1);
		
		Assert.assertEquals(umowa.getKosztyUzyskania(), 111,1);
		Assert.assertEquals(umowa.getPodstawaOpodatkowania(), 1615,1);
		Assert.assertEquals(umowa.getPodstawaOpodatkowaniaZaokroglona(), 1615,1);
		Assert.assertEquals(umowa.getZaliczkaNaPodatekDochodowy(), 290,1);
		Assert.assertEquals(umowa.getKwotaZmiejszajacaPodatek(), 46,1);

		Assert.assertEquals(umowa.getPodatekPotracony(), 244,1);
		Assert.assertEquals(umowa.getZaliczkaUS(), 110,1);
		Assert.assertEquals(umowa.getZaliczkaUSZaokraglona(), 111,1);
		Assert.assertEquals(umowa.getWynagrodzenie(), 1459,1);
	}
	
	@Test
	public void test3() {
		UmowaAbstrakcyjna umowa = UmowaFabryka.getUmowa('Z', 2000);
		Assert.assertEquals(umowa.getPodstawa(), 2000,1);
		Assert.assertEquals(umowa.getSkladkaEmerytalna(), 195,1);
		Assert.assertEquals(umowa.getSkladkaRentowa(), 30,1);
		Assert.assertEquals(umowa.getUbezpieczenieChorobowe(), 49,1);
		Assert.assertEquals(umowa.getObliczonaPodstawa(), 1725,1);
		Assert.assertEquals(umowa.getSkladkaZdrowotna1(), 155,1);
		Assert.assertEquals(umowa.getSkladkaZdrowotna2(), 133,1);
		
		Assert.assertEquals(umowa.getKosztyUzyskania(), 345,1);
		Assert.assertEquals(umowa.getPodstawaOpodatkowania(), 1380,1);
		Assert.assertEquals(umowa.getPodstawaOpodatkowaniaZaokroglona(), 1381,1);
		Assert.assertEquals(umowa.getZaliczkaNaPodatekDochodowy(), 248,1);

		Assert.assertEquals(umowa.getPodatekPotracony(), 248,1);
		Assert.assertEquals(umowa.getZaliczkaUS(), 114,1);
		Assert.assertEquals(umowa.getZaliczkaUSZaokraglona(), 115,1);
		Assert.assertEquals(umowa.getWynagrodzenie(), 1455,1);
	}
}
