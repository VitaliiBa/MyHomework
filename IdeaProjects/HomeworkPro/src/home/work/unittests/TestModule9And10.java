package home.work.unittests;

import home.work.module910.Caesar;
import home.work.module910.FileFunctions;
import org.junit.Assert;
import org.junit.Test;

public class TestModule9And10 {
   @Test
   public  void shouldReturnCorrectCaesarEncoding() throws Exception{
     final String secretString = "The quick brown fox Jumped5 over7 the lazy Dog";
     final Caesar caesar = new Caesar();
     final String expectedResult = "Wkh txlfn eurzq ira Mxpshg5 ryhu7 wkh odcb Grj";
     final String actualResult = caesar.encode(secretString,3);
      Assert.assertEquals("Actual result differs from expected. Test is falied.",expectedResult,actualResult);
   }
   @Test
   public void shouldCorrectlySaveToFile()throws Exception{
       final String myString = "The quick brown fox Jumped over the lazy Dog";
       final String myFileName = "myfile.txt";
       final FileFunctions fileFunctions = new FileFunctions();
       final Caesar caesar = new Caesar();
       String encodedString = caesar.encode(myString,3);
       fileFunctions.saveToFile(myFileName,encodedString);
       final String actualString = fileFunctions.getFromFile(myFileName);
       Assert.assertEquals("Test is falied.",encodedString+System.getProperty("line.separator"),actualString);
   }
}
