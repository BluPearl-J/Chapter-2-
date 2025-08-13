
#3.28 (Intro to Data Science: Mean, Median and Mode) Calculate the mean, median and
#mode of the values 9, 11, 22, 34, 17, 22, 34, 22 and 40. Suppose the values included another 34. What9, problem might occ



import statistics
values = [9, 11, 22, 34, 17, 22, 34,22,40]
print("The mean is:",+ statistics.mean(values))
print("The median is",+ statistics.median(values))
print("The mode is",+ statistics.mode(values))

my_array=[ 9, 11, 22, 34, 17, 22, 34, 22, 40]
#suppose values include another 34,34 and 22 will appear equal number of times.a tie for the mode
