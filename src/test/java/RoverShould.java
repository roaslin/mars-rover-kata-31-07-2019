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
    public void rotate_left_once(String command, String position) {

        assertThat(rover.execute(command), is(position));
    }
}
