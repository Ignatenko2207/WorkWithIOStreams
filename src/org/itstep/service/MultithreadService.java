package org.itstep.service;

import org.itstep.entity.ConnectionEntity;
import org.itstep.entity.MultithreadWriteService;
import org.itstep.util.Randomizer;

public class MultithreadService extends Thread{

	private final String threadName;
	
	public MultithreadService(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5 ; i++) {
			MultithreadWriteService writeService = new MultithreadWriteService();
			writeService.run();
		}
		
	}
}
