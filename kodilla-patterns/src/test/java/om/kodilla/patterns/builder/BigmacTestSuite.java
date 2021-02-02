package om.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame seed bun")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Bacon")
                .ingredient("Pickles")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whichSauce = bigmac.getSauce();
        String bunType = bigmac.getBun();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
        Assertions.assertEquals(2, howManyBurgers);
        Assertions.assertEquals("Barbecue", whichSauce);
        Assertions.assertTrue(bigmac.getIngredients().contains("Pickles"));
        Assertions.assertFalse(bigmac.getIngredients().contains("Mushrooms"));
        Assertions.assertNotNull(bunType);
    }
}
