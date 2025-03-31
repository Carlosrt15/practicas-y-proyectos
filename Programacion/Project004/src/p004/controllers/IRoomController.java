package p004.controllers;

import java.util.List;
import p004.models.entities.Room;

public interface IRoomController {
    List<Room> list();
    void create(Room room);
    void update(Room room);
    void delete(int idRoom);
}
