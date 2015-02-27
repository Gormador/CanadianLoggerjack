# CanadianLoggerjack
A logging system for Java applications.

# How to install
Please feel free to clone this repository. This is an eclipse project, so you can add it to your favorite workspace.

You can also download the whole project in an archive.

# Documentation

## Where's the book?
You will find the javadoc in the *doc* folder.

## For the rushing ones
Several test files are also available in *fr.esiea.CanadianLoggerjack.tester*, which are good examples to start.


# Principles

## How to use
Once you have a Logger Object, just ask him :

```java
	logger.error("This is an error level message");
	logger.info("This is an informative message");
	logger.debug("This is for talkative people");
```

## Oh nice! How can I get one?

In order to get a Logger, you will first need to configure it.
Simply :

```java
	Configuration config = new Configuration();
```

Then, you will instanciate a Factory :

```java
	LoggerFactory lf = new LoggerFactory(conf);
```

You can also do both in one :
	LoggerFactory lf = new LoggerFactory(new Configuration());

You can also get a configuration with a File (see under and in the javadoc).

## What to configure

All the configuration goes into the *Configuration* object.

You can set a *Formatter*.
You can also add several _Target_(s)
And, of course, set the logLevel of your logger.

### The Error Level
Here are the different error levels:
- DEBUG (verbose)
- INFO
- ERROR

You can set it with

```java
	config.setErrorLevel(INFO);
```
	
The default value is *ERROR*.

### The Formatter

A formatter is an Object made to format your message. You can make your own formatter by extending the *fr.esiea.CanadianLoggerjack.impl.Formator*

If you do not specify a formatter, you will use the default one.

### The Targets

#### Some targets are already implemented

A Target is a mean to store the log. There are several targets :

*fr.esiea.CanadianLoggerjack.impl.TargetConsole* the simplest _default_ parameter: the console
*fr.esiea.CanadianLoggerjack.impl.TargetFile* Record into a file
*fr.esiea.CanadianLoggerjack.impl.TargetRolloverFile* Record into a file, and create a new file when the size limit is reached

Please refer to the javadoc in order to know how to build your target. Some of them have interesting parameters, modifying their behaviour.

_Note:_ All the targets will receive the same message.

If you want to implement your own target, you'll need to implement the *Target* interface.


#### The TargetBuilder

If you implement your own target, you *MUST* also create a TargetBuilder, by extending the *fr.esiea.CanadianLoggerjack.impl.TargetFactory* class.

This class will create your target when the configuration is created thanks to a properties file.
The user will have only one String variable to put all the parameters needed by your factory.

Then, your TargetBuilder will be called by the LoggerFactory in order to build your own Target! Isn't it exciting?

_Tip:_ Create first your Target class. Then, find a clever way to distinguish the different ways of creating your Target. Do not forget to specify it clearly in your javadoc. (think about comma separation for instance)

_Tip:_ If something goes wrong with the String that was passed, feel free to raise a brand *new InvalidConfigurationException*!


## How to configure with a file

Okay. That's becoming more complicated now. Just a bit though.

### Comments
Make a line begin with a # to make a comment. Easy.

### Example of config file
Please ignore the brackets[] and braces{}, they are here for educational purpose only.
Between the square brackets must hold a class name.
Between the curly braces must hold a String.

```
	[TheFirstClassYouWantToLog]
	[TheFirstClassYouWantToLog].loglevel = {LOGLEVEL for this class}
	[TheFirstClassYouWantToLog].formator = [TheFormatorClassYouWant for this class]
	[TheFirstClassYouWantToLog].targetFactories = [TargetFactory1];[Another TargetFactory];[targetFactory2];[and so on]
	[TheFirstClassYouWantToLog].[TargetFactory2].params = {parameters for TargetFactory2}
	[TheFirstClassYouWantToLog].[TargetFactory1].params = {parameters for TargetFactory1}
	
	[TheSecondClassYouWantToLog]
	[TheSecondClassYouWantToLog].logLevel = {LOGLEVEL for this other class}
	
	[TheThirdClassYouWantToLog].logLevel = {LOGLEVEL for this other class}
```

In the example above, [_Another TargetFactory_] and [_and so on_] will be called without parameter by the *LoggerFactory*.
However, [_TheThirdClassYouWantToLog_] will not get any specific paramater, because there is no line with its sole classname.