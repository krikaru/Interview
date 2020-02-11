package Finder;

import java.util.LinkedList;
import java.util.List;

public class RandomAddToGroup {

    private static int numOfMember = 0;

    /**
     * Добавляет определенное количество рандомных Finder.Member в группу
     *
     * @param groupName имя группы
     * @param countOfMember количество добавляемых Finder.Member
     * @return список группы
     */
    public static MembersGroup addMembers(String groupName, int countOfMember){
        List<Member> members = new LinkedList<>();
        MembersGroup group = new MembersGroup(groupName, members);

        for (int i = 0; i < countOfMember; i++){
            members.add(new Member("Finder.Member" + numOfMember++, (int)(Math.random() * 33 + 18)));
        }
        return group;
    }
}
