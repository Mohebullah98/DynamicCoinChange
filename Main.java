class Main {
  public static int coinChange(int arr[],int n){
    //keep track of all the ways you can get the values all the way upto n.
    int ways[]= new int[n+1];
    ways[0]=1;//only 1 way to make 0
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<n+1;j++){
        if(arr[i]<=j){
          //if coin is <= to index of way, check to see how many ways you can get the current way-current coin. Add that to the current amount of ways you could get the current value.
          ways[j]=ways[j-arr[i]]+ways[j];
        }
      }
    }
    //ways n should equal to all the ways you can get the nth value.
    return ways[n];
  }
  public static void main(String[] args) {
    int coins[] ={1,5,10};
    int n=12;

    System.out.print(coinChange(coins,n));
  }
}
