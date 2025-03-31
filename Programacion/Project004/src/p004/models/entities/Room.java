package p004.models.entities;

public class Room {
    private int idRoom;
    private String name;
    private int capacity;
    private String type;

    public Room(int idRoom, String name, int capacity, String type) {
        this.idRoom = idRoom;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public int getIdRoom() { return idRoom; }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Room{" + "id=" + idRoom + ", name='" + name + "', capacity=" + capacity + ", type='" + type + "'}";
    }
}
