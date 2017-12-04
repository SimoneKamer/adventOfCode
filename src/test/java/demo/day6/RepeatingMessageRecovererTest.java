package demo.day6;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RepeatingMessageRecovererTest {

    RepeatingMessageRecoverer recoverer = new RepeatingMessageRecoverer();

    @Test
    public void ItShouldRecoverEaster() throws Exception {
        String message = "eedadn\n" +
                "drvtee\n" +
                "eandsr\n" +
                "raavrd\n" +
                "atevrs\n" +
                "tsrnev\n" +
                "sdttsa\n" +
                "rasrtv\n" +
                "nssdts\n" +
                "ntnada\n" +
                "svetve\n" +
                "tesnvt\n" +
                "vntsnd\n" +
                "vrdear\n" +
                "dvrsen\n" +
                "enarar";
        assertThat(recoverer.recoverMessage(message), is("easter"));
    }


}