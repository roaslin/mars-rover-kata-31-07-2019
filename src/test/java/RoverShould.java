import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RoverShould {


    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover();
    }

    @Test
    @Parameters({"L,0:0:W"
            , "LL,0:0:S"
            , "LLL,0:0:E"
            , "LLLL,0:0:N"
    })
    public void rotate_left(String command, String position) {

        assertThat(rover.execute(command), is(position));
    }

    @Test
    @Parameters({
            "R,0:0:E"
            , "RR,0:0:S"
            , "RRR,0:0:W"
            , "RRRR,0:0:N"
    })
    public void rotate_right(String command, String position) {

        assertThat(rover.execute(command), is(position));
    }

    @Test
    @Parameters({
            "M,1:0:N"
            , "MM,2:0:N"
            , "MMM,3:0:N"
            , "MMM,3:0:N"
    })
    public void move(String command, String position) {

        assertThat(rover.execute(command), is(position));
    }


    @Test
    @Parameters({
            "M,0:-1:S"
            , "MM,0:-2:S"
            , "MMM,0:-3:S"
    })
    public void move_south(String command, String position) {

        rover = new Rover(Direction.SOUTH);

        assertThat(rover.execute(command), is(position));
    }
}
