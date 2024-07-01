package com.fyznurk.code100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Points from given JSON dataset
        List<int[]> points = Arrays.asList(
                new int[]{480, 259}, new int[]{452, 21}, new int[]{389, 207}, new int[]{319, 261},
                new int[]{470, 65}, new int[]{259, 73}, new int[]{522, 279}, new int[]{406, 91},
                new int[]{296, 32}, new int[]{358, 206}, new int[]{106, 247}, new int[]{507, 254},
                new int[]{427, 265}, new int[]{259, 47}, new int[]{104, 209}, new int[]{478, 219},
                new int[]{388, 81}, new int[]{543, 166}, new int[]{58, 193}, new int[]{164, 247},
                new int[]{125, 269}, new int[]{42, 166}, new int[]{516, 207}, new int[]{367, 73},
                new int[]{303, 220}, new int[]{377, 70}, new int[]{348, 107}, new int[]{390, 254},
                new int[]{519, 135}, new int[]{128, 39}, new int[]{515, 119}, new int[]{277, 25},
                new int[]{376, 242}, new int[]{123, 147}, new int[]{110, 131}, new int[]{428, 132},
                new int[]{220, 89}, new int[]{20, 170}, new int[]{479, 258}, new int[]{240, 27},
                new int[]{75, 86}, new int[]{303, 225}, new int[]{246, 192}, new int[]{505, 196},
                new int[]{26, 221}, new int[]{133, 174}, new int[]{275, 154}, new int[]{458, 76},
                new int[]{423, 20}, new int[]{475, 148}, new int[]{528, 29}, new int[]{383, 57},
                new int[]{256, 90}, new int[]{196, 251}, new int[]{150, 279}, new int[]{475, 97},
                new int[]{173, 43}, new int[]{364, 80}, new int[]{15, 224}, new int[]{291, 282},
                new int[]{473, 40}, new int[]{505, 140}, new int[]{292, 126}, new int[]{359, 12},
                new int[]{330, 104}, new int[]{475, 62}, new int[]{588, 160}, new int[]{244, 142},
                new int[]{155, 267}, new int[]{153, 183}, new int[]{210, 145}, new int[]{344, 262},
                new int[]{410, 110}, new int[]{212, 109}, new int[]{153, 72}, new int[]{24, 219},
                new int[]{300, 223}, new int[]{174, 167}, new int[]{57, 287}, new int[]{15, 127},
                new int[]{554, 240}, new int[]{262, 280}, new int[]{498, 197}, new int[]{67, 118},
                new int[]{287, 236}, new int[]{69, 244}, new int[]{417, 114}, new int[]{423, 196},
                new int[]{82, 48}, new int[]{153, 269}, new int[]{223, 25}, new int[]{203, 42},
                new int[]{319, 169}, new int[]{439, 126}, new int[]{56, 87}, new int[]{85, 243},
                new int[]{29, 52}, new int[]{406, 282}, new int[]{67, 63}, new int[]{544, 111},
                new int[]{218, 251}, new int[]{341, 223}, new int[]{178, 41}, new int[]{440, 287},
                new int[]{170, 66}, new int[]{236, 14}, new int[]{32, 199}, new int[]{173, 105},
                new int[]{286, 43}, new int[]{158, 34}, new int[]{171, 217}, new int[]{376, 28},
                new int[]{189, 184}, new int[]{146, 254}, new int[]{11, 105}, new int[]{60, 101},
                new int[]{86, 208}, new int[]{549, 20}, new int[]{143, 53}, new int[]{336, 222},
                new int[]{377, 279}, new int[]{427, 144}, new int[]{391, 165}, new int[]{477, 16},
                new int[]{76, 29}, new int[]{175, 132}, new int[]{393, 40}, new int[]{104, 161},
                new int[]{51, 178}, new int[]{231, 120}, new int[]{322, 37}, new int[]{163, 90},
                new int[]{114, 156}, new int[]{503, 96}, new int[]{194, 235}, new int[]{342, 191},
                new int[]{391, 43}, new int[]{467, 30}, new int[]{136, 77}, new int[]{562, 215},
                new int[]{289, 145}, new int[]{100, 250}, new int[]{302, 196}, new int[]{75, 167},
                new int[]{508, 201}, new int[]{243, 217}, new int[]{269, 54}, new int[]{181, 232},
                new int[]{340, 35}, new int[]{197, 21}, new int[]{14, 165}, new int[]{232, 86},
                new int[]{113, 138}, new int[]{575, 228}, new int[]{114, 120}, new int[]{549, 32},
                new int[]{293, 289}, new int[]{456, 161}, new int[]{230, 165}, new int[]{426, 218},
                new int[]{275, 196}, new int[]{397, 276}, new int[]{316, 257}, new int[]{42, 127},
                new int[]{529, 177}, new int[]{366, 134}, new int[]{506, 106}, new int[]{241, 253},
                new int[]{408, 35}, new int[]{200, 249}, new int[]{390, 125}, new int[]{524, 85},
                new int[]{283, 33}, new int[]{242, 255}, new int[]{124, 135}, new int[]{505, 68},
                new int[]{539, 40}, new int[]{119, 72}, new int[]{25, 247}, new int[]{530, 134},
                new int[]{493, 254}, new int[]{580, 147}, new int[]{90, 220}, new int[]{562, 144},
                new int[]{541, 271}, new int[]{39, 253}, new int[]{414, 224}, new int[]{234, 104},
                new int[]{445, 263}
        );

        // list of points within the logo
        List<int[]> result = new ArrayList<>();

        // Count points within the logo
        int count = 0;
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            if (isWithinBoundaries(x, y) && isInLogo(x, y)) {
                count++;
                result.add(point);
            }
        }
        // Convert result to a string
        StringBuilder resultString = new StringBuilder();
        for (int[] point : result) {
            resultString.append(Arrays.toString(point)).append("\n");
        }
        System.out.println("Number of points in the logo: " + count);
        System.out.println(resultString);
    }

    // Function to check if a point is within given boundaries for the logo
    public static boolean isWithinBoundaries(int x, int y) {
        return y >= 75 && y <= 225 && x >= 145 && x <= 485;
    }

    // Function to check if a point is inside any of the logo parts
    public static boolean isInLogo(int x, int y) {
        return isWithinRectangle(x) || isWithinCircle(x, y, 250, 150) || isWithinCircle(x, y, 410, 150);
    }


    // Function to check if a point is within given boundaries for the "1"
    public static boolean isWithinRectangle(int x) {
        int xMin = 145;
        int xMax = 165;
        return xMin <= x && x <= xMax;
    }

    // Function to check if a point is within a circle - in 0s
    public static boolean isWithinCircle(int pointX, int pointY, int centerX, int centerY) {
        // Circle radius
        int innerRadius = 55;
        int outerRadius = 75;

        // Calculate distance from the center
        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

        // Check if the point is within the circle bounds
        return distance >= innerRadius && distance <= outerRadius;
    }
}