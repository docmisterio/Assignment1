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
		while (frontIsClear()) {
			if (leftIsClear()) {
				makeARow();
				checkCeilingAndMoveForWest();
				makeARow();
				checkCeilingAndMoveForEast();
				makeARow();
			} else {
				turnAround();
			}
		}
	}
	
	
	private void makeARow() {
		while (frontIsClear()){
			move();
			putBeeper();
			if (frontIsClear()){
				move();
			}
		}

	}
	
	private void checkCeilingAndMoveForWest() {
		turnLeft();
		if (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	private void checkCeilingAndMoveForEast() {
		turnRight();
		if (frontIsClear()) {
			move();
		}
		turnRight();
	}
}

