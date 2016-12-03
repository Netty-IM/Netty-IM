# resource 

##  open source of IM system 
- [mogujie/teamtalk](https://github.com/mogujie/TeamTalk)
- [Openfire](https://github.com/igniterealtime/Openfire)

## close source IM system 
- [MobileIMSDK](https://github.com/JackJiang2011/MobileIMSDK)

## options on IM system  

Engineer work on GTalk \`s opinion on very large scalable system 

Architecture lessons from Google Talk
An engineer working on Google Talk gave a talk describing the lessons learned from building a very large, scalable system. (incidentally, implemented in Java)

Measure the right thing: the difficult part for IM is presence (who’s online now), not messaging.
Real life load tests: when they added GTalk to Gmail and Orkut, they didn’t reveal it to the user for a few weeks. Instead, they simulated IM connections to test against huge loads.
Dynamic resharding: Prepare to add/subtract machines from your data center and rebalance data across those machines.
Add abstractions to hide system complexity: make GTalk a “service”; hide all complexity from other systems like Gmail.
Understand semantics of lower level library: Choose the right low level library to match the characteristics of your application.
Protect against operational problems: Everything breaks, so prepare and recover for inevitable failures.
Any scalable system is a distributed system: must have fault tolerance; collect metrics; trace transactions; etc.
Software development strategies: binaries are backward compatible; features can be rolled out incrementally for experimentation; engineers work on production machines.

[reference](https://surana.wordpress.com/2007/12/25/architecture-lessons-from-google-talk/)

## good passage 

- [自己搭建xmpp进行聊天](https://tonghuix.io/2015/03/xmpp-chat/)
- [移动IM学习手册](https://ruby-china.org/topics/22530)

 

