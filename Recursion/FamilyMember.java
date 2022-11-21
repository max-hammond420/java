import java.util.List;
import java.util.ArrayList;


public class FamilyMember {
    private String name;
    private int age;
    private List<FamilyMember> children;


    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<FamilyMember> getAll() {
        //Your code here
        ArrayList<FamilyMember> all = new ArrayList<FamilyMember>();
        all.addAll(children);
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getChildren() == null) {
                all.add(children.get(i));
            } else {
                all.addAll(children.get(i).getAll());
            }
        }
        return all;
    }

    public List<FamilyMember> getAllParents() {
        //Your code here
        ArrayList<FamilyMember> parents = new ArrayList<FamilyMember>();

        if (this.children == null) {
            parents.addAll(new ArrayList<FamilyMember>());
        } else {
            for (int i = 0; i < this.children.size(); i++) {
                parents.addAll(children.get(i).getAllParents());
            }
        }

        return parents;
    }

    public List<FamilyMember> getAllChildren() {
        List<FamilyMember> childrenCount = new ArrayList<FamilyMember>();
        if (children == null) {
            return new ArrayList<FamilyMember>();
        }
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getAllChildren() == null) {
                childrenCount.add(children.get(i));
            }
        }
        return childrenCount;
    }

    public void addChild(FamilyMember child) {
        if (children == null) {
            this.children = new ArrayList<>();
            children.add(child);
        } else {
            children.add(child);
        }
    }

    public List<FamilyMember> getChildren() {
        return this.children;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        //Test your code here
    }
}
