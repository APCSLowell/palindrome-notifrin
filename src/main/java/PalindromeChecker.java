public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String chan = new String();
 String ratio = new String();

  for(int i =0; i <word.length(); i++) {
      if(word.substring(i,i+1) != " ")
      chan += word.substring(i,i+1);
  }

 for(int i =0; i < chan.length(); i ++) {
    if(Character.isLetter(chan.charAt(i)))
    ratio += chan.charAt(i);
  }
   ratio = ratio.toLowerCase();
  if(ratio.equals(reverse(ratio)))
    return true;


  return false;
}
public String reverse(String str)
{
    String hello = new String();
  for(int i = str.length(); i > 0; i--) {
    hello = hello + str.substring(i-1,i);
  }
  return hello;
}
}
