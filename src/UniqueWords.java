import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		
    	  // Keep track of the frequency of words that appear
    	  int seen = 0;
    	  for (int j = 0; j < list.size(); j++)
		  {
			if (list.get(i).equals(list.get(j)))
			{
				seen++;
			}
		  }
    	  // Only count words that are unique
    	  if (seen == 1) {
				count++;
    	  }
      }
      
      /** Another way - to determine the single instance of words and omitting its duplicate from total count - 
       * @return 5
       
       ArrayList<String> uniqueList = new ArrayList<>();
       
       for (int i = 0; i < list.size(); i++)
       {	
    	   if (!uniqueList.contains(list.get(i))) {
    		   uniqueList.add(list.get(i));
    	   }
       }
       
       count = uniqueList.size();
      
       return count;
       */
      
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
