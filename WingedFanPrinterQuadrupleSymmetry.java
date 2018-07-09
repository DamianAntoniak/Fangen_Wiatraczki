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
public class WingedFanPrinterQuadrupleSymmetry implements IWingedFanPrinter 
{
    private char[][] map;
 
    public WingedFanPrinterQuadrupleSymmetry(CharMap x) 
    {
	map = x.getMap();
    }
 
    @Override
    public void printFan(int s, EFanDirection direction) 
    {
        if (direction == EFanDirection.Clockwise) printClockwise(s);
        if (direction == EFanDirection.CounterClockwise) printCounterClockwise(s);
        System.out.println();
    }
 
    private void printClockwise(int s) 
    {
	for (int i = map.length / 2 - s; i < map.length / 2 + s; i++) 
        {
            for (int j = map.length / 2 + s - 1; j > map.length / 2 - s - 1; j--) System.out.print(map[i][j]);
            System.out.println();
	}
    }
 
    private void printCounterClockwise(int s) 
    {
	for (int i = map.length / 2 - s; i < map.length / 2 + s; i++) 
        {
            for (int j = map.length / 2 - s; j < map.length / 2 + s; j++) System.out.print(map[i][j]);
            System.out.println();
	}
    }
}
