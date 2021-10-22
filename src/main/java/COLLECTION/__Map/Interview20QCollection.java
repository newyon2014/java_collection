package COLLECTION.__Map;

public class Interview20QCollection {

    //1. How Does put() method of HashMap works in Java?
    //2. What is the requirement for an object to be used as key or value in the hashmap?
    //3. What will happen if you try to store a key which was already present in hashMap?
    //4. Can you store a null key in Java HashMap?
    //5. can you store a null value inside a hashmap in java?
    //6. How does hashmap handle collision in java?
    //7. Which data structure hashMap represents?
    //8. Which data structure used to implement hashMap in java ?
    //9. can you store a duplicate key in java hashMap?
    //10. can you store a duplicate value in java hashMap?
    //11. Is HashMap thread-safe in Java?
    //12. What will happen if you use HashMap in a multi-threaded Java application?
    //13. What are the different ways to iterate HashMap in Java?
    //14. How do you remove a mapping while iterating over HashMap in Java?
    //15. In which order data in Hashmap are stored ?
    //16. Can you sort HashMap in java?
    //17. What is a load factor in hashMap ?
    //18. How does resizing in hashMap happens in java?
    //19. How many entries can your store in hashMap ?
    //20. What is the difference between capacity and size in HashMap?
    //21. What happens if tow different keys of HashMap return the same hashcode?

    //Answers:
    //1. On Hashing principle
    //2. Both Key and Value should implement hashCode() and equals() method
    //3. it's allowed but the hashmap will return the latest value on the new Key.
    //4. Yes. Java allows to store ONLY one null key value.
    //5. yes. Java allows to store multiple null value
    //6. using linkedlist up to 8 nodes. if more converted to Balanced binary tree for faster processing.
    //7.
    //8. LinkedList and Balanced Binary tree
    //9. No
    //10. Yes
    //11. No.HashMap in Java is neither thread-safe nor synchronized.
    //12. Not good. Don't do that !!
    //13. By keySet(), by KeyValue() , by EntrySet(),
    //14. By using remove() method
    //15. Random order because HashMap doesn't provide any order guarantee for keys, values or entries. When you iterate
    // over a hashMap, you may get different order every time.
    //16. No. HashMap doesn't maintain indexing ( like list )
    //17. Load factor is a number that controls the resizing of the Hahsmap.When a number of elements in the hashMap
    //     cross the load factor value, java will trigger resizing which involves array copy.
    //18. Check Answer for Q17
    //19. No limit
    //20. Size - denotes how many mappings (key - value) pair is currently present
    //     capacity - denotes how many entries Hashmap can store.
    //21. Collision will occur
}
