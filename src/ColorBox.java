import java.Color;

public class ColorBox {
    private String name;
    private int volume;

    public ColorBox(String name, int age) {
        this.name = name;
        this.volume = age;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void updateName(final Color color) {
        switch(color) {
            case RED:
                name = "RED"; break;
            case BLUE:
                name = "BLUE"; break;
            case WHITE:
                name = "WHITE"; break;
        }
    }
}
