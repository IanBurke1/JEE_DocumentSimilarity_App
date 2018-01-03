# A JEE Application for Measuring Document Similarity
#### *Advanced Object Oriented Module - Lecturer: [Dr John Healy]() - 4th Year Software Development*
For my project I am required to develop a Java web application that enables two or more text documents to be compared for similarity. An overview of the system is given below: 

![](https://user-images.githubusercontent.com/22341150/34524665-39cc66f2-f094-11e7-9bdb-e405f29ece83.PNG)

1. A document or URL should be specified or selected from a web browser and then dispatched to a servlet instance running under Apache Tomcat.
2. Each submitted document should be parsed into its set of constituent shingles and then compared against the existing document(s) in an object-oriented database (db40) and then stored in the database.
3. The similarity of the submitted document of the set of documents stored in the database should be returned and presented tot eh session user.

# Architecuture
