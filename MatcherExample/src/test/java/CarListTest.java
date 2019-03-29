import com.epam.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CarListTest {

    private List<Car> cars;

    @Before
    public void setUp(){
        cars = new ArrayList<>();
        cars.add(new Car("Volvo", 2.5, 2008));
        cars.add(new Car("Toyota", 1.4, 2010));
    }

    @Test
    public void shouldCheckNull(){
        assertThat(cars, notNullValue());
    }

    @Test
    public void shouldHaveSize (){
        assertThat(cars.size(), not(equalTo(3)));
    }

    @Test
    public void shouldCheckListClass (){
        assertThat(cars, instanceOf(List.class));
    }


}
