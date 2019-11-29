
public class HelloWorld
{
  
  public static void fibonachi(int n){
    int fn = 0;
    int fn1= 0;
    int fn2= 1;
    
    for(int a= 0;a<n;a++){
    	fn = fn1+fn2;
      	fn1 = fn2;
      	fn2 = fn;
      	System.out.print(fn+" ");
    }
  
  }
  
  public static void prima(int n){
    for(int a=1; a<=n; a++){
    	int count = 0 ;
        for(int i = 1; i<=a ; i++){
          if(a%i == 0){
          	count++;
          }  
        }
      	if(count == 2){
           	System.out.print(" "+a); 
        }
    }  
  }
  
  public static void segitiga_lancip(int n){
    for(int a=0;a<n;a++){
      for(int b=0;b<a;b++){
      	System.out.print("*");
      } 
      System.out.println("");
    }
  }
  
  public static void segitiga_sama_kaki(int n){
    for(int a=0 ; a<=n; a++){
      for(int b=a;b<=n;b++){
      	System.out.print("-");
      }
      for(int b=0;b<=a;b++){
      	//System.out.print("*");
        System.out.print(faktorial(a)/(faktorial(b)*faktorial(a-b))+" ");
      }
      System.out.println("");
    }
  }
  public static void segitiga_paskal2(int n){
    int temp =0;
    for(int a=0 ; a<=n; a++){
      for(int b=a;b<=n;b++){
      	System.out.print("*");
      }
      for(int b=0;b<=a;b++){
        if(b==0 || a==b){
        	temp = 1;
        }else{
         	temp = temp*(a+1-b)/b; 
        }
        
      	System.out.print(" "+temp);
        
      }
      System.out.println("");
    }
  }
  
    public static void segitiga_sama_kaki_kebalik(int n){
    for(int a=1 ; a<=n; a++){
      for(int b=1;b<=a;b++){
      	System.out.print("-");
      }
      for(int b=n;b>=2*a-n;b--){
      	System.out.print("*");
      }
      System.out.println("");
    }
  }
  
  public static int faktorial2(int n){
  	if(n==1)
      return 1;
    return n*faktorial2(n-1);
  }
  
  public static long faktorial(int n){
    long z =1;
    int i = 1;
    while(i <= n){
      z=z*i;
      i++;
    }
    return z;
  }
  
  public static void segitiga_paskal(int a){
  	int i, j;
    for (i=0; i<a; i++){
      for (j=0; j<a-i-1; j++){
        System.out.print("-");
      }
      for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
  }
  
  public static void bubble_short(int []arr,int n){
    int temp ;
    for(int a=0;a<n;a++){
      for(int b=0;b<n-1-a;b++){
        if(arr[b]>arr[b+1]){
	     temp = arr[b];
          arr[b]=arr[b+1];
          arr[b+1] = temp;
        }

      }
    }
    
    for(int a=0;a<n;a++){
    	System.out.print(" "+arr[a]);
    }
  }
  
  public static int perkalian(int a,int b){
    int tamp = 0;
    for(int i = 0; i<b; i++){
    	tamp+=a;
    }
    return tamp;
  }
  
  public static void main(String[] args)
  {
    segitiga_paskal2(9);
    System.out.println("Faktorial : "+faktorial(3));
    System.out.println("Perkalian : ");
    int result = perkalian(13,8);
    System.out.println("result : "+result);
    
    System.out.println("Sorting : ");
    int []arr = {1,4,5,2,3};
    bubble_short(arr,5);
    
    System.out.println("\nBilangan Fibonachi : ");
    fibonachi(10);
    
    System.out.println("\nBilangan Prima : ");
    prima(11);
    
    System.out.println("\nSegitiga sama kaki : ");
    segitiga_sama_kaki(9);
    
    System.out.println("\nSegitiga sama kaki Kebalik: ");
    segitiga_sama_kaki_kebalik(5);
    
  }
}




