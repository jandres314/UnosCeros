import java.util.List;

public class BinaryArrayToNumber {

    public static int convertirArrayBinarioAInt(List<Integer> binario) {
        return binario.stream().reduce((x, y) -> x * 2 + y).get();
    }
}