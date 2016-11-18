package mh.lombok;

import org.junit.Test;

import java.util.HashSet;

public class EntityBuilderTest {

    @Test
    public void testBuilder() throws Exception {
        EntityBuilder entity = new EntityBuilder(1, "Marek", new HashSet<>());
        EntityBuilder entity2 = EntityBuilder.builder().id(1).name("Marek").build();
    }

}
