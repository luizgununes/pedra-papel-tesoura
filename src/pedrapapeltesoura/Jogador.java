import java.util.Scanner;

public class Jogador {
	private String nome;
	Scanner sc = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public void askNome() {
		System.out.println("Qual o seu nome?");
		nome = sc.next();
	}

	public int getEntrada() {
		System.out.println("Escolha entre PEDRA, PAPEL ou TESOURA:");
		String entrada = sc.next();
		entrada = entrada.toUpperCase();
		char c = entrada.charAt(0);
		if (c == '1')
			return Logica.PEDRA;
		else if (c == '2')
			return Logica.PAPEL;
		else if (c == '3')
			return Logica.TESOURA;
		else {
			getEntrada();
			return 0;
		}
	}

	public boolean jogarDenovo() {
		sc=new Scanner(System.in);
		System.out.print("Jogar novamente? ");
		String escolha = sc.nextLine();
		escolha = escolha.toUpperCase();
		return escolha.charAt(0) == 'S';
	}
}
