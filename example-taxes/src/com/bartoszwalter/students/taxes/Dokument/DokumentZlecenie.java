package com.bartoszwalter.students.taxes.Dokument;

import java.text.DecimalFormat;

import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;

public class DokumentZlecenie extends DokumentAbstrakcyjny {

	public DokumentZlecenie(UmowaAbstrakcyjna umowa) {
		super(umowa);
	}
	
	public String getText(){	
		DecimalFormat df00 = new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#");

		String result = new String();
		
		result = "UMOWA-ZLECENIE\r\n";

		result+=super.getText();
		
		result += "Koszty uzyskania przychodu (stałe) "	+ _umowa.getKosztyUzyskania()  + "\r\n";
		result += "Podstawa opodatkowania " + _umowa.getPodstawaOpodatkowania() + " zaokrąglona " + df.format(Double.parseDouble(df.format(_umowa.getPodstawaOpodatkowaniaZaokroglona())))  + "\r\n";
		result += "Zaliczka na podatek dochodowy 18 % = " + _umowa.getZaliczkaNaPodatekDochodowy() + "\r\n";

		result += "Podatek potrącony = " + df00.format(_umowa.getPodatekPotracony()) + "\r\n";
		result += "Zaliczka do urzędu skarbowego = " + df00.format(_umowa.getZaliczkaUS()) + " po zaokrągleniu = "
		+ df.format(Double.parseDouble(df.format(_umowa.getZaliczkaUSZaokraglona()))) + "\r\n";
		result += "\r\n";
		result += "Pracownik otrzyma wynagrodzenie netto w wysokości = " + df00.format(_umowa.getWynagrodzenie()) + "\r\n";
		
		return result;
		
	}
}
