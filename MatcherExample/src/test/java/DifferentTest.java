import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.IsEqual.equalTo;

public class DifferentTest {

    private List<String > list;

    @Before
    public void setUp(){
        list = new ArrayList();
        list.add("swim");
        list.add("dance");
        list.add("laught");
        list.add("walk");
    }

    @Test
    public void checkElement(){
        assertThat (list.get(0), anyOf(containsString("s")));
    }

    @Test
    public void checkList(){
        assertThat(list.size(), greaterThan(0));
    }
}
