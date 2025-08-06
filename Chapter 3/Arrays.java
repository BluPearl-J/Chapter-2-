public class ArraysSorting {
public static void main(String[] args) {
int[] scores = new int[6];
scores[0] = 40;
scores[1] = 35;
scores[2] = 49;
scores[3] = 57;
scores[4] = 61;
scores[5] = 44;

for (int i = 0; i < scores.length; i++) {
System.out.println("Score[" + i + "] = " + scores[i]);
}

int max = scores[0];
for (int i = 1; i < scores.length; i++) {
if (scores[i] > max) {
max = scores[i];
}
}

int minimum=scores[0];
for (int i=1; i<scores.length; i++) {
if(scores[i]< minimum){
minimum = scores[i];
}
}

System.out.println("Maximum score is: " + max);
System.out.println("Minimum score is: " + minimum);

}
}
