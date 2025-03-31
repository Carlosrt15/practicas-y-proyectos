package p004.models;

import java.sql.SQLException;
import java.util.List;
import p004.models.entities.Room;

public interface IRoomModel {
    List<Room> list() throws SQLException;
    void create(Room room) throws SQLException;
    void update(Room room) throws SQLException;
    void delete(int idRoom) throws SQLException;
}
