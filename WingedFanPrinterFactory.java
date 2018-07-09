/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fangen_zad4;

//source: mail
public class WingedFanPrinterFactory 
{
    public static IWingedFanPrinter getWingedFanPrinter(EFanPrinterType type) 
    {
        IWingPainter painter = WingPainterFactory.getWingPainter(EWingType.AsteriskTriangle);
        CharMap wingMap = painter.GetWingMap();
        if (type == EFanPrinterType.QuadrupleSymmetry) return new WingedFanPrinterQuadrupleSymmetry(wingMap);
	throw new IllegalArgumentException("Illegal FanPrinterType: " + type);
    }
}
