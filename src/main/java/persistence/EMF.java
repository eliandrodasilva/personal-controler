package persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
    private static EntityManagerFactory EMF;

    private EMF () {}

    public static EntityManagerFactory getEMF() {
        if (EMF == null) {
            EMF = Persistence.createEntityManagerFactory("persistenciaPU");
        }
        return EMF;
    }

}
