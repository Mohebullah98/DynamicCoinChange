# DynamicCoinChange
Find all the ways you can give change with the given coins for the value n.

Given coins [1,5,10] and a value n=12. 
Find all the ways you can make change for 12.

There are 4 ways.
[1,1,1,1,1,1,1,1,1,1,1,1] 
[5,1,1,1,1,1,1,1] 
[5,5,1,1] 
[10,1,1] 

What we need to do is keep track of all the ways we can make change for all the values upto n.

ways[0]=1 by default (only 1 way to make 0)

We iterate through the whole ways array where index = value, each time when coins[i]<j, we want to add all the ways we have for coins[i]-j and all the previous ways for ways[j]. This will equal the new value of ways[j].

Why do we do this? Through each iteration we're calculating how many different ways we can create that value with that coin, this is done when we add ways[coins[i]-j], we're checking to see how many different ways we can make the difference of the coin and the value.
When we add ways[j] at the end, we're just adding the new amount of ways + the previous amount of ways we could make that value.
