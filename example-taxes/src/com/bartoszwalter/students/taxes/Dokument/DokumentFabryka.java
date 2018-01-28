package com.bartoszwalter.students.taxes.Dokument;

import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;

public class DokumentFabryka {
	public static DokumentAbstrakcyjny getDokument(UmowaAbstrakcyjna umowa){
		if(umowa.getTypUmowy() == 'P'){
			return new DokumentOPrace(umowa);			
		} else if(umowa.getTypUmowy() == 'Z'){
			return new DokumentZlecenie(umowa);
		}
		return null;
	}
}
