
public class FizzBuzzGame {

	private static final String MULTIPLO_DE_CINCO = "Buzz";
	private static final String MULTIPLO_DE_TRES = "Fizz";
	private String sequencia;
	
	private Integer tamanho;

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public String getSequencia() {
		sequencia = new String();
		for (int i = 1; i <= tamanho; i++) {
			adicionaElementoNaSequencia(i);
		}
		return sequencia;
	}

	protected void adicionaElementoNaSequencia(int elemento) {
		adicionaFizzSeMultiploDeTres(elemento);
		adicionaBuzzSeMultiploDeCinco(elemento);
		adicionaElementoSeNaoForMutiploDeTresOuCinco(elemento);
		
		adicionaEspacoSeNaoForUltimoElemento(elemento);
	}

	private void adicionaBuzzSeMultiploDeCinco(int elemento) {
		if (divisivelPorTres(elemento) && divisivelPorCinco(elemento))
			sequencia += " ";

		if (divisivelPorCinco(elemento))
			sequencia += MULTIPLO_DE_CINCO;
	}

	private void adicionaEspacoSeNaoForUltimoElemento(int elemento) {
		if (elemento < tamanho)
			sequencia += " ";
	}

	private void adicionaElementoSeNaoForMutiploDeTresOuCinco(int elemento) {
		if (!divisivelPorTres(elemento) && !divisivelPorCinco(elemento))
			sequencia += elemento;
	}

	private void adicionaFizzSeMultiploDeTres(Integer elemento) {
		if (divisivelPorTres(elemento))
			sequencia += MULTIPLO_DE_TRES;
	}

	private boolean divisivelPorTres(Integer elemento) {
		return elemento % 3 == 0;
	}

	private boolean divisivelPorCinco(int elemento) {
		return elemento % 5 == 0;
	}
}
