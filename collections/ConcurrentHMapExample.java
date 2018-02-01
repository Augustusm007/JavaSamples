package collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ConcurrentHMapExample {

	static Map <String,Long> Orders = new ConcurrentHashMap<>(); 
	
	public static void main(String[] args) {
    
		Orders.put("Hyd", 0l);
		Orders.put("Bombay", 0l);
		Orders.put("Chicago", 0l);
		Orders.put("Boston", 0l);
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(ConcurrentHMapExample::ProcessOrders);
		service.submit(ConcurrentHMapExample::ProcessOrders);
	}

}
