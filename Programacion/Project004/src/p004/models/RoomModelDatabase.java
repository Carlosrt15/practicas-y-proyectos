package p004.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import p004.models.entities.Room;

public class RoomModelDatabase implements IRoomModel {
    private static String url = "jdbc:mysql://localhost:3306/p04_gym";
    private static String user = "root";
    private static String password = "PracticaRoot";

    private Connection connection;

    public RoomModelDatabase() throws SQLException {
        this.connection = DriverManager.getConnection(url, user, password);
    }

    @Override
    public List<Room> list() throws SQLException {
        List<Room> list = new ArrayList<>();
        String query = "SELECT id_room, name, capacity, type FROM room";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Room room = new Room(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            list.add(room);
        }
        return list;
    }

    @Override
    public void create(Room room) throws SQLException {
        String query = "INSERT INTO room (name, capacity, type) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, room.getName());
        ps.setInt(2, room.getCapacity());
        ps.setString(3, room.getType());
        ps.executeUpdate();
    }

    @Override
    public void update(Room room) throws SQLException {
        String query = "UPDATE room SET name = ?, capacity = ?, type = ? WHERE id_room = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, room.getName());
        ps.setInt(2, room.getCapacity());
        ps.setString(3, room.getType());
        ps.setInt(4, room.getIdRoom());
        ps.executeUpdate();
    }

    @Override
    public void delete(int idRoom) throws SQLException {
        String query = "DELETE FROM room WHERE id_room = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, idRoom);
        ps.executeUpdate();
    }
}
