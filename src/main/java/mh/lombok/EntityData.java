package mh.lombok;


import lombok.Data;

@Data
//A shortcut for:
// @ToString,
// @EqualsAndHashCode,
// @Getter on all fields,
// @Setter on all non-final fields,
// @RequiredArgsConstructor
public class EntityData {

    private final int id;
    private final String name;
    private int numberOfFriends;

}
