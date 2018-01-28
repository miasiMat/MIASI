package com.bartoszwalter.students.taxes.Umowa;

public class UmowaFabryka {
	public static UmowaAbstrakcyjna getUmowa(char typUmowy,double podstawa){
		if(typUmowy == 'P'){
			return new UmowaOPrace(podstawa);
		}else if (typUmowy == 'Z'){
			return new UmowaZlecenie(podstawa);				
		}		
		return null;
	}
}
