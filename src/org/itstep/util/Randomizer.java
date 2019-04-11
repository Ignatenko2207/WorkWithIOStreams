package org.itstep.util;

import java.util.Random;

public class Randomizer {

	public static int getNumber(int min, int max) {
		return min + (new Random().nextInt(max - min));
	}
}
