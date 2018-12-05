# Java 8: New Features!

  - Optional
   This is an ubiquitous design pattern, the real name of the design pattern is *Option Pattern*.  The pattern's distinguishing feature is the manipulation of some set whose cardinality is either 0 or 1.
    
    * Optional on Java:
     ```java
       java.lang.Object
         java.util.Optional<T> 
      ```
      There is an important new feature of the Java 8. Is possible a container object which **may** or **may not** contain a **non-null** value. 
      
      The main methods:
      
       1 - *isPresent()*: If a value is present will return **true**;
       2 - *get()*: isPresent() is true, this method return the value, otherwise throws **NoSuchElementException**.
       3 - *of()*: this is an static method where return an optional with the specified present non-null value. Sample: Optional.of(T value)
       4 - *ofNullable()*: 
       
       References:
       
       https://www.codeproject.com/Articles/17607/The-Option-Pattern
       https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
       http://blog.caelum.com.br/chega-de-nullpointerexception-trabalhe-com-o-java-util-optional/
  