

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

        public class DistinctStringTestClass {

        //       test cases that should be passes :
        List<String> list1 = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
        List<String> list2 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three","an","an","a"));

        @Test
        public void testingOfDistinctString(){
            List<String> expectedResult1 = Arrays.asList("clojure","java","scala");
            List<String> expectedResult2 = Arrays.asList("a","an","the","three");

            List<String> distinctList1= DistinctStringMain.getDistinctStrings(list1);
            List<String> distinctList2= DistinctStringMain.getDistinctStrings(list2);

            Assert.assertEquals(expectedResult1,distinctList1);
            Assert.assertEquals(expectedResult2,distinctList2);
        }
    }