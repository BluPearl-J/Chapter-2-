#Executed with 5 and 10 as input→ The loop finishes without breaking, so else clause running.

#Executed in 2nd case with -1  → The loop breaks fast, so  else clause is not running.
for i in range(2):
 value = int(input('Enter an integer (-1 to break): '))
 print('You entered:', value)
 
 if value == -1:
  break
 else: 
  print('The loop terminated without executing the break')


#3.22 (Optional else Clause of a Loop) The while and for statements each have an optional else clause. In a while statement, the else clause executes when the condition becomes False. In a for statement, the else clause executes when there are no more items
#to process. If you break out of a while or for that has an else, the else part does not
#execute. 
#Task Execute the following code to see that the else clause executes only if the break
#statement does not:
#for i in range(2):
# value = int(input('Enter an integer (-1 to break): '))
# print('You entered:', value)
 
# if value == -1:
# break
#else:
# print('The loop terminated without executing the break')
#For more information on loop else clauses, see 
#https://docs.python.org/3/tutorial/controlflow.html#break-andcontinue-statements-and-else-clauses-on-loops
