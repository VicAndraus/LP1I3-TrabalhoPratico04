import java.util.Scanner;

class Hora {
	private int hora, minuto, segundo, somaSegundo = 0;
	

	int getHora() {
		return hora;	
	}


	int getMinuto() {
		return minuto;	
	}


	int getSegundo() {
		return segundo;	
	}
	

	void setHora() {
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.println("Digite o horário: ");
			this.hora = Teclado.nextInt();
			if (hora < 0 || hora > 23) {
				System.out.println("Valor invalido! Por favor, digite novamente!");}	
		 }
		while(hora < 0 || hora > 23);	
	}

	void setHora(int h) {
		this.hora = h;
	}

	void setMinuto() {
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.println("Digite os minutos:");
			this.minuto = Teclado.nextInt(); 
			if (minuto < 0 || minuto > 59) {
				System.out.println("Valor invalido! Por favor, digite novamente!");}	
		}
		while(minuto < 0 || minuto > 59);	
	}

	void setMinuto(int m) {
		this.minuto = m;
	}

	void setSegundo() {
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.println("Digite os segundos:");
			this.segundo = Teclado.nextInt();
			if (segundo < 0 || segundo > 59) {
				System.out.println("Valor invalido! Por favor, digite novamente!");}		
		 }
		while(segundo < 0 || segundo > 59);	
	}

	void setSegundo(int s) {
		this.segundo = s;
	}

	
	public Hora(int h, int m, int s) {
		
		Scanner Teclado = new Scanner(System.in);
		
		while (h > 23 || h < 0) {
			System.out.println("Horario inválido! Por favor, digite novamente!!");
			h = Teclado.nextInt();
		}

		while (m > 59 || m < 0) {
			System.out.println("O(s) minuto(s) (sao) invalido(s)! Por favor, digite novamente!!");
			m = Teclado.nextInt();
		}

		while (s > 59 || s < 0) {
			System.out.println("O(s) segundo(s) (sao) invalido(s)! Por favor, digite novamente!!");
			s = Teclado.nextInt();
		}
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}

	public Hora() {
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite as horas: ");
			hora = teclado.nextInt();
			if (hora < 0 || hora > 23) {
				System.out.println("Valor invalido! Por favor, digite novamente!!");}	
		 }
		while(hora < 0 || hora > 23);

		do {
			System.out.println("Digite os minutos:");
			minuto = teclado.nextInt(); 
			if (minuto < 0 || minuto > 59) {
				System.out.println("Valor invalido! Por favor, digite novamente!!");}	
		}
		while(minuto < 0 || minuto > 59);

		do {
			System.out.println("Digite os segundos:");
			segundo = teclado.nextInt();
			if (segundo < 0 || segundo > 59) {
				System.out.println("Valor invalido! Por favor, digite novamente!!");}		
		 }
		while(segundo < 0 || segundo > 59);
	}

	public int getSegundos() {
		somaSegundo = (hora * 3600) + (minuto * 60) + segundo;
		return somaSegundo;
	}

	public String getHora1() {
		return "Horario exato: " + hora + ":" + minuto + ":" + segundo;
	}

	public String getHora2() {
		int horaAMPM = hora;
		String AMPM = "AM";

		if (hora > 12) {
			horaAMPM = hora - 12;
			AMPM = "PM";
		}
		if (hora == 0) {
			horaAMPM = 12;
		}

		return "Horario exato: " + horaAMPM + ":" + minuto + ":" + segundo + AMPM;
	}

}
		
		