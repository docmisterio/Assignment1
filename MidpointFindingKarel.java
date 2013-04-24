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
	 * pre-condition: Karel is facing east at 1x1 post-condition: Karel is
	 * facing east has laid out a row of beepers behind him and has ended up at
	 * the west end of the world
	 */
	private void layALine() {
		move();
		while (frontIsClear()) {
			putBeeper();
			move();
		}

	}

	/*
	 * precondition: Karel has just finished laying beepers out behind him is
	 * facing east or west. postcondition: started to ask if he's on a Beeper.
	 */
	private void moveToBeeper() {
		while (noBeepersPresent()) {
			move();

		}
	}

	/*
	 * Precondition: Karel will start on a Beeper facing either east or west
	 * Postcondition: Karel will be facing the direction that he started on the
	 * opposite side ready to turnAround.
	 */
	private void pickAndMoveToEnd() {
		pickBeeper();
		move();
		while (beepersPresent()) { //the problem is here... 
			move();
		}
	}
}
