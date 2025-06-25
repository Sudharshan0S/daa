import java.util.Scanner; 
public class GreedyKnapsack  
{ 
static int n; 
static float m, p[],w[]; 
static void greedy() 
{ 
float max=0, u=m,profit=0; 
int k=0; 
System.out.println("item included is :"); 
for(int i=0;i<n;i++) 
{ 
max=0; 
for(int j=0;j<n;j++) 
{ 
if( (p[j]/w[j]) > max) 
{ 
k=j; 
max=p[j]/w[j]; 
}
}
if(w[k] > u ) 
{ 
System.out.println((k+1)+" item selected "); 
System.out.println("fraction selected is "+u/w[k]); 
profit=profit+p[k]*(u/w[k]); 
break;   
} 
else 
{ 
System.out.println(" item is selected "+(k+1)); 
System.out.println("fraction is 1"); 
u = u - w[k]; 
profit=profit+p[k]; 
p[k]=0;  // This item should not be selected for next iteration      
} 
}
System.out.println("Knapsack profit = "+profit);
}
public static void main(String[] args)  
{ 
Scanner s = new Scanner(System.in); 
System.out.println("Enter the no. of items"); 
n = s.nextInt(); 
p=new float[n]; 
w=new float[n]; 
System.out.println("Enter the weights of n items"); 
for(int i=0;i<n;i++) 
w[i]=s.nextFloat(); 
System.out.println("Enter the profits of n items"); 
for(int i=0;i<n;i++) 
p[i]=s.nextFloat(); 
System.out.println("Enter the capacity of Knapsack"); 
m = s.nextFloat(); 
greedy(); 
} 
} 
