package com.bartoszwalter.students.taxes.Umowa;

import java.text.DecimalFormat;

public class UmowaZlecenie extends UmowaAbstrakcyjna {

	public UmowaZlecenie(double podstawa) {
		super(podstawa);
		oblicz();
	}
	
	private void oblicz(){
		DecimalFormat df = new DecimalFormat("#");
		_typUmowy = 'Z';
		_skladkaEmerytalna = ((_podstawa * 9.76) / 100);
		_skladkaRentowa = ((_podstawa * 1.5) / 100);
		_ubezpieczenieChorobowe = ((_podstawa * 2.45) / 100);
		_obliczonaPodstawa = (_podstawa - _skladkaEmerytalna - _skladkaRentowa - _ubezpieczenieChorobowe);
		_skladkaZdrowotna1 = (_obliczonaPodstawa* 9) / 100;
		_skladkaZdrowotna2 = (_obliczonaPodstawa* 7.75) / 100;
		_kosztyUzyskania = _obliczonaPodstawa*20/100;		
		_kwotaZmiejszajacaPodatek = 0;
		_podstawaOpodatkowania = (_obliczonaPodstawa - _kosztyUzyskania);
		_podstawaOpodatkowaniaZaokroglona = (Double.parseDouble(df.format(_podstawaOpodatkowania)));
		_zaliczkaNaPodatekDochodowy = (_podstawaOpodatkowaniaZaokroglona*18/100);
	    _podatekPotracony = _zaliczkaNaPodatekDochodowy;
		_podatekPotracony = (_zaliczkaNaPodatekDochodowy - _kwotaZmiejszajacaPodatek);
		_zaliczkaUS = (_zaliczkaNaPodatekDochodowy - _skladkaZdrowotna2 - _kwotaZmiejszajacaPodatek);
		_zaliczkaUSZaokraglona = (Double.parseDouble(df.format(_zaliczkaUS)));
		_wynagrodzenie = (_podstawa - (_skladkaEmerytalna + _skladkaRentowa + _ubezpieczenieChorobowe + _skladkaZdrowotna1 + _zaliczkaUSZaokraglona));
	}

	
}
