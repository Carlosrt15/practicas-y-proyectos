package p004.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import p004.models.entities.Personal;

public class PersonalModelDatabase implements IPersonalModel {
    private static String url = "jdbc:mysql://localhost:3306/p04_gym";
    private static String user = "root";
    private static String password = "PracticaRoot";

    private Connection connection;

    public PersonalModelDatabase() throws SQLException {
        this.connection = DriverManager.getConnection(url, user, password);
    }

    @Override
    public List<Personal> list() throws SQLException {
        List<Personal> list = new ArrayList<>();
        String query = "SELECT id_personal, name, occupation, id_room FROM personal";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Personal personal = new Personal(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            list.add(personal);
        }
        return list;
    }

    @Override
    public void create(Personal personal) throws SQLException {
        String query = "INSERT INTO personal (name, occupation, id_room) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, personal.getName());
        ps.setString(2, personal.getOccupation());
        ps.setInt(3, personal.getIdRoom());
        ps.executeUpdate();
    }

    @Override
    public void update(Personal personal) throws SQLException {
        String query = "UPDATE personal SET name = ?, occupation = ?, id_room = ? WHERE id_personal = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, personal.getName());
        ps.setString(2, personal.getOccupation());
        ps.setInt(3, personal.getIdRoom());
        ps.setInt(4, personal.getIdPersonal());
        ps.executeUpdate();
    }

    @Override
    public void delete(int idPersonal) throws SQLException {
        String query = "DELETE FROM personal WHERE id_personal = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, idPersonal);
        ps.executeUpdate();
    }
}

