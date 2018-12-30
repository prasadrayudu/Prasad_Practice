package code_30days;
//import java.util.*;
//public class programs
//{
//public static void main(String[] args) {
////{
////int[] array = {6,9,8};
//List<Integer> list = new ArrayList<>();
//list.add(array[0]);
//list.add(array[2]);
//list.set(1, array[1]);
//list.remove(0);
//System.out.println(list);
//}
//}

//
//String Names = new String("Alice,Bob,Smith");
//Names = Names.replaceAll(",", ":");
//
//System.out.println(Names);
//
//}
//
//}
//	int luck = 10;
//	if((luck>10 ? luck++: --luck)<10)
//	{
//	System.out.print("MAC");
//	}
//	if(luck<10)
//	System.out.print("PC");
//	}
//	}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


	public class programs {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	         String S = br.readLine();
	         int Q = Integer.parseInt(br.readLine().trim());
	         String[] arr = new String[Q];
	         for(int i_arr=0; i_arr<Q; i_arr++)
	         {
	         	arr[i_arr] = br.readLine();
	         }

	         int[] out_ = helpPrivateRyan(S, arr);
	         System.out.print(out_[0]);
	         for(int i_out_=1; i_out_<out_.length; i_out_++)
	         {
	         	System.out.print(" " + out_[i_out_]);
	         }

	         wr.close();
	         br.close();
	    }
	    static int[] helpPrivateRyan(String S, String[] arr){
	        String Str=S;
	        String[] arr1= arr;
         
	    }
	}