public class Motorola extends Phone{
    private String screen;

    public Motorola(String classname, int memory, String screen) {
        super(classname, memory);
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    @Override
    public String print() {
        return " name: " + getClassname() + " Memory: " + getMemory() + " Screen: " + getScreen();
    }
}
