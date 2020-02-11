package Finder;

import java.util.LinkedList;
import java.util.List;
public class ForEachFinder implements Finder{

    @Override
    public List<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        List<String> groupsNames = new LinkedList<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }
}