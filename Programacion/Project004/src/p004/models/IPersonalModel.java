package p004.models;

import java.sql.SQLException;
import java.util.List;
import p004.models.entities.Personal;

public interface IPersonalModel {
    List<Personal> list() throws SQLException;
    void create(Personal personal) throws SQLException;
    void update(Personal personal) throws SQLException;
    void delete(int idPersonal) throws SQLException;
}
