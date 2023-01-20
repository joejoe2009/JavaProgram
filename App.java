
public class App {
    public static void main(String[] args) throws Exception {
        String[] starray = {"Mary had a little lamb", "whose fleece was white as snow", 
        "and everywhere the Mary went", "the lamb was sure to go"};

        String t = "";
        int startIndex;
        int endIndex;
        int k;
       
        for ( int i =0; i < starray.length; i++) { 
            // if the index is half or less than half of the array size
            // switch the strings in the array. first becomes last and last becomes
            // first
            if(i < starray.length / 2) {
                t = starray[i];
                starray[i] = starray[starray.length -i -1];
                starray[starray.length -i -1] = t;
            }
            t = "";
            endIndex = starray[i].length() - 1;
            // start at the end of the string and find the first space this will determine where to begin 
            //the next loop
            for(k = starray[i].length() - 1; k > 0; k--) {
                if(starray[i].charAt(k) == ' ') {
                    // setting the starting point skipping the space
			        startIndex = k + 1;
                    // from the set starting point add each letter to the temp string until you reach
                    // the end of the word
                    for(int j = startIndex; j <= endIndex; j++)
                    {
                        t += starray[i].charAt(j);
                    }
                    // add spce back after every word
                    t += ' ';
                    // set the ending point to the length of the string minus the word length minus one
			        endIndex = k - 1;
                    
                }
            }
            // start at the beginning of the string to get the first word in the string and add it to the 
            // end of the temp string
            for(k = 0; k <= endIndex; k++)
            {
                t += starray[i].charAt(k);
            }
            // assign the temp string to the string array and reset the string to empty
            starray[i] = t;
            t = "";
           
            
            

        }
        
        for (int i =0; i < starray.length; i++) {
            System.out.println(starray[i]); 
        }
    }
}
