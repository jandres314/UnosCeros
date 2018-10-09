import java.util.List;

/**
 * clase para calcular equivalencia de numeros binarios a enteros
 * 
 * @author josorio
 *
 */
public class BinaryArrayToNumber {

	private BinaryArrayToNumber() {
	}

	/**
	 * @param binario array de binarios
	 * @return valor equivalente en entero
	 */
	public static int convertirArrayBinarioAInt(List<Integer> binario) {
		validarArray(binario);
		StringBuilder sb = new StringBuilder();
		for (Integer val : binario) {
			sb.append(val);
		}
		return Integer.parseInt(sb.toString(), 2);
	}

	/**
	 * valida que los valores del argumento binario sean validos para posterior
	 * procesamiento
	 * 
	 * @param binario array de numeros binarios
	 * @throws IllegalArgumentException
	 */
	static void validarArray(List<Integer> binario) {

		if (binario == null || binario.isEmpty() || binario.size() != 4) {
			throw new IllegalArgumentException();
		}
		for (Integer value : binario) {
			if (!esNroBinario(value)) {
				throw new IllegalArgumentException();
			}
		}
	}

	/**
	 * valida si un numero es binario
	 * 
	 * @param val value
	 * @return true si el argumento val es 0 o 1
	 */
	static boolean esNroBinario(Integer val) {
		boolean esBinario = false;
		if (val != null && (val == 0 || val == 1)) {
			esBinario = true;
		}
		return esBinario;
	}

}
