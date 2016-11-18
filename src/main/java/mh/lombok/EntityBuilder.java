package mh.lombok;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;

import java.util.Set;

@Builder
public class EntityBuilder {

    private final int id;

    @NonNull
    private String name;

    @Singular
    private Set<String> friends;

}
