package com.superwes.games.framework;

import com.superwes.games.framework.Input.TouchEvent;

public class BoundsHelper {
	public static boolean inBounds(TouchEvent event, int x, int y, int width,
			int height) {
		if (event.x > x && event.x < x + width - 1 && event.y > y
				&& event.y < y + height - 1)
			return true;
		else
			return false;
	}
}
