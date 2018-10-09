import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author josorio
 *
 */
public class BinaryArrayToNumberTest {

	@Test
	public void esNroBinario1Test() {
		assertTrue(BinaryArrayToNumber.esNroBinario(1));
	}

	@Test
	public void esNroBinario0Test() {
		assertTrue(BinaryArrayToNumber.esNroBinario(0));
	}

	@Test
	public void esNroBinario2Test() {
		assertFalse(BinaryArrayToNumber.esNroBinario(2));
	}

	@Test
	public void esNroBinarioNullTest() {
		assertFalse(BinaryArrayToNumber.esNroBinario(null));
	}

	@Test(expected = IllegalArgumentException.class)
	public void validarArrayNullTest() {
		BinaryArrayToNumber.validarArray(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void validarArrayEmptyTest() {
		BinaryArrayToNumber.validarArray(new ArrayList<Integer>());
	}

	@Test(expected = IllegalArgumentException.class)
	public void validarArrayDiferente4ValoresTest() {
		BinaryArrayToNumber.validarArray(new ArrayList<Integer>(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void validarArrayValorInvalidoTest() {
		List<Integer> values = Arrays.asList(1, 2, 3, 4);
		BinaryArrayToNumber.validarArray(values);
	}

	@Test
	public void calcularBinarioValor10Test() {
		List<Integer> values = Arrays.asList(1, 0, 1, 0);
		int val = BinaryArrayToNumber.convertirArrayBinarioAInt(values);
		assertEquals(10, val);
	}

	@Test
	public void calcularBinarioValor7Test() {
		List<Integer> values = Arrays.asList(0, 1, 1, 1);
		int val = BinaryArrayToNumber.convertirArrayBinarioAInt(values);
		assertEquals(7, val);
	}

	@Test
	public void calcularBinarioValor14Test() {
		List<Integer> values = Arrays.asList(1, 1, 1, 0);
		int val = BinaryArrayToNumber.convertirArrayBinarioAInt(values);
		assertEquals(14, val);
	}

}
