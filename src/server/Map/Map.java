package server.Map;

public class Map {
    int topX;
    int topY;

    public Map(int topX, int topY) {
        this.topX = topX;
        this.topY = topY;
    }

    public Map(int number) {
        topX = number;
        topY = number;
    }

    public Map() {
        topX = 100;
        topY = 100;
    }

}
