package JavaAssignments.Java10;

public class SListIterator{
    SList temp=null;
    SListIterator(SList head)
    {
        temp=head;
    }

    public void traverse()
    {
        if(temp==null)
        {
            System.out.println("Empty List");
            return;
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
}
