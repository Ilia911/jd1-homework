package by.htp.homework.basic;

import java.util.Scanner;

public class LoopTaskSix {

	public static void main(String[] args) {

		// Вывести на экран соответсвия между символами и их численными обозначениями в
		// памяти компьютера
		
		System.out.println("simbol - Acii" );
        for (int i = 1; i <= 255; i++) {
            char ch = (char) i;
            System.out.println("   " +ch + "  =  " + i );
        }

	}
	

}
