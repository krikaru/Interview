package Finder;

import java.util.List;

public interface Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */

    //Заменила Set на List, т.к. в Set не может быть повторов, а имена Finder.Member-ов могут быть одинаковыми.
    //В данном случае в методе Finder.RandomAddToGroup.addMembers обеспечивается уникальность имен, поэтому можно было бы оставить и Set.
    List<String> findOldMembers(List<MembersGroup> groups, int targetAge);
}
