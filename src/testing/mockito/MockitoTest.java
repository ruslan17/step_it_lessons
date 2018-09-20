package testing.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @Mock
    private MockInterface anInterface;

    @InjectMocks
    private Mocking mocking;

    @Test
    public void testMockingExample() {
//        when(anInterface.errorMessage(1)).thenReturn("ERROR");

        mocking.mockitoExample(1);
        verify(anInterface).errorMessage(1);
    }

    @Test
    public void testMockingExample2() {
        when(anInterface.errorMessage(1)).thenReturn("ERROR");

        String m = mocking.getErrorMessage(1);
        assertEquals("ERROR", m);

    }

}
