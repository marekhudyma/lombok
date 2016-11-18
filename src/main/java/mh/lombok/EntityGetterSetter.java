package mh.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class EntityGetterSetter {

    @Getter @Setter
    private int id;

    @Getter
    private String name;

    @Setter(AccessLevel.PROTECTED)
    private int numberOfFriends;

}
