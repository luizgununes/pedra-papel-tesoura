import java.util.Random;

public class Computador {
	public int getEntrada() {
		Random random = new Random();
		int entrada = random.nextInt(3) + 1;
		return entrada;
	}
}