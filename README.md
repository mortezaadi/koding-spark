koding-spark
============
Sample application to use in [koding](http://www.koding.com "Koding").     

This is a HelloWorld javaspark sample application. to demonstrate running a simple Java application on [Koding.com](http://www.koding.com "koding") VMs. In the low resource environment like the VMs in koding, **being light** is so important so instead of running a full feature web containers/framework like Tomcat or Spring. going with spark and guice make the life and of course your application easier.  
   
   
[Spark](http://sparkjava.com/ "Spark") is a simple and lightweight Java web framework built for rapid development.(Note: Spark **is not** Apache Spark)


### step you should take before running this sample

1.  You should have an account in koding.com. If you don't, go [here](https://koding.com/Login "koding.com") and make one for yourself.

2.  stop the default apache server on your VM.

		$sudo service apache stop

3.  remove the apache if you like (you don't need it any more). if you like to keep apache on your Vm. change the port of Spark to somthing other tan 80.

		$sudo apt-get purge apache

4.  Install java 8 on you vm.

		$ sudo add-apt-repository ppa:webupd8team/java
		$ sudo apt-get update
		$ sudo apt-get install oracle-java8-installer
		$ sudo apt-get install oracle-java8-set-default

5.  Install maven.

		$sudo apt-get install maven

6. clone this sample.

		$git clone https://github.com/mortezaadi/koding-spark.git

7. go to the cloned directory and run the app.


How To Run
-------------
	$sudo mvn clean install
	$sudo mvn exec:java

opening port under 1024 in koding.com requires administrative privileges. 
