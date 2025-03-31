package p004.controllers;

import java.sql.SQLException;
import java.util.List;
import p004.models.IPersonalModel;
import p004.models.PersonalModelDatabase;
import p004.models.entities.Personal;

public class PersonalController implements IPersonalController {
    private IPersonalModel model;

    public PersonalController() {
        try {
            this.model = new PersonalModelDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Personal> list() {
        try {
            return model.list();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void create(Personal personal) {
        try {
            model.create(personal);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Personal personal) {
        try {
            model.update(personal);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int idPersonal) {
        try {
            model.delete(idPersonal);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
