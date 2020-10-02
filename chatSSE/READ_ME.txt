READ ME
----------
Simple chat with Server Sent Events.
Files:
	-index.html: contains the code for creating the interface and calls functions:
		"start()" for starting the event source conncection with checkMsg servlet.
		"send()" for adding new messages.
	-web.xml
	-Item.java: class with static variables. It stores the sent messages with its usernames, and counts total number of messages.
	-sendMsg.java: servlet for adding new messages and usernames to the total.
	-checkMsg.java: servlet for checking if there's any new messages and, if so, sending them through event stream.