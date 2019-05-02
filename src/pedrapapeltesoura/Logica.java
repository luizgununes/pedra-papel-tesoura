public class Logica {

        public static final int PEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TESOURA = 3;

	public static void mostrar(String a, int b) {
		switch (b) {
		case Logica.PEDRA:
			System.out.print(a + " escolheu PEDRA ");
			break;
		case Logica.PAPEL:
			System.out.print(a + " escolheu PAPEL ");
			break;
		case Logica.TESOURA:
			System.out.print(a + " escolheu TESOURA ");
			break;
		default:
			break;
		}
	}

        public static int compararEscolhas(int escolhaJogador, int escolhaComputador) {
		if(escolhaJogador==escolhaComputador) return 0;
		switch (escolhaJogador) {
		case PEDRA:
			return (escolhaComputador == TESOURA ? 1 : -1);

		case PAPEL:
			return (escolhaComputador == PEDRA ? 1 : -1);

		case TESOURA:
			return (escolhaComputador == PAPEL ? 1 : -1);
		}
		return 0;
	}
}
