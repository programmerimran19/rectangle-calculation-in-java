/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Programmer Imran
 */
public class Rectangle {
    
    
    private int width, height;
    public int result;

    public void setResult(int width, int height)
    {
        this.width = width;
        this.result = height;
        result = width * height;
    }
    
    
    public int Result()
    {
        return result;
    }
    
    
}
