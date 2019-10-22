package com.trifulcas.springprueba;

public class Cesar implements ICodificar {
	
	private static final short paso = 2;
	private static final short nAZ = 'Z'-'A'+1;

	@Override
	public String codificar(String cadena) {
		return cesar(cadena, paso);
	}
	
	@Override
	public String decodificar(String cadena) {
		return cesar(cadena, -paso);
	}
	
	private String cesar(String cadena, int pasoCD) {
		// pasoCD positivo para codificar
		// pasoCD negativo para descodificar
		String strTmp, strRes;
		char c;
		int cn;
		
		strTmp = cadena.toUpperCase();
		strRes="";
		for(int i=0; i<strTmp.length(); i++) {
			c = strTmp.charAt(i);
			if(c>='A' && c<='Z') {
				cn = c - 'A';
				// codificación CESAR
				cn = (cn + pasoCD) % nAZ;
				c = (char) (cn + 'A');
			}
			strRes = strRes.concat(String.valueOf(c));
		}
		
		return strRes;
	}
	
}
