public class Redmi extends Phone {
    private String size;


    public Redmi(String classname, int memory, String size) {

        super(classname, memory);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    @Override
    public String print() {
        return " name: " + getClassname() + " Memory: " + getMemory() + " Size: " + getSize();
    }
}
