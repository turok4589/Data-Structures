package CS3;

public class map
{
  public static void main(String[ ] args)
  {
     final int SIZE = 10;  // The size of the demonstration Table
    
     ChainedTable table = new ChainedTable(SIZE);
     table.put(43210, "Sally Adams, 845-123-4567");
     table.put(55555, "Cathy Baker, 255-765-4321");
     table.put(12345, "Lisa Cook, 255-123-4567");
     table.put(98765, "Jessica Green, 255-123-4567");
     table.put(22222, "Jerry Jefferson, 914-111-2222");
     table.put(21212, "Susan Rosenburg, 914-222-1111");
     table.put(33333, "John Silverburg, 845-462-2222");
     table.put(56789, "Frank Smith, 212-888-8888");
     table.put(11119, "Scott Walder, 212-999-9999");
     table.put(99999, "Peter Young, 212-000-0000");
     table.show();
 
     int key;
     ChainedHashNode cursor;
 
     key = 12345;
     if (table.containsKey(key))
         System.out.println(key + " is in the hash table.");
     else
         System.out.println(key + " is not in the hash table.");
          
     key = 12340;
     if (table.containsKey(key))
         System.out.println(key + " is in the hash table.");
     else
         System.out.println(key + " is not in the hash table.");
          
     key=56789;
     cursor = table.get(key);
     if (cursor == null)
         System.out.println(key + " is not in the hash table.");
     else
         System.out.println(cursor.key + " is in the hash table with data "
                                + "\"" + cursor.element + "\"");
        
     key=66666;
     cursor = table.get(key);
     if (cursor == null)
         System.out.println(key + " is not in the hash table.");
     else
         System.out.println(key + " is in the hash table with data "
                                + "\"" + cursor.element + "\"");
     table.remove(21212);
     table.remove(12345);
     table.remove(56789);
     table.remove(00000);
     table.show();
     System.out.println("All done");
  }     
}
class ChainedTable
{
  private ChainedHashNode[] table;
  public ChainedTable(int capacity)
  {
     if (capacity <= 0)
       throw new IllegalArgumentException("Table size must be positive.");
     // Allocate the table which is initially all null head references.
     table = new ChainedHashNode[capacity];
  }
  public boolean containsKey(Object key)
  {
     ChainedHashNode cursor = null;
     boolean answer = false;
     int index = hash(key);
     cursor = table[index];
     while(cursor != null)
     {
       if(key.equals(cursor.key))
         {
           return true;
         }
        cursor = cursor.link;
     }
     return false;
  }
  public ChainedHashNode get(Object key)
  {
     ChainedHashNode cursor = null;
     //boolean found = false;
     int index = hash(key);
     if(table[index] != null)
      {
        cursor = table[index];
        while(cursor != null)
         {
               if(key.equals(cursor.key))
                 {
                   return cursor;
                 }
               else
                {
                  cursor = cursor.link;
                }
         }
      }
     return null;
  }
  private int hash(Object key)
  {
     return Math.abs(key.hashCode()) % table.length;
  }
  public Object put(Object key, Object element) //could be changed to void, there isn't really a reason to return something
  {
     ChainedHashNode cursor = null;
     Object answer = null;
     int index = hash(key);
      if(table[index] != null)
     {
   	  cursor = table[index];
   	  while(cursor != null)
        {
          if(cursor != null && key.equals(cursor.key))
            {
              break;
            }
     	  cursor = cursor.link;
   	  }
       }
     if (cursor == null) //key was not found
     { // Add a new node at the front of the list of table[hash(key)].
       int i = hash(key);
       cursor = new ChainedHashNode( );
       cursor.element = element;
       cursor.key = key;
       cursor.link = table[i];
       table[i] = cursor;
     }
     else
     { // The new element replaces an old node.
        answer = cursor.element;
        cursor.element = element;
     }
     return answer;
  }
  public Object remove(Object key)
  {
     ChainedHashNode prev = null; //keep track of previous
     ChainedHashNode temp = null; //keep tracking of next node

     //We could do the append node to the front method to get rid of the first if statement if we wanted to.
     int index = hash(key);
     if(table[index] != null)
         {
            temp = table[index]; //temp = head node
            if(temp.link != null && key.equals(temp.key))
              {
                //I guess this step is just in case the key is at the start of the list.
                //In the nth node we adding an element to the start of the list to handle the case where we want to delete the first element in the list.
                temp = temp.link;
                table[index] = temp;
                return temp;
              }
            while(temp != null && key.equals(temp.key) == false)
               {
                 //This will handle all the elements afterwards.
                 prev = temp; //keep track of prev
                 temp = temp.link; //keep track of next
               }
              if(temp == null)
                {
                  //key not in table
                  return null;
                }
                 //delete the node
                 prev.link = temp.link; //skips over the current temp node
                 return prev;
         }
     return null;
  }
  public void show()
  {
    ChainedHashNode cursor = null;
    int i = 0;
    while(i < table.length)
    {
      System.out.println(i);
      if(table[i] != null)
     {
       cursor = table[i];
        while(cursor != null)
        {
          System.out.println("\t" + cursor.key + "\t" + cursor.element);
          cursor = cursor.link;
        }
     }
    else
     {
       System.out.println("");
     }
     i++;
    }
  }
}
class ChainedHashNode
{
  Object element;
  Object key;
  ChainedHashNode link;
}