import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertNotNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {

	private FizzBuzzGame meuJogo;

	@Before
	public void setup() {
		meuJogo = new FizzBuzzGame();
		assertNotNull(meuJogo);
		
		meuJogo.setTamanho(10);
		Assert.assertEquals(valueOf(10), meuJogo.getTamanho());
	}
	
	@Test
	public void validaSequenciaAte_0() {
		meuJogo.setTamanho(0);
		
		String sequencia = meuJogo.getSequencia();
		Assert.assertEquals("" , sequencia);
	}
	
	@Test
	public void validaSequenciaAte_10() {
		String sequencia = meuJogo.getSequencia();
		Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz" , sequencia);
	}
	
	@Test
	public void validaSequenciaAte_15() {
		meuJogo.setTamanho(15);
		
		String sequencia = meuJogo.getSequencia();
		Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz" , sequencia);
	}
	
	@Test
	public void validaSequenciaAte_35() {
		meuJogo.setTamanho(35);
		
		String sequencia = meuJogo.getSequencia();
		final String sequenciaEsperada = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 Fizz Buzz 31 32 Fizz 34 Buzz";
		Assert.assertEquals(sequenciaEsperada , sequencia);
	}
	
	@Test
	public void geraDuasSequenciasConsecutivas() {
		meuJogo.setTamanho(5);
		String sequencia = meuJogo.getSequencia();
		Assert.assertEquals("1 2 Fizz 4 Buzz" , sequencia);
		
		meuJogo.setTamanho(15);
		sequencia = meuJogo.getSequencia();
		Assert.assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz" , sequencia);
	}

}
