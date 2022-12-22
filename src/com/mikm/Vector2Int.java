package com.src.com.mikm;

class Vector2Int {
    int x;
    int y;
    Vector2Int(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Vector2Int() {
        x = 0;
        y = 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
