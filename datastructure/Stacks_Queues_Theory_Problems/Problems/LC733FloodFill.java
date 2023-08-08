package Problems;

import java.util.Arrays;
    //https://leetcode.com/problems/flood-fill/solutions/3882266/beat-100-runtime-dfs-java-explained/
public class LC733FloodFill {
    public static void main(String[] args) {
        int[][] img = {
                {1,1,1}, {1,1,0}, {1,0,1}
        };

        System.out.println(Arrays.toString(floodFill(img, 1, 1, 2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorIdentifier = image[sr][sc];

        return floodFinder(image, sr, sc, color, colorIdentifier);
    }

    public static int[][] floodFinder(int[][] image, int sr, int sc, int color, int colorIdentifier) {
        image[sr][sc] = color;

        if (sr - 1 >= 0 && image[sr -1][sc] != color && image[sr - 1][sc] == colorIdentifier) floodFinder(image, sr - 1, sc, color, colorIdentifier); // going up
        if (sr + 1 < image.length && image[sr + 1][sc] != color && image[sr + 1][sc] == colorIdentifier) floodFinder(image, sr + 1, sc, color, colorIdentifier); // going down
        if (sc - 1 >= 0 && image[sr][sc - 1] != color && image[sr][sc - 1] == colorIdentifier) floodFinder(image, sr, sc - 1, color, colorIdentifier);   // going left
        if (sc + 1 < image[0].length && image[sr][sc + 1] != color && image[sr][sc + 1] == colorIdentifier) floodFinder(image, sr, sc + 1, color, colorIdentifier);  //going right

        return image;
    }
}
