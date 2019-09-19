package stackroute;

public class Q5 {
int[] marks;
public double average;
int max;
int min;
public Q5(int[] m) {
	marks = m;
	int sum=0;
	min = Integer.MAX_VALUE;
	max = Integer.MIN_VALUE;
	for(int i = 0;i<marks.length;i++) {
		sum+=marks[i];
		if(marks[i]<min) min = marks[i];
		if(marks[i]>max) max = marks[i];
	}
	average = sum/marks.length;
	
}
}
