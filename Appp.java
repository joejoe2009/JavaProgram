import java.util.concurrent.TimeUnit;

public class Appp {
    public static void main(String[] args) throws Exception {
        String[] starray = {"this", "is", "a", "test"};
        String[] starray1= {"this", "is", "a", "another","test"};

        String st= "This is a test string";
        char[] c = st.toCharArray();
        char tc = ' ';
        for(int i = 0; i < c.length/2; i++)
        {
            tc = c[i];
            c[i] = c[c.length - i -1];
            c[c.length - i -1] = tc;

        }

        String t = "";
        for ( int i =0; i < starray.length / 2; i++) {
            t = starray[i];
            starray[i] = starray[starray.length -i -1];
            starray[starray.length -i -1] = t;
            
           

        }
        for ( int i =0; i < starray1.length / 2; i++) {
            t = starray1[i];
            starray1[i] = starray1[starray1.length -i -1];
            starray1[starray1.length -i -1] = t;
            

        }
        for (int i =0; i < starray.length; i++) {
            System.out.println(starray[i]);
        }
        for (int i =0; i < starray1.length; i++) {
            System.out.println(starray1[i]);
        }
        for(int i = 0; i < c.length; i++)
        {
            System.out.print(c[i]);

        }


    }
}