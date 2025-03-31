package p004.controllers;

import java.util.List;
import p004.models.entities.Personal;

public interface IPersonalController {
    List<Personal> list();
    void create(Personal personal);
    void update(Personal personal);
    void delete(int idPersonal);
}
