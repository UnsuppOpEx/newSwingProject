package swingProject.entities.computerComponents;

public enum Socket {

    LGA1366(1, "LGA1366"),
    LGA1156(2, "LGA1156"),
    LGA1155(3, "LGA1155"),
    LGA1150(4, "LGA1150"),
    LGA1151(5, "LGA1151"),
    LGA2066(6, "LGA2066"),
    LGA1200(7, "LGA1200"),
    AM2(8, "AM2"),
    AM3(9, "AM3"),
    FM1(10, "FM1"),
    FM2(11, "FM2"),
    AM4(12, "AM4"),
    TR4(13, "TR4");

    int id;
    String str;

    Socket(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public int getId() {
        return id;
    }

    public String getStr() {
        return str;
    }
}
