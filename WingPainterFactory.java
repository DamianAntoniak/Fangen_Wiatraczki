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
public class WingPainterFactory 
{
    public static IWingPainter getWingPainter(EWingType wingType) 
    {
        if (wingType == EWingType.AsteriskTriangle) return new WingPainterAsterisk();
	throw new IllegalArgumentException("Illegal WingType: " + wingType);
    }
}
