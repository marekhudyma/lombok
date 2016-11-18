package mh.lombok;

import org.junit.Test;

public class EntityGetterSetterTest {

    @Test
    public void testEntityGetterSetter() throws Exception {
        EntityGetterSetter entity = new EntityGetterSetter();
        entity.setId(1);
        //entity.setName("Marek"); doesn't exist
        entity.setNumberOfFriends(100);

        System.out.println(entity);
    }

}
