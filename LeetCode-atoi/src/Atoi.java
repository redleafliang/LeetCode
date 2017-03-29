/**
 * Created by hongyeliang on 2017/3/29.
 */
public class Atoi {

public static int myAtoi(String str) {

        int count = str.length();
        int i = 0 ;
        int number = 0 ;
        char ch ;
        int flag = 0;
        int antiFlag =0;
        int middle = 0;
        while ( i < count )
        {
            ch = str.charAt(i);
            if ( ch <= '9' && ch >= '0') {
                System.out.println(number);
                if (( number > 214748364 && ch >= '6' ) || ( number >= 1000000000 )) {
                    number = -1;
                    break;
                }
                else
                    number = number * 10 + ch - '0';

                middle = 1;
            }
            else if ( ch == '-') {
                if ( flag == 1)
                    break;
                flag = 1;
                middle = 1;
            }
            else if ( ch == '+') {
                if ( antiFlag == 1)
                    break;
                antiFlag = 1;
                middle = 1;
            }
            else if ( ch == ' ')
                {
                    if ( middle == 1 )
                        break;
                }
            else
                break;
            i++;
        }

        //System.out.println(number);
        if ( flag == 1)
            if (antiFlag == 1)
                return  0;
            else
                if ( number < 0  )
                    return -2147483648;
                else
                    return  -number;
        else
            if ( number < 0 )
                return 2147483647;
            else
                return number;
//
//    Input:
//    "-2147483649"
//    Output:
//    2147483647
//    Expected:
//    -2147483648


//    Input:
//    "2147483648"
//    Output:
//    -2147483648
//    Expected:
//    2147483647

    }



    public static void  main( String s[])
{
    String myString1 = "         +10523538441s"  ;
    int num1 = myAtoi( myString1 );
    System.out.println(num1);


}


}
