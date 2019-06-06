# Garbage-Collector-Attack
Exploring GC 

This implementation presents how a simple programm can be much slower (more than 20 times) because of garbage collection, under extreme memory pressure circumstances.

setting max heap size and GC logger:
java -Xmx11000m -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:C:\Users\log.txt GCAttack
