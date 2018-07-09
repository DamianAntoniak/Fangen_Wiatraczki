/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fangen_zad4;

/**
 *
 * @author damia
 */
public class WingPainterAsterisk implements IWingPainter 
{
    @Override
    public CharMap GetWingMap() 
    {
        return new CharMap('*', '.');
    }
}
