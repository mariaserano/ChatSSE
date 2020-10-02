# ChatSSE
This is a simple chat done with SSE in java.

## Files:
<p>
<ul>
	<li>index.html: contains the code for creating the interface and calls functions:</li>
	<ul>
		<li>"start()" for starting the event source conncection with checkMsg servlet.</li>
		<li>"send()" for adding new messages.</li>
	</ul>
	<li>web.xml</li>
	<li>Item.java: class with static variables. It stores the sent messages with its usernames, and counts total number of messages.</li>
	<li>sendMsg.java: servlet for adding new messages and usernames to the total.</li>
	<li>checkMsg.java: servlet for checking if there's any new messages and, if so, sending them through event stream.</li>
	
</ul>

## Useful resources 
These are some of the most useful resources I used while coding this example.

  - W3schools: https://www.w3schools.com/html/html5_serversentevents.asp
  - StackOverflow: https://stackoverflow.com/questions/12752337/how-implement-generic-server-sent-events-servlet
