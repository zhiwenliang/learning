package java.learning;

import com.example.concurrent.learning.Thread1;
import com.example.concurrent.learning.Thread2;
import com.example.concurrent.learning.Thread3;
import org.junit.jupiter.api.Test;

import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ApplicationTest {

    @Test
    public void testThread() {
        Thread thread1 = new Thread1();
        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        FutureTask<String> futureTask = new FutureTask<>(new Thread3());
        Thread thread3 = new Thread(futureTask);
        thread3.start();

        ThreadPoolExecutor pool = new ThreadPoolExecutor(8, 8, 60 * 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        pool.execute(new Thread1());
        System.out.println("asd");
    }
}
