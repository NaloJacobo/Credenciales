
/**
 *
 * @author Nalo
 */
public class TestEncapsulado {

    public static void main(String[] args) {
        testLogin();
        testHackeo();
    }

    public static void testLogin() {
        SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
        sesionDeUsuario.setUsuario("sofia");
        sesionDeUsuario.setPassword("uvwxyz");
        sesionDeUsuario.doLogin();
        if (sesionDeUsuario.isLoggedIn()) {
            System.out.println("Bienvenido " + sesionDeUsuario.getUsuario());
        } else {
            System.out.println("Su usuario o contraseña están equivocados");
        }
        sesionDeUsuario.setPassword("abcdef");
        sesionDeUsuario.doLogin();
        if (sesionDeUsuario.isLoggedIn()) {
            System.out.println("Bienvenido " + sesionDeUsuario.getUsuario());
        } else {
            System.out.println("Su usuario o contraseña estan equivocados");
        }
    }

    public static void testHackeo() {
        SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
        /**
         * sesionDeUsuario.getPassword(); sesionDeUsuario.setLoggedIn(true);
         *
         * La primera línea no compila porque el método getPassword() está
         * intentando acceder a una variable de solo escritura y que no tiene
         * getter. La segunda línea no compila porque setLoggedIn() está
         * intentando modificar una variable de solo lectura.
         *
         * 
         * Se imprime
         * 
         * Su usuario o contraseña están equivocados
         * Bienvenido sofia
         */
    }
}
