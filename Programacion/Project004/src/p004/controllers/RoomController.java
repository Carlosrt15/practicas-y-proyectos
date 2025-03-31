package p004.controllers;

import java.sql.SQLException;
import java.util.List;
import p004.models.IRoomModel;
import p004.models.RoomModelDatabase;
import p004.models.entities.Room;

public class RoomController implements IRoomController {
    private IRoomModel model;

    public RoomController() {
        try {
            this.model = new RoomModelDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Room> list() {
        try {
            return model.list();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void create(Room room) {
        try {
            model.create(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Room room) {
        try {
            model.update(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int idRoom) {
        try {
            model.delete(idRoom);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
