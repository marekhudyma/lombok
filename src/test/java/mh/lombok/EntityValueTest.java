package mh.lombok;

import org.junit.Test;

public class EntityValueTest {

    @Test
    public void testValue() throws Exception {
        EntityValue entity = EntityValue.of(1, "Marek", 123);
        entity.getId();
        System.out.println(entity);
    }

}
