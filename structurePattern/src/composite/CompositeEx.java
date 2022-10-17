package composite;
//컴포짓 패턴(Composite Pattern)
//두 개의 클래스가 복합이 가능하도록 엔트리라는 인터페이스나 추상화 클래스로 부터 상속하여 
//각 객체의 데이터 조합이 가능하도록 하는 패턴
public class CompositeEx {
    public static void main(String[] args) {
        Directory workspaceDir = new Directory("workspace");
        Directory compositeDir = new Directory("composite");
        Directory testDir1 = new Directory("test1");
        Directory testDir2 = new Directory("test2");
        workspaceDir.add(compositeDir);
        workspaceDir.add(testDir1);
        workspaceDir.add(testDir2);
        File directory = new File("Directory.java");
        File entity = new File("Entity.java");
        File file = new File("file.java");
        File main = new File("main.java");
        compositeDir.add(directory);
        compositeDir.add(entity);
        compositeDir.add(file);
        compositeDir.add(main);
        workspaceDir.printList();
    }
}