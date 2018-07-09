/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fangen_zad4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author damian
 */
public class Fangen_zad4 
{

    public static void main(String[] args) throws java.lang.Exception 
    {
        IWingedFanPrinter fanPrinter = WingedFanPrinterFactory.getWingedFanPrinter(EFanPrinterType.QuadrupleSymmetry);
        
	List<Integer> fans = new ArrayList<>();
        FanInput fan = new FanInput();
        fans = fan.fanInput();
        
        for(Integer f : fans)
        {
            if (f > 0) fanPrinter.printFan(f, EFanDirection.CounterClockwise);
            else fanPrinter.printFan(Math.abs(f), EFanDirection.Clockwise);
        }
    }
    
}
