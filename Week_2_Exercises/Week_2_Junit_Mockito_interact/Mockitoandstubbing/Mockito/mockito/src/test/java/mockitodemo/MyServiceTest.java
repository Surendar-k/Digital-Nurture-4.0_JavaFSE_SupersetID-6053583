
package mockitodemo;


import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        
        MyService service = new MyService(mockApi);

        String result = service.fetchData();


        assertEquals("Mock Data", result);
    }
}