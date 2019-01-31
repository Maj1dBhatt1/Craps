INSTRUCTOR COMMENTS
===================

This program works just about as it should, and I especially
appreciate the default Y/N values that you've built in, with
the defaults nicely aligned with what you most commonly want
to do--play the game, not see the instructions, etc.

One minor clarification: the first roll is only called the
"point" *after* you've not won or lost. Telling someone that
they're rolling the point before they've made that first
roll isn't technically correct. A minor point, and a natural
mistake for someone who hasn't grown up in the gutters of LA
rolling craps (like me!)

You did a great job including comments throughout your program
too, which is always appreciated. Where possible, include 
carriage returns to keep those comments nicely aligned with 
your other code. See this long comment, for example:

    String Status = "rolling"; //String variable tracks the User's game's status and     is reffered to by loops and print statemnts.

A long comment that wraps around interferes with the ability 
to visually scan your code. Better would be this:

    String Status = "rolling";      // String variable tracks 
                                    // the User's game's status 
                                    // and is reffered to by loops 
                                    // and print statemnts.

The last thing I'll mention is the structure of your program. As
I say, the game play is perfect. You have a number of variables
that you use to track things in the game, including `play`, which
monitors whether the user wants to keep playing, `Status`, which 
can take values "rolling", "lose", or "win". There are probably 
slightly cleaner ways of managing all of that, if you wanted to
go back and refactor a little.

Overall, however, this is nice, functional code. Well done!

SCORE: 49/50

