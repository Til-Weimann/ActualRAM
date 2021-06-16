# ActualRAM

ActualRAM is a basic, lightweight plugin that lets you see how much RAM your mc server actually uses.


# Why is this relevant?

It is a common myth that mc servers need a lot of RAM to run well. Many people even think that memory is the biggest factor determining server performance. But that's not true - it actually is single thread performance.

But why do people think it is? The answer is quite simple. When they are looking at their server panel, the RAM usage they see is not actual active usage, but rather heap size (+what panel etc. take).

The problem here is that heap size is actually quite a bit larger than actual RAM usage in most cases and it also only rises and does not decrease on its own.

This leads many admins to believe that their server actually needs a lot of RAM (since the JVM allocates it), when it in reality doesn't.
This plugin provides a solution to this: It lets you see how much RAM is actually currently being used.

# How do I use it?

It is quite easy to use - just install the plugin and enter the /showram. Here is an example on how the output might look like:

[ActualRAM] Current RAM usage: 2000/4000/6000MB (33%)

In this example, 6000 is the total allocatable amount of RAM, which is defined by Xmx in the start command.
4000 is the heap size, so what the JVM has allocated so far.
The really interesting value is 2000, which is the current amount of RAM the server is not just having in the heap but what it is actively using.
Looking at this amount will give you a rough idea how much memory your server actually uses under the current circumstances.

Be aware though that not only the server itself needs RAM - the panel, for example, also does. That's why you should always have at least a couple of 100 megabytes more than what the command tells you during player peaks. How much exactly very much depends on the individual situation.

