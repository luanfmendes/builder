package builder;

import org.example.Lanche;
import org.example.LancheBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LancheBuilderTest {

    @Test
    public void deveCriarLancheComTodosOsIngredientes() {
        Lanche lanche = new LancheBuilder()
                .comPao("Brioche")
                .comCarne("Hambúrguer")
                .comQueijo("Cheddar")
                .comAdicionais("Bacon e Cebola")
                .build();

        assertEquals("Brioche", lanche.getPao());
        assertEquals("Hambúrguer", lanche.getCarne());
        assertEquals("Cheddar", lanche.getQueijo());
        assertEquals("Bacon e Cebola", lanche.getAdicionais());
    }

    @Test
    public void deveCriarLancheComApenasPaoECarne() {
        Lanche lanche = new LancheBuilder()
                .comPao("Francês")
                .comCarne("Frango")
                .build();

        assertEquals("Francês", lanche.getPao());
        assertEquals("Frango", lanche.getCarne());
        assertNull(lanche.getQueijo());
        assertNull(lanche.getAdicionais());
    }
}
