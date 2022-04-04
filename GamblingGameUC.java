package com.bridgelabz;

import java.util.Random;

public class GamblingGameUC {
		public static void main(String[] args) {
			
			//To check whether Gambler is in winning or Loosing
			
				int stack = 100, win = 0, loss = 0, bet = 1;
				
				while(stack > 0 && stack <=100) {
					Random play = new Random();
					int check = play.nextInt();
					
					if(check == 0) {
						 stack = stack + bet;
						 win = win + 1;
					}
					else {
						stack = stack - bet;
						loss = loss + 1;
						
					}
				}
				if (stack > 100) {
					System.out.println("The Gambler has won per $1 ");	
				}
				else
				{
					System.out.println("The Gambler is loosing his stack");
				}
			}
		}	
				
				
				