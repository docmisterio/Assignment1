/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while (leftIsClear()) {
			putBeeper();
			moveWell();
			moveWell();
		}
//		while (frontIsClear()) {
//			putBeeper();
//			moveWell();
//			moveWell();
//		}
		
	}

	private void moveWell() {
		if (frontIsClear()) {
			move();
		} else {
			if (facingEast()) {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
				}
				
			} else if (facingWest()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
				}
			} else if (facingNorth()) {
				turnAround();
			} else if (facingSouth()) {
				turnAround();
			}
			
		}
	}
}