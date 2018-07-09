/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fangen_zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author damian
 */
public class FanInput 
{
    private List<Integer> listFan = new ArrayList<Integer>();
    private int i;
    public List<Integer> fanInput() 
    {
        Scanner scanner = new Scanner(System.in);
	
        while (true) 
        {
            i = scanner.nextInt();
            if(i == 0) break; //z polecenia "0 zaprzestaje dzialania"
            listFan.add(i);
        }
        return listFan;
    }
}
