package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    int[] array = {5, 4, -7, -2, -1};

        System.out.print("reversed array:  ");
        for (int l = array.length; l > 0; l--)
        {
            System.out.print(array[l-1] + "  ");
        }
    }
}
