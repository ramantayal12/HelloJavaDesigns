package com.learn.java.collections.queue;


import java.util.*;

class Coordinate{

    int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        Coordinate oth = (Coordinate) o;
        return this.x == oth.x && this.y == oth.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}

enum Directions{
    U,
    D,
    R,
    L;
}

class SnakeGame {

    Deque<Coordinate> cors = new ArrayDeque<>();
    int[][] board;
    int[][] food;
    Coordinate last;
    int n, m;
    HashSet<Coordinate> points = new HashSet<>();
    int i = 0;
    public SnakeGame(int width, int height, int[][] food) {
        board = new int[height][width];
        n = height;
        m = width;
        this.food = food;

        last = new Coordinate(0, 0);
        points.add(last);
        cors.add(last);
    }

    public int move(String direction) {

        int x = last.x, y = last.y;

        switch (Directions.valueOf(direction)){
            case U -> x--;
            case D -> x++;
            case R -> y++;
            case L -> y--;
        };

        if( x<0 || x>=n || y<0 || y>=m ) return -1;


        Coordinate next = new Coordinate(x, y);
        if( points.contains(next) && !next.equals(cors.peek())) return -1;

        if( i<food.length && food[i][0] == x && food[i][1] == y ){
            i++;
        }
        else{
            points.remove(cors.peek());
            cors.pollFirst();
        }

        cors.add(next);
        points.add(next);
        last = next;

        return cors.size()-1;

    }
}


/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */
/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */

public class Queues {
}
