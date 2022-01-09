import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StringChangerTest {

    @Test
    public void ShowTheReturnValue1(){

        StringChanger stringChanger = new StringChanger("ITCLiNicAl");
        String changedString = stringChanger.stringUpperCase(1);

        Assertions.assertEquals("ITCLNA", changedString);
    }

    @Test
    public void ShowTheReturnValue2(){

        StringChanger stringChanger = new StringChanger("ITCLiNicAl");
        String changedString = stringChanger.stringUpperCase(2);

        Assertions.assertEquals("TLN", changedString);
    }

    @Test
    public void ShowTheReturnValue3(){

        StringChanger stringChanger = new StringChanger("ITCLiNicAl");
        String changedString = stringChanger.stringUpperCase(3);

        Assertions.assertEquals("CNA", changedString);
    }

    @Test
    public void ShowTheSplitString(){

        StringChanger stringChanger = new StringChanger("ITCLi NicAl");
        String changedString = stringChanger.stringUpperCase(1);

        Assertions.assertEquals("ITCLNA", changedString);
    }
}
