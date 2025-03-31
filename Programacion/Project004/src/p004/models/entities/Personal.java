package p004.models.entities;

public class Personal {
    private int idPersonal;
    private String name;
    private String occupation;
    private int idRoom;

    public Personal(int idPersonal, String name, String occupation, int idRoom) {
        this.idPersonal = idPersonal;
        this.name = name;
        this.occupation = occupation;
        this.idRoom = idRoom;
    }

    public int getIdPersonal() { return idPersonal; }
    public String getName() { return name; }
    public String getOccupation() { return occupation; }
    public int getIdRoom() { return idRoom; }
}
