//Generating all possible Subsequences 

import java.io.*;
import java.util.*;

class Subsequences{
	

static void printSubsequences(int arr[],int index,ArrayList<Integer> path){
	if(index==arr.length){

     // if(path.size()>0)
      System.out.println(path);
    }
  else{
          path.add(arr[index]);

  printSubsequences(arr,index+1,path);
      path.remove(path.size()-1);

  printSubsequences(arr,index+1,path);

  }
  
  
  
   
}

// Driver code
public static void main(String[] args)
{
	int[] arr = { 1, 2, 3 };
	
	// Auxiliary space to store each path
	ArrayList<Integer> path = new ArrayList<>();
	
	printSubsequences(arr, 0, path);
}
}
