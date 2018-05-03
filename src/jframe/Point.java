/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

public class Point {
    private int x,y;
    
    public Point(int x, int y){
        this.x =x;
        this.y =y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public int distance(Point p){
        return (int) Math.sqrt(Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }
}
