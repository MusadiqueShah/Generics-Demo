
import java.util.Objects;


public class Test<T> 
{
    private T t;
    
    public T get()
    {
        return t;
    }

    public void set(T t)
    {
        this.t=t;
    }
}