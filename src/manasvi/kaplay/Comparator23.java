package manasvi.kaplay;
import java.util.*;
import manasvi.kaplay.Student3.CustomerSortingComparator;
class Student3 { 
  
    // instance member variables 
    String Name; 
    int Age; 
  
    // parameterized constructor 
    public Student3(String Name, Integer Age) { 
        this.Name = Name; 
        this.Age = Age; 
    } 
  
    public String getName() { 
        return Name; 
    } 
  
    public void setName(String Name) { 
        this.Name = Name; 
    } 
  
    public Integer getAge() { 
        return Age; 
    } 
  
    public void setAge(Integer Age) { 
        this.Age = Age; 
    } 
  
    // overriding toString() method 
    @Override
    public String toString() { 
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}'; 
    } 
  
    static class CustomerSortingComparator implements Comparator<Student3> { 
  
        @Override
        public int compare(Student3 customer1, Student3 customer2) { 
  
            // for comparison 
            int NameCompare = customer1.getName().compareTo(customer2.getName()); 
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge()); 
  
            // 2-level comparison using if-else block 
            if (NameCompare == 0) { 
                return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
            } else { 
                return NameCompare; 
            } 
        } 
    }
}
public class Comparator23 {
    public static void main(String args[]){
    List al = new ArrayList<Student3>(); 
  
        // create customer objects using constructor initialization 
        Student3 obj1 = new Student3("Ajay", 27); 
        Student3 obj2 = new Student3("Sneha", 23); 
         
  
        // add customer objects to ArrayList 
        al.add(obj1); 
        al.add(obj2); 
        // before Sorting arraylist: iterate using Iterator 
        Iterator<Student3> custIterator = al.iterator(); 
  
        System.out.println("Before Sorting:\n"); 
        while (custIterator.hasNext()) { 
            System.out.println(custIterator.next()); 
        } 
  
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(al, new CustomerSortingComparator()); 
  
        // after Sorting arraylist: iterate using enhanced for-loop 
        System.out.println("\n\nAfter Sorting:\n"); 
        for (Object customer : al) { 
            System.out.println(customer); 
        } 
    } 
}
