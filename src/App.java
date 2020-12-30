public class App {
    public static void main(String[] args) throws Exception {
        int N,numTaps,sumTaps,count =0; 


                System.out.println("Enter number of apartment: ");
                N = System.in.read();
// כול אחד מן התנאים מותאם לבודק לכמות מספרים שונה
                if (N > 0 && N < 10) // חד ספרתי
                {
                    numTaps = ((N % 10) - 1) * 10;
                    count++;
                    sumTaps = numTaps + count;
                    System.out.println("The amount of all taps is: " + sumTaps);
                 
                }
                else if (N > 9 && N < 100) // דו ספרתי
                {
                    numTaps = ((N % 10) - 1) * 10;
                    count += 3;
                    sumTaps = numTaps + count;
                    System.out.println("The amount of all taps is: " + sumTaps);
                  
                }
                else if (N > 99 && N < 1000) // תלת ספרתי
                {
                    numTaps = ((N % 10) - 1) * 10;
                    count += 6;
                    sumTaps = numTaps + count;
                    System.out.println("The amount of all taps is: " + sumTaps);
               
                }
                else if (N > 999 && N < 10000) // ארבע ספרתי
                {
                    numTaps = ((N % 10) - 1) * 10;
                    count += 10;
                    sumTaps = numTaps + count;
                    System.out.println("The amount of all taps is: " + sumTaps);
                    
                }
            

        }
    }

