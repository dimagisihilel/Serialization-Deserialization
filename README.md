# Serialization and Deserialization in java 

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object. The byte stream created is platform-independent, making serialization and deserialization highly versatile for Java applications.

## 1. Serialization

Serialization is the process of converting a data structure or object into a format that can be easily stored, transmitted, or persisted. The resulting serialized data is often in a standardized, platform-independent format, such as JSON, XML, or binary data.

### Advantages of Serialization

- **State Preservation :** Serialization helps preserve the state or the data of the object, allowing it to be restored later.

- **Platform Independence :** Serialized data is platform-independent, ensuring compatibility across different systems and environments.

- **Efficient Transfer :** It enables efficient transfer of objects between different platforms, saving time and resources.

- **Object Cloning :** Serialization can be used to create replicas of objects, facilitating object cloning.

- **Customizability :** It is easy to understand and customize, allowing developers to tailor the serialization process to specific needs.

- **Security :** Serialization supports encryption, enabling safe and secure Java computing.


### Mechanism of Serialization


1. Implementing Serializable

    The class of the object to be serialized must implement the `Serializable interface`. This is a marker interface, meaning it does not contain any methods but signals to the JVM that the object can be serialized.

2. Creating an Output Stream

   Use an `ObjectOutputStream` connected to an underlying `FileOutputStream` or another output stream.

3. Writing the Object

   Call the `writeObject()` method of the `ObjectOutputStream` to convert the object into a byte stream and write it to the output stream. During this process, the JVM captures the state of the object, including its fields and the state of any referenced objects, recursively.


## 2. Deserialization

Deserialization is the process of reconstructing a data structure or object from its serialized form. It involves interpreting the serialized data and creating an equivalent object or data structure.


### Advantages of Deserialization

- **Reconstruction:** It helps reconstruct the object from the byte stream rather than actually creating an object from the class, which is more time-consuming.

- **Customizability:** Deserialization is simple to customize, allowing developers to tailor the process to specific needs.

- **Built-in Feature:** It is a built-in feature of Java, requiring no third-party tools.


### Mechanism of Deserialization

1. Creating an Input Stream

   Use an `ObjectInputStream` connected to an underlying `FileInputStream` or another input stream.

2. Reading the Object

   Call the `readObject()` method of the `ObjectInputStream` to read the byte stream and convert it back into an object. The JVM uses the serialized data to reconstruct the object, including its fields and the state of any referenced objects, recursively.


## Explanation of the code 

- **Product Class**

  The `Product` class implements the `Serializable` interface, allowing its instances to be serialized. It has fields *name* and *price*, *a constructor*, *getters*, and a *toString* method.

- **Serialization in Main.java**
  
  Create an instance of `Product`.
  
  Use `ObjectOutputStream` to write the `Product` object to a file named `product.ser`.
  
- **Deserialization in Main.java**
  
  Use `ObjectInputStream` to read the `Product` object from the `product.ser` file.
  
  Print the deserialized `Product` object to verify the process.


