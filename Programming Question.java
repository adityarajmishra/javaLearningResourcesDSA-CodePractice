


QUESTION:

/*



public class __Office 
{
int deptId;
String deptName;
public int getDeptId() {
return deptId;
}
public void setDeptId(int deptId) {
this.deptId = deptId;
}
public String getDeptName() {
return deptName;
}
public void setDeptName(String deptName) {
this.deptName = deptName;
}
public __Office(int deptId, String deptName) {
super();
this.deptId = deptId;
this.deptName = deptName;
}
@Override
public String toString() {
return "Office [deptId=" + deptId + ", deptName=" + deptName + "]";
}
public __Office() {
super();
}
}     

 

public class Test {

 

// {Sales=2, ETS=1, IT=2}

 

public static void main(String[] args)
{
List<__Office>listOfOffice=new ArrayList<__Office>(
Arrays.asList(new __Office(101,"Sales"),
new __Office(201,"IT"),
new __Office(301,"IT"),
new __Office(401,"Sales"),
new __Office(501,"ETS")
));

 

Map<String,Long>res=

 

}
}
*/



##### First Approach


import java.util.*;
import java.util.stream.*;

public class __Office {
    int deptId;
    String deptName;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public __Office(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Office [deptId=" + deptId + ", deptName=" + deptName + "]";
    }

    public __Office() {
        super();
    }
}

public class Test {
    public static void main(String[] args) {
        List<__Office> listOfOffice = new ArrayList<__Office>(
            Arrays.asList(
                new __Office(101, "Sales"),
                new __Office(201, "IT"),
                new __Office(301, "IT"),
                new __Office(401, "Sales"),
                new __Office(501, "ETS")
            )
        );

        // Grouping by deptName and counting the occurrences
        Map<String, Long> res = listOfOffice.stream()
            .collect(Collectors.groupingBy(__Office::getDeptName, Collectors.counting()));

        System.out.println(res);  // Output: {Sales=2, ETS=1, IT=2}
    }
}



##### Second Approach

import java.util.*;

public class __Office {
    int deptId;
    String deptName;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public __Office(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Office [deptId=" + deptId + ", deptName=" + deptName + "]";
    }

    public __Office() {
        super();
    }
}

public class Test {
    public static void main(String[] args) {
        List<__Office> listOfOffice = new ArrayList<__Office>(
            Arrays.asList(
                new __Office(101, "Sales"),
                new __Office(201, "IT"),
                new __Office(301, "IT"),
                new __Office(401, "Sales"),
                new __Office(501, "ETS")
            )
        );

        // Creating an empty map to store department name and count
        Map<String, Long> res = new HashMap<>();

        // Iterate through the list using a for loop
        for (__Office office : listOfOffice) {
            String deptName = office.getDeptName();  // Get the department name

            // Check if the department is already in the map
            if (res.containsKey(deptName)) {
                // Increment the count by 1
                res.put(deptName, res.get(deptName) + 1);
            } else {
                // If the department is not in the map, add it with count 1
                res.put(deptName, 1L);
            }
        }

        // Print the result
        System.out.println(res);  // Output: {Sales=2, ETS=1, IT=2}
    }
}
