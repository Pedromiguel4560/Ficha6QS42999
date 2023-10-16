import org.example.QuantidadeDigitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuantidadeDigitosTest {

    private QuantidadeDigitos qt;

    @BeforeEach
    public void setUp(){
        qt = new QuantidadeDigitos();
    }

    @Test
    public void quantDigit(){

        double quantDig = qt.mediaDigitos(532);

        double quantDigTest = 19;

        assertEquals(quantDig, quantDigTest, "Erro na media dos digitos!!!");

    }



}
