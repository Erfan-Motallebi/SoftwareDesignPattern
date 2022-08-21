# Software Design Pattern ##



1. `Abstract Observer Class`
2. `Concrete Observer Class`
3. `Concrete Subject Class`

**Explanation**:

> this pattern is used in one-to-many relationship when one object
> modification is concerned with different objects subscribed to the
> subject.

The *Subject* is injected into any *observer class*. They're the thing
which's to be subscribed by the listeners respectively.

Subject concrete class is a class of various methods like attach,
detach, setter/getter function for the state ( data passed to the
observers through the subject ).

When the state changes, the observers ( listeners ) will react to the
last state, thus all the observers are triggered at the same time trying
to get to the recent data and interact with it through the methods
inside the observers.

Enjoy.



### Email: FS.C0d3rZ@gmail.comm ###
