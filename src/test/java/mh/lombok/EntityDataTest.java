package mh.lombok;

import org.junit.Test;

public class EntityDataTest {

    @Test
    public void testData() throws Exception {
        EntityData entity = new EntityData(1, "marek");
        entity.setNumberOfFriends(100);

        System.out.println(entity);
    }

}
