## Distinction
Concise distinction among various multithreaded nightmares for programmers:
**Deadlock :** Threads do not change anything actively. They just keep on waiting for one another.
**Livelock :** Threads keep busy acquiring-and-releasing object locks. They do not make any progress in business code.
**Starvation :** Low priority threads stay left behind and do not get chances to get running. Only higher priority threads enjoy CPU time slices and progress.
**Race Conditions :** When the output is heavily dependent on the order of execution of statements across threads and there is lack of synchronization, undesired output is obtained.

## Multithreading Tips:
1. Use concurrent collections.
2. Use synchronized() blocks/methods.
3. Use atomic variables.
4. Use volatile variables for heavily shared data members like shared INSTANCE.