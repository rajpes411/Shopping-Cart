set classpath=%classpath%;.;lib\asm-3.1.jar;lib\jackson-core-asl-1.9.2.jar;lib\jackson-jaxrs-1.9.2.jar;lib\jackson-mapper-asl-1.9.2.jar;lib\jackson-xc-1.9.2.jar;lib\jersey-client-1.17.1.jar;lib\jersey-core-1.17.1.jar;lib\jersey-json-1.17.1.jar;lib\jersey-server-1.17.1.jar;lib\jersey-servlet-1.17.1.jar;lib\jettison-1.1.jar;lib\jsr311-api-1.1.1.jar;lib\jersey-multipart.jar;hib/antlr-2.7.6.jar;hib/asm-3.1.jar;hib/cglib-2.2.jar;hib/commons-collections-3.1.jar;hib/dom4j-1.6.1.jar;hib/hibernate-commons-annotations-3.2.0.Final.jar;hib/hibernate-core-3.6.10.Final.jar;hib/hibernate-entitymanager-3.6.10.Final.jar;hib/hibernate-jpa-2.0-api-1.0.1.Final.jar;hib/javassist-3.12.0.GA.jar;hib/jta-1.1.jar;hib/mysql-connector-java-5.1.9.jar;hib/slf4j-api-1.6.1.jar
javac -d . *.java
java com.rest.ConvertStart
pause