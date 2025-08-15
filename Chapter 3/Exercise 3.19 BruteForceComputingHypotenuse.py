
for side1 in range(1, 20):
 for side2 in range(side1, 20):
  for side3 in range(side2, 20):
            
   # Check inequality triangle
    if side1 + side2 > side3 and side1 + side3 > side2 and side2 + side3 > side1:
                
     print(side1, side2, side3)
     maximum = max(side1, side2, side3)
     print("Hypotenuse is:", maximum)
