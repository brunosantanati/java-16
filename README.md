# Java 16

## Useful Links (Podcast link and JEPs it talks about)

Spotify - Inside Java - [Podcast Episode "Java 16 is Here!" with Mikael Vidstedt](https://open.spotify.com/episode/1e8TO5coUMLjf4DE8ZngNw)  
[JEP 396](https://openjdk.org/jeps/396) - Strongly Encapsulate JDK Internals by Default  
[JEP 395](https://openjdk.org/jeps/395) - Records  
[JEP 392](https://openjdk.org/jeps/392) - Packaging Tool  
[JEP 338](https://openjdk.org/jeps/338) - Vector API (Incubator)  
[JEP 390](https://openjdk.org/jeps/390) - Warnings for Value-Based Classes  
[JEP 376](https://openjdk.org/jeps/376) - ZGC: Concurrent Thread-Stack Processing  

## List of JEPs

[Link with all JEPs](https://openjdk.org/projects/jdk/16/)  

```
338:	Vector API (Incubator)
347:	Enable C++14 Language Features
357:	Migrate from Mercurial to Git
369:	Migrate to GitHub
376:	ZGC: Concurrent Thread-Stack Processing
380:	Unix-Domain Socket Channels
386:	Alpine Linux Port
387:	Elastic Metaspace
388:	Windows/AArch64 Port
389:	Foreign Linker API (Incubator)
390:	Warnings for Value-Based Classes
392:	Packaging Tool
393:	Foreign-Memory Access API (Third Incubator)
394:	Pattern Matching for instanceof
395:	Records
396:	Strongly Encapsulate JDK Internals by Default
397:	Sealed Classes (Second Preview)
```

## Other links

[Java 16 records tutorial - New feature in java 16](https://www.youtube.com/watch?v=b2dKyR_TJZs)  
[Java 16 Records](https://codippa.com/java-16-records/) (written version of the video above)  
[javap](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javap.html)  

## Useful commands
```
In the folder where the class files are located
(for example: examples-java-16/out/production/examples-java-16/me/brunosantana/records)
run:

javap Employee.class

javap disassembles one or more class files.
```