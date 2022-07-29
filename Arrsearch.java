class Arrsearch{

public static void main(String args[]){

int i,item,n;
boolean flag=true;
int arr[]={1,2,3,4,5};
n=5;
item=15;

for(i=0;i<n;i++){

if(arr[i]==item){
System.out.println(i);
flag=false;
break;
}
//else{
//System.out.println("ELEMENT NOT FOUND");
//flag=false;
//}

}
if(flag==true){
System.out.println("ELEMENT NOT FOUND");
}

}

}