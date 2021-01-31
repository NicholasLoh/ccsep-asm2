package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Security unit tests")
@Tag("security")
public class appSecuritySpec {

    @Test
    public void amount_bigger_than_IntMax_throw_exception() {
        assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval("2147483648");
        });
    }

    @Test
    public void amount_bigger_than_IntMax_after_surchage_throw_exception() {
        assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval("2147483638");
        });
    }
}
