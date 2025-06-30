package interactiontest;

import interaction.ExternalApi;
import interaction.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class); // Step 1
        MyService service = new MyService(mockApi);    // Step 2
        service.fetchData();                           // Step 3
        verify(mockApi).getData();                     // Step 4
    }
}
