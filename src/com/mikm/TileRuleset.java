package com.mikm;

import java.util.Arrays;

class TileRuleset {
    CellPresence[][] array;
    boolean flippedHorizontally = false;
    boolean flippedVertically = false;
    int rotation = 0;

    TileRuleset(CellPresence[][] tileRuleset) {
        if (tileRuleset.length != 3 || tileRuleset[0].length != 3) {
            throw new ExceptionInInitializerError("Tile Rulesets must be 3x3");
        }
        array = tileRuleset;
    }

    TileRuleset(CellPresence topLeft, CellPresence top, CellPresence topRight,
                       CellPresence left, CellPresence middle, CellPresence right,
                       CellPresence bottomLeft, CellPresence bottom, CellPresence bottomRight) {
        array = new CellPresence[3][3];
        array[2][0] = topLeft;
        array[2][1] = top;
        array[2][2] = topRight;

        array[1][0] = left;
        array[1][1] = middle;
        array[1][2] = right;

        array[0][0] = bottomLeft;
        array[0][1] = bottom;
        array[0][2] = bottomRight;
    }

    boolean fits(TileRuleset comparisonRuleset) {
        CellPresence[][] comparison = comparisonRuleset.array;
        for (int y = 2; y >= 0; y--) {
            for (int x = 0; x < 3; x++) {
                if (array[y][x] == CellPresence.Full && comparison[y][x] == CellPresence.Empty) {
                    return false;
                }
                if (array[y][x] == CellPresence.Empty && comparison[y][x] == CellPresence.Full) {
                    return false;
                }
            }
        }
        return true;
    }

    void print() {
        for (int y = 2; y >= 0; y--) {
            System.out.println(Arrays.toString(array[y]));
        }
    }
}

enum CellPresence {
    Empty, Full, Either
}

