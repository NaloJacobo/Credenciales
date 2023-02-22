
/**
 *
 * @author Nalo
 */
public class SesionDeUsuario {

    private BaseDeDatos bd = new BaseDeDatos();
    private String usuario;
    private String password;
    private boolean loggedIn = false;

    public SesionDeUsuario() {
    }

    public void doLogin() {
        String passwordMD5 = HelperEncriptacion.getMD5(this.password);
        for (int i = 0; i < 5; i++) {
            if (bd.usuariosRegistrados[i].getUsuario().equals(this.usuario)) {
                if (bd.usuariosRegistrados[i].getPasswordMD5().equals(passwordMD5)) {
                    loggedIn = true;
                }
            }
        }
    }

    public void doLogout() {
        loggedIn = false;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
