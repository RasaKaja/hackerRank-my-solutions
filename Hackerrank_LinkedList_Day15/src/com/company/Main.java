package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();
        //int N = 4;

//        linkedList.add(0, "2");
//        linkedList.add(1, "3");
//        linkedList.add(2, "4");
//        linkedList.add(3, "1");

        while (N-- > 0){
            int ele = scanner.nextInt();
            head = insert(head, ele);
        }
        display(head);
        scanner.close();
    }

    public static Node insert(Node head, int data){
            if (head == null) {
                return new Node(data);
            }
            head.next = insert(head.next, data);
            return head;
    }

    public static void display(Node head){
        Node start = head;
        while (start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
