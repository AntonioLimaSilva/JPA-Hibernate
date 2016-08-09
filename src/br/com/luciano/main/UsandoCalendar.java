package br.com.luciano.main;

import java.util.Calendar;
import java.util.Date;

public class UsandoCalendar {
	
	public static void main(String[] args) {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1987, 10, 23, 7, 20, 50);
		Date data1 = dataNascimento.getTime();
		
		System.out.println(data1);
		
		System.out.println(geraDataInicial(data1));
		
	}
	
	public static Date geraDataInicial(Date data) {
		Calendar dataInicial = Calendar.getInstance();
		dataInicial.setTime(data);
		dataInicial.set(Calendar.HOUR_OF_DAY, 0);
		dataInicial.set(Calendar.MINUTE, 0);
		dataInicial.set(Calendar.SECOND, 0);
		return dataInicial.getTime();
	}
	
}
