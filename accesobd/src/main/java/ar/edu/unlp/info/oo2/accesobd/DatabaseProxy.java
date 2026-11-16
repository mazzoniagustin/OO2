package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess{
    private boolean auth;
    private String password;
    private DatabaseAccess db;
    private static final Logger logger = Logger.getLogger(DatabaseProxy.class.getName());


    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (auth) {
            logger.info("Acceso a busqueda" + queryString);
            return db.getSearchResults(queryString);
        }
        throw new IllegalArgumentException("No se encuentra autenticado.");
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (auth) {
            logger.warning("Acceso a inserción de datos " + rowData);
            return db.insertNewRow(rowData);
        }
        else {
            throw new IllegalArgumentException("No se encuentra autenticado.");
        }
    }

    public void login (String pass) {
        if (!this.auth) {
            if (pass.equals(password)) {
                this.auth = true;
            }
            else {
                throw new RuntimeException("Contraseña incorrecta");
            }
        }
        else {
            throw new RuntimeException("Sesion ya iniciada");
        }
    }

    public void logout() {
        this.auth = false;
    }
}
