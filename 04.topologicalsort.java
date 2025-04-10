import java.util.Scanner;
public class Topsort {
static int cost[][]=new int [10][10];
static int indegree[]=new int [10];
static int n;
static void calculate(){
      for (int i = 0; i < n; i++){ 
            indegree[i] = 0;
         for (int j = 0; j < n; j++){
               indegree[i]+=cost[j][i];
 }   
}
}
static void sourceremoval(){
    int removed[]=new int [10];
    System.out.println("topological sort");
    for(int i=0;i<n;i++){
    calculate();
    int j;
    for(j=0;j<n;j++){
    if(removed[j]==0&&indegree[j]==0)
        break;
    if(j==n){
       System.out.println("no solution");
       return;
                
    }
    }
    System.out.println(j+" ");
    removed[j]=1;
    for(int k=0;k<n;k++){
        cost[j][k]=0;
    }
 
    
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();
        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                cost[i][j] = sc.nextInt();
        sourceremoval();
    }
    
            }
