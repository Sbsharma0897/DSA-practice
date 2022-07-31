package Hashing;

import java.util.Map;
import java.util.*;

public class MapSorting {
    public static void main(String[] args) {

//      1.  //This is using tree hashmap which sorts the map based on key values and we
//        // have to get the compatrator for user defined classes;
//
//        Map<Student,String> map=new TreeMap<>(new StudentCompareClass());
//        map.put(new Student(34,"sandeep",78),"rajasthan");
//        map.put(new Student(45,"rahul",7),"mumb");
//        map.put(new Student(4235,"dfdfdff",56),"andh");
//        map.put(new Student(3234,"mohan",98),"kera");
//        map.put(new Student(3124,"hero",120),"chenn");
//
//        for (Map.Entry<Student,String> el:map.entrySet())
//        {
//            System.out.println(el.getValue());
//            System.out.println("name: "+el.getKey().getName());
//            System.out.println("roll: "+el.getKey().getRoll());
//            System.out.println("marks "+el.getKey().getMarks());
//            System.out.println("==============");
//        }

//     2. Now we will sort the map based on values of the map, we shgall be using lambda.Here the values
        //are the predefiuend classes in the java.they are not user definde classes

//        Map<Integer,String> map=new HashMap<>();
//        map.put(33,"sean");
//        map.put(77,"man");
//        map.put(44,"hero");
//        map.put(224,"zero");
//        map.put(102222,"apple");
//        map.put(22,"cat");
//
//        Set<Map.Entry<Integer,String>> set=map.entrySet();
//        ArrayList<Map.Entry<Integer,String>> array=new ArrayList<>(set);

        //here in the comparator section we cane either pass comparator implented class or a
        //anonymous class
//        Collections.sort(array,new Comparator<Map.Entry<Integer,String>>()
//        {
//            public int compare(Map.Entry<Integer,String> o1,Map.Entry<Integer,String> o2)
//            {
//             return  o1.getValue().compareTo(o2.getValue());
//
//            }
//        });
        //Doing the same using lambda expression in the comparator part
//        Collections.sort(array,(o1,o2)->
//        {
//            return o1.getValue().compareTo(o2.getValue());
//        });
//        System.out.println(array);

//        3.Sort Map based on Values With Custom Objects in Java
//        Map<String,Student> map=new HashMap<>();
//        map.put("rajasthan",new Student(34,"sandeep",56));
//        map.put("jamm",new Student(34,"sandeep",3));
//        map.put("sddsd",new Student(34,"sandeep",87));
//        map.put("sdsd",new Student(34,"sandeep",343));
//        map.put("qwqwwqw",new Student(34,"sandeep",1));
//
//
//        Set<Map.Entry<String,Student>> set=map.entrySet();
//        ArrayList<Map.Entry<String,Student>> array=new ArrayList<>(set);
//
//        Collections.sort(array,(o1,o2)->
//        {
//           if(o1.getValue().getMarks()>o2.getValue().getMarks())
//           {
//               return 1;
//           }
//           else if(o1.getValue().getMarks()<o2.getValue().getMarks())
//           {
//               return -1;
//           }
//           else {
//               return 0;
//           }
//        });
//
//        for (Map.Entry<String,Student> el:map.entrySet())
//        {
//            System.out.println(el.getKey());
//            System.out.println("name: "+el.getValue().getName());
//            System.out.println("roll: "+el.getValue().getRoll());
//            System.out.println("marks "+el.getValue().getMarks());
//            System.out.println("==============");
//        }
    }

}

class StudentCompareClass implements Comparator<Student>
{
    public int compare(Student o1,Student o2)
    {
        if(o1.getMarks()>o2.getMarks())
        {
            return 10;
        }
        else  if(o1.getMarks()<o2.getMarks())
        {
            return -100;
        }
        else
        {
            return 0;
        }
    }
}
 class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

