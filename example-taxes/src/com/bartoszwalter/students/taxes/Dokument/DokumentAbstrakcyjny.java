package com.bartoszwalter.students.taxes.Dokument;

import java.text.DecimalFormat;

import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;

public abstract class DokumentAbstrakcyjny {
	
	UmowaAbstrakcyjna _umowa;
	
	public DokumentAbstrakcyjny(UmowaAbstrakcyjna umowa) {
		_umowa = umowa;
	}
	
	public String getText(){	
		DecimalFormat df00 = new DecimalFormat("#.00");
		
		String result = new String();
		result += "Podstawa wymiaru składek " +  _umowa.getPodstawa() + "\r\n";
		result += "Składka na ubezpieczenie emerytalne " + df00.format(_umowa.getSkladkaEmerytalna()) + "\r\n"; 
		result += "Składka na ubezpieczenie rentowe    " + df00.format(_umowa.getSkladkaRentowa()) + "\r\n";
		result += "Składka na ubezpieczenie chorobowe  " + df00.format(_umowa.getUbezpieczenieChorobowe())  + "\r\n";
		result += "Podstawa wymiaru składki na ubezpieczenie zdrowotne: " + _umowa.getObliczonaPodstawa() + "\r\n";
		result += "Składka na ubezpieczenie zdrowotne: 9% = " + df00.format(_umowa.getSkladkaZdrowotna1()) + " 7,75% = " + df00.format(_umowa.getSkladkaZdrowotna2())  + "\r\n";
		return result;
	}
}
