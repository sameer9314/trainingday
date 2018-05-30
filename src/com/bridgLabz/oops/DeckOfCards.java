package com.bridgLabz.oops;

import java.util.Random;

import com.bridgelabz.datastructure.MyLinkedList;

/**
 * Purpose : To print the suffled cards received by the 4 players.  
 * @author Sameer Saurabh
 * @version 1.0
 * @since 30/05/2018
 *
 */
public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
        String[] rank= {"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace" };
        int index=0;
        MyLinkedList[] cards=new MyLinkedList[52];
        for(int i=0;i<cards.length;i++)
        {
            cards[i]=new MyLinkedList();
        }
       
        for(int i=0;i<suit.length;i++)
        {
            for(int j=0;j<rank.length;j++)
            {               
                cards[index++].add((rank[j]+" "+suit[i]));
            }
        }
       
        Random rand=new Random();
        String[][]players= new String[4][9];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<9;j++)
            {
                int pos=rand.nextInt(51);
                if(!(cards[pos].isEmpty()))
                {
                    players[i][j]=(String)cards[pos].pop();
                }
                else
                {
                    j--;
                }
            }
        }
       
        MyLinkedList[] cardsArrangement=new MyLinkedList[4];
       
        for(int i=0;i<4;i++)
        {
            cardsArrangement[i]=new MyLinkedList();
            for(int j=0;j<9;j++)
            {
                cardsArrangement[i].addSort(players[i][j]);
            }
        }
       
        for(int i=0;i<4;i++)
        {  
            System.out.print("Player "+(i+1)+" cards---->  ");
            for(int j=0;j<9;j++)
            {
                System.out.print(players[i][j]+"   ");
            }
            System.out.println();
            System.out.println();
        }
System.out.println("***********************************************************************************************************************************");       

for(int i=0;i<4;i++)
        {  
            System.out.print("Player "+(i+1)+" cards----> ");
            for(int j=0;j<9;j++)
            {
                System.out.print(cardsArrangement[i].pop(0)+"  ");
            }
            System.out.println();
            System.out.println();
        }

    }

}