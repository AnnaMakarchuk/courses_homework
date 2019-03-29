import com.epam.Car;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class CarTest {

    private Car car1;
    private Car car2;

    @Before
    public void setUp(){
        car1 = new Car("Volvo", 2.5, 2008);
        car2 = new Car("Toyota", 1.4, 2010);
    }

    @Test
    public void shouldCheckNull(){
        assertThat(car1, notNullValue());
    }

    @Test
    public void shouldCheckClass(){
        assertThat(car1, instanceOf(Car.class));
    }

    @Test
    public void shouldCheckVolvo() {
        assertThat(car1.getName(), equalTo("Volvo"));
    }




}
