package nogometnaStatistika;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean DEV;

	public static int unosBrojRaspon(String poruka, int min, int max) {
		int i;
		while(true) {
			try {
				System.out.print(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if(i<min || i>max) {
					System.out.println("Broj mora biti između " 
							+ min + " i " + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");
			}
		}
	}

	public static String unosTeksta(String poruka) {
		String s;
		while(true) {
			System.out.print(poruka);
			s = ulaz.nextLine();
			if(s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}	
	}
	
	public static BigDecimal unosVrijednosti(String poruka) {

		System.out.println(poruka);
		String s = ulaz.nextLine();
		return new BigDecimal(s);

	}
	public static boolean unosPotvrde(String poruka,int broj){
		System.out.println("poruka");
	    if (broj == 7) {
	      return true;
	    }
	    else {
	       return false;
	       
	    }
	}
}

