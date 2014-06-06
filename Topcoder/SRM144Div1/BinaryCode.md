#Problem Statement 

In most states, gamblers can choose from a wide variety of different lottery games. The rules of a lottery are
defined by two integers (choices and blanks) and two boolean variables (sorted and unique). choices represents the highest valid number that you may use on your lottery ticket. (All integers between 1 and choices, inclusive, are valid and can 
appear on your ticket.) blanks represents the number of spots on your ticket where numbers can be written.

The sorted and unique variables indicate restrictions on the tickets you can create. If sorted is set to true, then the numbers on your ticket must be written in non-descending order. If sorted is set to false, then the numbers may be written in any order. Likewise, if unique is set to true, then each number you write on your ticket must be distinct. If unique is set to false, then repeats are allowed.

Here are some example lottery tickets, where choices = 15 and blanks = 4:

{3, 7, 12, 14} -- this ticket is unconditionally valid.

{13, 4, 1, 9} -- because the numbers are not in nondescending order, this ticket is valid only if sorted = false.

{8, 8, 8, 15} -- because there are repeated numbers, this ticket is valid only if unique = false. 

{11, 6, 2, 6} -- this ticket is valid only if sorted = false and unique = false.

Given a list of lotteries and their corresponding rules, return a list of lottery names sorted by how easy they are to win. The probability that you will win a lottery is equal to (1 / (number of valid lottery tickets for that game)). The easiest lottery to win should appear at the front of the list. Ties should be broken alphabetically (see example 1).
 
###Definition 
    Class: Lottery 
    Method: sortByOdds 
    Parameters: String[] 
    Returns: String[] 
    Method signature: String[] sortByOdds(String[] rules) 
    (be sure your method is public) 
 
###Limits 
    Time limit (s): 2.000 
    Memory limit (MB): 64 
 
###Constraints 
 - rules will contain between 0 and 50 elements, inclusive. 
 - Each element of rules will contain between 11 and 50 characters, inclusive. 
 - Each element of rules will be in the format "<NAME>:_<CHOICES>_<BLANKS>_<SORTED>_<UNIQUE>" (quotes for clarity). The underscore character represents exactly one space. The string will have no leading or trailing spaces. 
 - <NAME> will contain between 1 and 40 characters, inclusive, and will consist of only uppercase letters ('A'-'Z') and spaces (' '), with no leading or trailing spaces. 
 - <CHOICES> will be an integer between 10 and 100, inclusive, with no leading zeroes. 
 - <BLANKS> will be an integer between 1 and 8, inclusive, with no leading zeroes. 
 - <SORTED> will be either 'T' (true) or 'F' (false). 
 - <UNIQUE> will be either 'T' (true) or 'F' (false). 
 - No two elements in rules will have the same name. 
