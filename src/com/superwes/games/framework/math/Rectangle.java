package com.superwes.games.framework.math;

public class Rectangle {
    public float width, height;
	public float x;
	public float y;
    
    public Rectangle(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public boolean containsVector(Vector2 vector)
    {
    	return x < vector.x && (x + width) > vector.x && y < vector.y && (y + height) > vector.y;
    }
}
