package Finder;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Заполняются группы
        MembersGroup groupOfDancer = RandomAddToGroup.addMembers("dancers", 12);
        MembersGroup groupOfSingers = RandomAddToGroup.addMembers("singers", 7);
        MembersGroup groupOfActors = RandomAddToGroup.addMembers("actors", 15);

        //Список групп
        List<MembersGroup> membersGroups = new LinkedList<>();
        membersGroups.add(groupOfDancer);
        membersGroups.add(groupOfSingers);
        membersGroups.add(groupOfActors);

        //Вывод содержимого групп
        System.out.println(groupOfDancer);
        System.out.println(groupOfSingers);
        System.out.println(groupOfActors);

        //Далее вывод результатов двух типов Finder.Finder
        Finder forEachFinder = new ForEachFinder();
        System.out.println("Finder.ForEachFinder: ");
        System.out.println(forEachFinder.findOldMembers(membersGroups, 35));

        Finder streamFinder = new StreamFinder();
        System.out.println("Finder.StreamFinder: ");
        System.out.println(streamFinder.findOldMembers(membersGroups, 35));

    }
}
