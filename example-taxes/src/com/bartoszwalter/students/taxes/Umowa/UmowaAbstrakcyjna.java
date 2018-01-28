package com.bartoszwalter.students.taxes.Umowa;

public abstract class UmowaAbstrakcyjna {
	protected double _podstawa = 0;
	protected double _obliczonaPodstawa = 0;
	protected char _typUmowy = ' ';
	protected double _skladkaEmerytalna = 0;
	protected double _skladkaRentowa = 0;
	protected double _ubezpieczenieChorobowe = 0;
	protected double _kosztyUzyskania = 0; 
	protected double _skladkaZdrowotna1 = 0;
	protected double _skladkaZdrowotna2 = 0;
	protected double _zaliczkaNaPodatekDochodowy = 0;
	protected double _kwotaZmiejszajacaPodatek = 0;
	protected double _zaliczkaUS = 0;
	protected double _zaliczkaUSZaokraglona = 0;
	protected double _podstawaOpodatkowania = 0;
	protected double _podstawaOpodatkowaniaZaokroglona = 0;
	protected double _podatekPotracony = 0;
	protected double _wynagrodzenie = 0;
	
	public UmowaAbstrakcyjna(double podstawa) {
		_podstawa = podstawa;
	}
	
	public double getPodstawa() {
		return _podstawa;
	}

	public double getObliczonaPodstawa() {
		return _obliczonaPodstawa;
	}

	public char getTypUmowy() {
		return _typUmowy;
	}

	public double getSkladkaEmerytalna() {
		return _skladkaEmerytalna;
	}

	public double getSkladkaRentowa() {
		return _skladkaRentowa;
	}

	public double getUbezpieczenieChorobowe() {
		return _ubezpieczenieChorobowe;
	}

	public double getKosztyUzyskania() {
		return _kosztyUzyskania;
	}

	public double getSkladkaZdrowotna1() {
		return _skladkaZdrowotna1;
	}

	public double getSkladkaZdrowotna2() {
		return _skladkaZdrowotna2;
	}

	public double getZaliczkaNaPodatekDochodowy() {
		return _zaliczkaNaPodatekDochodowy;
	}


	public double getKwotaZmiejszajacaPodatek() {
		return _kwotaZmiejszajacaPodatek;
	}

	public double getZaliczkaUS() {
		return _zaliczkaUS;
	}

	public double getZaliczkaUSZaokraglona() {
		return _zaliczkaUSZaokraglona;
	}

	public double getPodstawaOpodatkowania() {
		return _podstawaOpodatkowania;
	}

	public double getPodstawaOpodatkowaniaZaokroglona() {
		return _podstawaOpodatkowaniaZaokroglona;
	}

	public double getPodatekPotracony() {
		return _podatekPotracony;
	}

	public double getWynagrodzenie() {
		return _wynagrodzenie;
	}

}
