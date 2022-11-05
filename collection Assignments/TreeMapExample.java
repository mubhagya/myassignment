package CollectionAssignment;
import java.util.*;
import java.lang.*;
 class PhoneNumbers {
     Long number;

     PhoneNumbers(Long number) {
         this.number = number;
     }

     public Long getNumber() {
         return number;
     }

     public void setNumber(Long number) {
         this.number = number;
     }

     @Override
     public String toString() {
         return "PhoneNumbers{" +
                 "number=" + number +
                 "}";
     }
 }
 class Contact {
     String name, email;
     String gender;

     Contact(String name, String email, String gender) {
         this.name = name;
         this.email = email;
         this.gender = gender;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     @Override
     public String toString() {
         return "Contact{" +
                 "name='" + name + '\'' +
                 ", email='" + email + '\'' +
                 ", gender='" + gender + '\'' +
                 '}';
     }
 }
 class SortByPhoneNumber implements Comparator{
     public int compare(Object str1,Object str2) {
         String i1=str1.toString();
         String i2=str2.toString();
         return i2.compareTo(i1);

     }

 }
 public class TreeMapExample {
     public static void main(String args[]) {
         PhoneNumbers n1 = new PhoneNumbers(9099999999l);
         PhoneNumbers n2 = new PhoneNumbers(9888888888l);
         PhoneNumbers n3 = new PhoneNumbers(8077777777l);
         PhoneNumbers n4 = new PhoneNumbers(6666666666l);
         Contact c1=new Contact("bhagya","Bhagya@gamil.com","female");
         Contact c2=new Contact("guru","Guru@gamil.com","male");
         Contact c3=new Contact("sri","sri@gamil.com","male");
         Contact c4=new Contact("vanitha","vanitha@gamil.com","female");
        TreeMap<PhoneNumbers,Contact> phnContact=new TreeMap<>(new SortByPhoneNumber());
        phnContact.put(n1,c1);
        phnContact.put(n2,c2);
        phnContact.put(n3,c3);
        phnContact.put(n4,c4);
        System.out.println(phnContact);
        Set<Map.Entry<PhoneNumbers,Contact>> entrySt=phnContact.entrySet();
        System.out.println("keys...............");
        for(Map.Entry<PhoneNumbers,Contact> entry:entrySt){
            System.out.println(entry.getValue());

        }
        System.out.println("KeyValuePairs............");
        for(Map.Entry<PhoneNumbers,Contact> entry:entrySt){
            System.out.println(entry.getKey()+"="+entry.getValue());

        }

     }
 }