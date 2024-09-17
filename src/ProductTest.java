import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1, p2;

    @BeforeEach
    void setUp() {
        p1 = new Product("laptop", "surface", "000001", 600);
        p2 = new Product("guitar", "ovation", "000002", 900);
    }

    @Test
    void setName() {
        p1.setName("guitar");
        assertEquals("guitar", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("ovation");
        assertEquals("ovation", p1.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(900);
        assertEquals(900, p1.getCost());
    }

    @Test
    void toCSV() {
        assertEquals("000002, guitar, ovation, 900", p2.toCSV());
    }

    @Test
    void equals() {
        p1.setName("guitar");
        p1.setDescription("ovation");
        p1.setCost(900);
        assertEquals(p1, p2);
    }
}