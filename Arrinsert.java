class Arrinsert{

public static void main(String args[]){

int i,x,pos,n;
int arr[]={1,2,3,4,5};

n=5;
System.out.println("BEFORE INSERTION");
for(i=0;i<n;i++){

System.out.println(arr[i]);

}

int newarr[]= new int[n+1];

for(i=0;i<n;i++){
newarr[i]=arr[i];
}

x=7;
pos=3;
n++;

for(i=n-1;i>=pos;i--){

newarr[i]=newarr[i-1];
}
newarr[pos-1]=x;
System.out.println("AFTER INSERTION");
for(i=0;i<n;i++){
System.out.println(newarr[i]);
}

}

}