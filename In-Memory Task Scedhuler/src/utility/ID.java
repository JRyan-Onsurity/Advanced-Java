package utility;

import java.util.concurrent.atomic.AtomicInteger;

public class ID
{
    private static AtomicInteger id=new AtomicInteger(0);
    public static Integer getId(){
        return id.incrementAndGet();
    }
}
