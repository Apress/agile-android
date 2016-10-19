package riis.mockitowebapplicationsolution;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TowerRetrieverTest {
    private static final String SUCCESS_STRING = "success";

    @Test
    public void towerRetrievalTest()
    {
        //TODO Use Mockito to initialize the WebService
        TowerRetriever towerRetriever = Mockito.mock(TowerRetriever.class);

        //TODO Use Mockito to declare the return value as SUCCESS_STRING
        Mockito.when(towerRetriever.send("0", "0", "0")).thenReturn(SUCCESS_STRING);
        
        //TODO Test
        Assert.assertEquals(SUCCESS_STRING, towerRetriever.send("0", "0", "0"));
    }
}