<h1>ActiveMQ Example</h1>

<p>A sample spring application using ActiveMQ.</p>

<h4>Steps to install and setup ActiveMQ</h4>
1. Install ActiveMQ version 5.18.4 from the following [link](https://activemq.apache.org/components/classic/download/).
2. Unzip and extract to the desired location.
3. Navigate to bin folder of the ActiveMQ application.
4. if you are using windows, got to win32 directory and double-click on <i>**activemq**</i> batch file.
5. if you are using linux, open a terminal in bin folder and run **./activemq**.
6. This will start the ActiveMQ server. We can access the admin page at http://127.0.0.1:8161/ .

Now, we can our java application to send and consume messages from ActiveMQ.
1. Open the code in IDE of your choice.
2. Open <b>MessageProducerApp</b> class, and right click on editor section. click run option. This will send a message to the Queue.
3. Open up web console for ActiveMQ, and navigate to queue page, you should see that there is one message in queue.
4. Open <b>MessageConsumerApp</b> class. right click on editor section and click run option. This will consume a message from the queue.


**Concepts:**
1. JMS specification provides a set of classes and interfaces for messaging functionality.
2. I am using Spring JMS in the project, because spring provides **JmsTemplate** which abstracts
away the creation of connection, session, and destination objects. 

