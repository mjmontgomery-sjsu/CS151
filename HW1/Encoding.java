
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();

      //If statements for -
      if (n == 1 ) {
      	
      	if(m <= 0) {
          result.add("-");       
      	}
      }
      
      //If Statements for .
        if (m == 1 ) {
        		if(n <= 0) {
            result.add(".");
        		}
        }
              
       
        Set<String> smallParts;
        
        if (n >= 1) {
            smallParts = morseCodes(m, n - 1);
            for (String morse: smallParts)
                result.add("-" + morse);
        }

        if (m >= 1) {
            smallParts = morseCodes(m - 1, n);
            for (String code: smallParts)
                result.add("." + code);
        }
        
        return result;
   }
}
