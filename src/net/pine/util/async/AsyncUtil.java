package net.pine.util.async;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AsyncUtil {
	
	private static final ThreadPoolExecutor THREAD_POOL = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue<>());
	
	public static void runAsync(Runnable runnable) {
		THREAD_POOL.execute(runnable);
	}
	
}
