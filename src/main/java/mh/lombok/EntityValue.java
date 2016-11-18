package mh.lombok;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

@Value(staticConstructor = "of")
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public class EntityValue {

    private final int id;
    private final String name;

    @Wither(AccessLevel.PACKAGE)
    @NonFinal
    private int numberOfFriends;

}
