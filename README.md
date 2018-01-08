# A JEE Application for Measuring Document Similarity
#### *Advanced Object Oriented Module - Lecturer: [Dr John Healy]() - 4th Year Software Development*
For my project I am required to develop a Java web application that enables two or more text documents to be compared for similarity. An overview of the system is given below: 

![](https://user-images.githubusercontent.com/22341150/34524665-39cc66f2-f094-11e7-9bdb-e405f29ece83.PNG)

1. A document or URL should be specified or selected from a web browser and then dispatched to a servlet instance running under Apache Tomcat.
2. Each submitted document should be parsed into its set of constituent shingles and then compared against the existing document(s) in an object-oriented database (db40) and then stored in the database.
3. The similarity of the submitted document of the set of documents stored in the database should be returned and presented tot eh session user.

# Architecuture
## Jsp
A JSP page is a text document that contains two types of text: static data, which can be expressed in any text-based format (such as HTML, SVG, WML, and XML), and JSP elements, which construct dynamic content.

![](https://user-images.githubusercontent.com/22341150/34628131-319f436e-f25b-11e7-9e44-ec6738341772.PNG)


## Servlet
 Servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers.

## DB4O
db4o (Database for Objects) is the open source object database that enables developers to store and retrieve any application object with one line of code.

## Threads
Multithreading refers to two or more tasks executing concurrently within a single program. A thread is an independent path of execution within a program. Many threads can run concurrently within a program. Every thread in Java is created and controlled by the java.lang.Thread class.

# Conclusion
I got the tomcat server up and running. I configured the database but couldnt get going with anything else. I am currently struggling with Java.