grpc Examples
==============================================


First start the server and then have the client connect to it and let the good times roll.

Assuming you are in the grpc-java root folder you would first start the route guide server
by running

```
$ ./gradlew :grpc-pollService:pollServer
```

and in a different terminal window then run the route guide client by typing

```
$ ./gradlew :grpc-pollService:pollClient
```

That's it!

Please refer to [Getting Started Guide for Java] (https://github.com/grpc/grpc-common/blob/master/java/javatutorial.md) for more information.
