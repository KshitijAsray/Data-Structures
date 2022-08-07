package Stacks;

import java.util.HashMap;
import java.util.Set;

public class JavaHashMapExample {

 public static void main(String[] args) {

  // create object of HashMap
  HashMap<String,String> phoneBook = new HashMap<>();
  phoneBook.put("John", "245745");
  phoneBook.put("Joy", "245786");
  phoneBook.put("Roy", "233783");

  // retrieve value using Object get(Object key) method of Java HashMap
  // class
  Object phoneNo = phoneBook.get("Joy");
  System.out.println("Phone number of Joy: " + phoneNo);

  System.out.println("The Map contains...");

  /**
   * Set keySet() - Returns a set view of the keys contained in this map.
   * The set is backed by the map, so changes to the map are reflected in
   * the set, and vice-versa
   **/

  Set<String> nameSet = phoneBook.keySet();
  for (Object name : nameSet) {
   System.out.println("Name: " + name + " Phone: "
     + phoneBook.get(name));
  }

  /**
   * put - If the map previously contained a mapping for this key, the old
   * value is replaced and the put method returns the old value.
   **/

  Object oldPhone = phoneBook.put("Roy", "222222");

  System.out.println("Roy's old phone number:" + oldPhone);
  System.out.println("Roy's new phone number:" + phoneBook.get("Roy"));

 }
}