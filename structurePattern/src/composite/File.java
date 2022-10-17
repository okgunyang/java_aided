package composite;

public class File extends Entry {
    private String name;
    public File(String name) {   this.name = name;  }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + name);
    }
}