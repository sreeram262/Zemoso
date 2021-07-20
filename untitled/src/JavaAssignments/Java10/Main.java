package JavaAssignments.Java10;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        SList head=null;

        for(int i=0;i<3;i++)
        {
            head=createNewNode(head);
        }
        SListIterator iterator = new SListIterator(head);
        System.out.println("Elements in the list are:");
        iterator.traverse();

    }
    static SList createNewNode(SList head)
    {
        System.out.println("enter a num");
        int num=sc.nextInt();
        SList<Integer> new_node=new SList<>(num);
        if(head==null)
        {
            head=new_node;
            return head;
        }
        SList temp;
        temp=head;
        while(temp.link!=null)
        {
            temp=temp.link;
        }
        temp.link=new_node;
        return head;

    }

}
