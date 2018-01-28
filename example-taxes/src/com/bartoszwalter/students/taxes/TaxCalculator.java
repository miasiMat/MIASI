package com.bartoszwalter.students.taxes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.bartoszwalter.students.taxes.Dokument.DokumentAbstrakcyjny;
import com.bartoszwalter.students.taxes.Dokument.DokumentFabryka;
import com.bartoszwalter.students.taxes.Umowa.UmowaAbstrakcyjna;
import com.bartoszwalter.students.taxes.Umowa.UmowaFabryka;


public class TaxCalculator {
	
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.print("Podaj kwotę dochodu: ");	
			double podstawa = Double.parseDouble(br.readLine());
			
			System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
			char typUmowy = br.readLine().charAt(0);
			
			UmowaAbstrakcyjna umowa = UmowaFabryka.getUmowa(typUmowy,podstawa);
			
			if(umowa == null) {
				System.out.println("Nieznany typ umowy!");
			} else {
				DokumentAbstrakcyjny dokument = DokumentFabryka.getDokument(umowa);
				System.out.print(dokument.getText());				
			}
					
		} catch (Exception ex) {
			System.out.println("Błędna kwota");
			System.err.println(ex);
			return;
		}
	}
}
