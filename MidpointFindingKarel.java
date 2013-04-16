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
		collectBeepers();
	}

	/*
	 * pre-condition: Karel is facing east at 1x1 post-condition: Karel is
	 * facing east has laid out a row of beepers behind him and has ended up at
	 * the end of the world
	 */
	private void layALine() {
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
	}

	/*
	 * precondition: Karel has just finished laying beepers out behind him is
	 * facing east postcondition: Karel has turned around and started to ask if
	 * he's on a Beeper and if he is to pick it
	 */
	private void collectBeepers() {
		turnAround();
		ifBeeperPickIt();
	}

	/*
	 * precondition:
	 */
	private void ifBeeperPickIt() {
		if (beepersPresent()) {
			pickBeeper();
			moveToLastBeeper();
		}
	}
	
	private void moveToLastBeeper() {
		while (beepersPresent()) {
			move();
		}
	}

}
