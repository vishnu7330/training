set JAVA_HOME=%ProgramFiles%\Java\jdk1.8.0_321
start zookeeper-server-start.bat ..\..\config\zookeeper.properties
 
TIMEOUT 10
 
start kafka-server-start.bat ..\..\config\server.properties