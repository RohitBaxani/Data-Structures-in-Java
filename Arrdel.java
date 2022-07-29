class Arrdel{

public static void main(String args[]){

int i,pos,n;
int arr[]={1,2,3,3,4};
n=5;
System.out.println("BEFORE DELETION");
for (i=0;i<n;i++){

System.out.println(arr[i]);

}

int newarr[]=new int[n-1];
pos=2;


for(i=pos;i<n-1;i++){
arr[i]=arr[i+1];
}
n--;

System.out.println("AFTER DELETION");
for(i=0;i<n;i++){
newarr[i]=arr[i];    
System.out.println(newarr[i]);
}
}
}