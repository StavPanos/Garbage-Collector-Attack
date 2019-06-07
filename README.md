# Garbage-Collector-Attack
Exploring GC 

This implementation presents how garbage collection process can slow down a programm's runtime (more than 20 times) under extreme memory pressure circumstances.

setting max heap size and GC logger:
java -Xmx11000m -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:C:\Users\log.txt GCAttack
