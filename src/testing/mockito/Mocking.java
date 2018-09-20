package testing.mockito;

public class Mocking {

    private MockInterface anInterface;

    public void mockitoExample(int code) {
        anInterface.errorMessage(code);
    }

    public String getErrorMessage(int code) {
        return anInterface.errorMessage(code);
    }

}
