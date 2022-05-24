package Usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarieTest {
  @Test
  void crear_usuario() {
    Usuarie usuario = new Usuarie();
    assertTrue(usuario!=null);
  }
}