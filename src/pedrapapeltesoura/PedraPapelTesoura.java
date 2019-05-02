public class PedraPapelTesoura {
	
	private Jogador jogador;
	private Computador computador;
	private int placarJogador;
	private int placarComputador;
	private int numJogos;

	public PedraPapelTesoura() {
		jogador = new Jogador();
		computador = new Computador();
		placarJogador = 0;
		placarComputador = 0;
		numJogos = 0;
	}
	public static void main(String[] args) {

		PedraPapelTesoura pedrapapeltesoura = new PedraPapelTesoura();
		pedrapapeltesoura.nomeJogador();
		pedrapapeltesoura.comecarJogo();
	}

        public void comecarJogo() {
		int entradajogador = jogador.getEntrada();
		Logica.mostrar(jogador.getNome(), entradajogador);
		int entradacomputador = computador.getEntrada();
		Logica.mostrar("\nComputador", entradacomputador);
		int compararResultados=Logica.compararEscolhas(entradajogador, entradacomputador);
		switch (compararResultados) {
		case 0:
			System.out.println("\nEmpate!");
			break;
		case 1:
			System.out.println("\nVocê ganhou a rodada!");
			placarJogador++;
			break;
		case -1:
			System.out.println("\nO computador ganhou a rodada!");
			placarComputador++;
			break;
		}
		numJogos++;
		if(placarJogador==5)
		{
			System.out.println("Você ganhou do computador!");
			new PedraPapelTesoura();
		}
		if(placarComputador==5)
		{
			System.out.println("Você perdeu para o computador!");
			new PedraPapelTesoura();
		}
		if (jogador.jogarDenovo()) {
			System.out.println();
			comecarJogo();
		} else {
			mostrarResultado();
		}
	}
	public void nomeJogador() {
		jogador.askNome();
	}
	public void mostrarResultado()
	{
		System.out.println("Número de jogos: "+numJogos);
		System.out.println("Placar do jogador: " + placarJogador);
		System.out.println("Placar do computador: "+placarComputador);
	}
}