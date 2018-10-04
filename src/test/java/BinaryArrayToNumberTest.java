import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BinaryArrayToNumberTest {

    @Test
    public void convertirArrayBinarioAIntCuandoRecibe0001DebeRetornar1() throws Exception {
        //Arrange
        List binario = new ArrayList<>(Arrays.asList(0,0,0,1));
        //Act
        int resp = BinaryArrayToNumber.convertirArrayBinarioAInt(binario);
        //Assert
        assertEquals(1,resp);
    }

    @Test
    public void convertirArrayBinarioAIntCuandoRecibe0001DebeRetornar15() throws Exception {
        List binario = new ArrayList<>(Arrays.asList(1,1,1,1));

        int resp = BinaryArrayToNumber.convertirArrayBinarioAInt(binario);

        assertEquals(15, resp);
    }

}
