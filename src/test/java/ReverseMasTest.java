import com.mmuzhev.massive.reverse.ReverseMas;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by mikhail on 16.04.16.
 */
public class ReverseMasTest {

    @Test
    public void testInvert() {
        ReverseMas<Integer> reverseMas = new ReverseMas<Integer>();
        Integer[] s = new Integer[100];
        Integer[] b = new Integer[100];
        for (int i = 0; i < 100; i++) {
            s[i] = i;
            b[i] = s[i];
        }

        s = reverseMas.invert(s);
        int count = 0;

        for (int i = 0; i < 100; i++) {
            if (b[i] == s[99 - i]) {
                count++;
            }
        }
        assertEquals(100, count);
    }
}