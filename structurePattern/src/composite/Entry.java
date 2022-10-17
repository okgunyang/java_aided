package composite;
//추상화 클래스
public abstract class Entry {
    public abstract String getName();
    protected abstract void printList(String prefix);
    public void printList() {
        printList("");
    }
}