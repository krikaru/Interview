package Finder;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFinder implements Finder{

    @Override
    public List<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        return groups.stream()
                .flatMap(membersGroup -> membersGroup.getMembers().stream()
                .filter(member -> member.getAge() > targetAge))
                .map(membersName -> membersName.getName())
                .collect(Collectors.toList());
    }
}
