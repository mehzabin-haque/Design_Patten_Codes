package Composite;

// Composite class
import java.util.ArrayList;
import java.util.List;

public class Family implements FamilyMember {
    private String name;
    private List<FamilyMember> members = new ArrayList<>();

    public Family(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("I am the " + name + " family.");
        for (FamilyMember member : members) {
            member.introduce();
        }
    }

    public void addMember(FamilyMember member) {
        members.add(member);
    }

    public void removeMember(FamilyMember member) {
        members.remove(member);
    }

    public FamilyMember getMember(int index) {
        return members.get(index);
    }
}
