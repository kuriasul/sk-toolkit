import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author skjv2014@163.com
 * @since 2022-08-11 00:33:44
 */
public class ApiTest {

    @Test
    public void test() throws InterruptedException {
        CompletableFuture<Runnable> completableFuture = new CompletableFuture<>();
        boolean aa = completableFuture.complete(() -> {
            System.out.println("aa");
        });

        Thread.sleep(5000);
    }

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Runnable> completableFuture = new CompletableFuture<>();
        completableFuture.thenAccept(runnable -> {
            System.out.println("aa");
        });
        completableFuture.complete(() -> {

        });
    }
}
