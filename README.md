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

I am using Spring JMS in the project, because spring provides **JmsTemplate** which abstracts
away the creation of connection, session, and destination objects.

**Concepts:**
1. JMS (Java Message Service) is a Java API that provides a way for Java applications to create, send, receive, and read messages.
2. JMS is part of the Java EE (Enterprise Edition) platform and defines a set of standard interfaces and associated semantics for message-oriented middleware (MOM).

**ActiveMQ and JMS**
* Apache ActiveMQ is a robust, flexible messaging platform that implements the JMS specification.
* ActiveMQ provides full support for both the JMS 1.1 and JMS 2.0 standards, allowing developers to use JMS APIs to interact with the message broker.
* ActiveMQ implements all the key JMS features, including message queues, topics, durable subscriptions, message selectors, and transaction support.

**Key JMS Features in ActiveMQ**
* Message Queues: Point-to-point messaging model where messages are sent to a specific queue and consumed by one consumer.
* Topics: Publish/subscribe messaging model where messages are published to a topic and consumed by multiple subscribers.
* Durable Subscriptions: Subscribers can receive messages sent while they are not connected.
* Message Selectors: Allows consumers to filter messages based on specific criteria.
* Transactions: Supports local and distributed transactions to ensure message delivery and processing reliability.

<h3>Other message queues:</h3>

**IBM WebSphere MQ** (now known as IBM MQ) is a widely-used messaging middleware that facilitates communication between applications by sending and receiving messages in a secure, reliable, and scalable manner.

**Key Features of IBM MQ**
* **Message Queuing:** Ensures messages are delivered once and only once, maintaining the order of messages.
* **Security:** Supports SSL/TLS for secure communication and integrates with various authentication mechanisms.
* **High Availability:** Provides features like clustering and replication for high availability and disaster recovery.
* **Scalability:** Can handle high volumes of messages and large-scale deployments.
* **Transaction Support:** Supports both local and global transactions to ensure reliable message processing.
* **Interoperability:** Works with a wide range of platforms and protocols, facilitating integration with different systems.