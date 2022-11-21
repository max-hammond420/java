import java.util.List;
import java.util.ArrayList;

public class FamilyMemberTest{

    public static void main(String[] args){

        FamilyMember jeremy = new FamilyMember("Jeremy", 60);
        FamilyMember meredith = new FamilyMember("Meredith", 35);
        FamilyMember sarah = new FamilyMember("Sarah", 45);
        FamilyMember kelly = new FamilyMember("Kelly", 18);
        FamilyMember james = new FamilyMember("James", 26);
        FamilyMember fred = new FamilyMember("Fred", 20);
        FamilyMember david = new FamilyMember("David", 3);
        FamilyMember fiona = new FamilyMember("Fiona", 1);
        
        jeremy.addChild(meredith);
        jeremy.addChild(sarah);
        meredith.addChild(kelly);
        sarah.addChild(james);
        sarah.addChild(fred);
        james.addChild(david);
        james.addChild(fiona);

        
        System.out.println("\nAll Family Members");
        List<FamilyMember> members = jeremy.getAll();
        for(FamilyMember m : members)
            System.out.println(m);
        
        System.out.println("\nChildren");
        List<FamilyMember> children = jeremy.getAllChildren();
        for(FamilyMember m : children)
            System.out.println(m);
        
        System.out.println("\nParents");
        List<FamilyMember> parents = jeremy.getAllParents();
        for(FamilyMember m : parents)
            System.out.println(m);
    }
}
