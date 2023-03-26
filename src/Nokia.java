public class Nokia extends Phone {
    private String color;

    public String getColor() {
        return color;
    }

    public Nokia(String classname, int memory, String color) {
        super(classname, memory);
        this.color = color;
    }

    @Override
    public String print() {
        return " name: " + getClassname() + " Memory: " + getMemory() + " Color: " + getColor();

    }
}
