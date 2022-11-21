import java.util.List;
import java.util.ArrayList;

public class FamilyMember {

    private String name;
    private int age;
    private List<FamilyMember> children;
    
    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
        children = new ArrayList<FamilyMember>();
    }
    
    public String toString() {
        return "[ Name: " + name + " Age: " + age + " ]";
    }

    public List<FamilyMember> getChildren() {
        return children;
    }
    
    public void addChild(FamilyMember m) {
        children.add(m);
    }

    public List<FamilyMember> getAll() {
        List<FamilyMember> peeps = new ArrayList<>();
        peeps.add(this);
        for(FamilyMember m : getChildren()) {
            peeps.addAll(m.getAll());
        }
        return peeps;
    }

    public List<FamilyMember> getAllChildren() {
        List<FamilyMember> children = new ArrayList<FamilyMember>();
        if(this.getChildren().size() == 0) {
            children.add(this);
        }
        else {   
            for(int i = 0; i < this.getChildren().size(); i++) {
                children.addAll(this.getChildren().get(i).getAllChildren());
            }
        }
        return children;
    }
    
    public List<FamilyMember> getAllParents() {
        List<FamilyMember> parents = new ArrayList<FamilyMember>();
        if(this.getChildren().size() > 0) {
            parents.add(this);
            for(int i = 0; i < this.getChildren().size(); i++) {
                parents.addAll(this.getChildren().get(i).getAllParents());
            }
        }
        return parents;
    }

}
