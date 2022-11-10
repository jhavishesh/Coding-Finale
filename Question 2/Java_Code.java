// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            String S = read.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(S);

            Solve s = new Solve();
            s.Count_V_W(sb, n, k);
        }
    }
}
// } Driver Code Ends


class Solve {

    void Count_V_W(StringBuilder s, int n, int k) {
        
        // Code Start from Here
    }
}
