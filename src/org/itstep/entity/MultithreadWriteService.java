package org.itstep.entity;

import org.itstep.service.FileManagerService;
import org.itstep.util.Randomizer;

public class MultithreadWriteService implements Runnable{

	@Override
	public void run() {
	
		Long time = System.currentTimeMillis();
		Integer sessionId = Randomizer.getNumber(10000000, 99999999);
		String ip = Randomizer.getNumber(1, 255) + "."
					+ Randomizer.getNumber(1, 255) + "."
					+ Randomizer.getNumber(1, 255) + "."
					+ Randomizer.getNumber(1, 255);
		
		ConnectionEntity testConnectionEntity = new ConnectionEntity(time, sessionId, ip);
		FileManagerService.writeTextToFile(testConnectionEntity.toString(), true);
	}

}
