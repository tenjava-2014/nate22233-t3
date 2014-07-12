nate22233's ten.java submission
==============================

[![ten.java](https://cdn.mediacru.sh/hu4CJqRD7AiB.svg)](https://tenjava.com/)

This is a submission for the 2014 ten.java contest.

- __Theme: What random events can occur in Minecraft?
- __Time:__ Time 3 (7/12/2014 14:00 to 7/13/2014 00:00 UTC)
- __MC Version:__ 1.7.2
- __Stream URL:__ https://twitch.tv/nates22233

<!-- put chosen theme above -->

---------------------------------------

Compilation
-----------

- Download & Install [Maven 3](http://maven.apache.org/download.html)
- Clone the repository: `git clone https://github.com/tenjava/nate22233-t3`
- Compile and create the plugin package using Maven: `mvn`

Maven will download all required dependencies and build a ready-for-use plugin package!

---------------------------------------

Usage
-----

1. Install plugin
2. Put it in the plugins folder of your Minecraft Bukkit server
3. Set the time to 0 on your server (This will reset the random event per day timer)
4. Done!

---------------------------------------

Description
-----------

This plugin makes events happen in your minecraft world! You can manually make these events happen with the /event command, but they also randomly happen throughout the minecraft day once a day every day. The events are as followed:
- RandomTeleportation: This teleports everyone on the server to a new random location in the world they are currently in.
- Apocalypse: When this event happens every player has a 50/50 chance that a lot of zombies will spawn around them.
- MineralRain: When this event happens every player will have gold, iron, and coal drop down on them!
- AcidRain: When this event occurs it will rain for 30 seconds, if you are in the rain you will recieve poison from the acid.
- StrobeLight: This event makes every players screen flash thus creating a strobe light! Time to dance!

At the beginning of every day the time that the random event will occur is printed in console of the server.

<!-- Hi, nate22233! This is the default README for every ten.java submission. -->
<!-- We encourage you to edit this README with some information about your submission – keep in mind you'll be scored on documentation! -->
