// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

import java.beans.Introspector;

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int minx = grid.length + 2, miny = grid[0].length + 2, maxx = -1, maxy = -1;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j =  0 ; j < grid[0].length ; j++) {
                if (grid[i][j] == ch) {
                    minx = Math.min(minx, i);
                    miny = Math.min(miny, j);
                    maxx = Math.max(maxx, i);
                    maxy = Math.max(maxy, j);
                }
            }
        }

        int area = ((maxx - minx + 1) * (maxy - miny + 1));
		return area; // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
        int ans = 0;
        for (int i = 0; i <  grid.length; i++) {
            for (int j = 0; j <  grid[0].length; j++) {
                if (grid[i][j] == ' ') {
                    continue;
                } else {
                    int cnt = -1;
                    int cnt2 = -1;
                    int index = i;
                    while (index < grid.length && grid[index][j] == grid[i][j]) {
                        cnt++;
                        index++;
                    }
                    index = i;
                    while (index > -1 && grid[index][j] == grid[i][j]) {
                        cnt++;
                        index--;
                    }
                    index = j;
                    while (index > -1 && grid[i][index] == grid[i][j]) {
                        cnt2++;
                        index--;
                    }
                    index = j;
                    while (index < grid[0].length && grid[i][index] == grid[i][j]) {
                        cnt2++;
                        index++;
                    }
                    if (cnt == cnt2 && cnt > 1) {
                        ans ++;
                    }
                }
            }
        }
		return ans; // YOUR CODE HERE
	}
	
}
