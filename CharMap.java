/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fangen_zad4;

/**
 *
 * @author damian
 */

//http://www.javaproblems.com/2012/11/java-problem-g-triangles-shape.html

public class CharMap 
{
    private char[][] map = new char[400][400]; //<-200; 200> 
    
    public char[][] getMap() 
    {
	return map;
    }
    
    public CharMap(char x, char dot) 
    {
	for (int i = 0; i < map.length / 2; i++) 
        {
            for (int j = 0; j < map[i].length; j++) 
            {
		if (j <= i || (j >= map.length / 2 && j < map.length - i)) 
                {
                    map[i][j] = x;
                    //map[i][j] = dot;
                    //map[map.length - i][map.length - j] = x;
                    map[map.length - i - 1][map.length - j - 1] = x;
		} 
                else
                {
                    //map[i][j] = x;
                    map[i][j] = dot;
                    //map[map.length - i][map.length - j] = dot;
                    map[map.length - i - 1][map.length - j - 1] = dot;
                }
            }
	}
    }  
}
