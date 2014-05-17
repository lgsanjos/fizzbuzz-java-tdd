
public class FizzBuzzGameExecutable {

	public static void main(String[] args) {
		Integer tamanho = new Integer(args[0]);
		
		FizzBuzzGame game = new FizzBuzzGame();
		game.setTamanho(tamanho);
		System.out.println("Sequencia de " + tamanho + " posições:");
		System.out.println(game.getSequencia());
	}

}
