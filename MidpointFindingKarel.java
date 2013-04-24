/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		findMiddle();
	}

	/*
	 * precondition: Karel starts at 1x1 facing east postcondition: Karel has
	 * found the middle of the world and is standing there
	 */
	private void findMiddle() {
		layALine();
		while (notFacingNorth()) {
			turnAround();
			moveToBeeper();
			pickAndMoveToEnd();
		}
		turnAround();
	}

	/*
	 * Pre-Condition: Karel is facing east with an empty world
	 * Post-Condition: Karel is facing east with a line of beepers layed out behind him
	 * Ready to turnAround. 
	 */
	private void layALine() {
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();

	}

	/*
	 * 
	 */
	private void moveToBeeper() {
		
	}

	/*
	 * 
	 */
	private void pickAndMoveToEnd() {
		
	}
}
