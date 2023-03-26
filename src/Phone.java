public abstract class Phone implements Printable {
    private String classname;
    private int Memory;

    public Phone(String classname, int memory) {
        this.classname = classname;
        Memory = memory;
    }

    public String getClassname() {
        return classname;
    }

    public int getMemory() {
        return Memory;
    }

    @Override
    public String print() {
        return null;
    }
}