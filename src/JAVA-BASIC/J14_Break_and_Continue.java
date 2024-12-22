public class J14_Break_and_Continue
        {
            public static void main(String[] args)
            {
                // Break
                int i = 0;
                while (i>=0)
                {
                    System.out.println(i);
                    i++;
                    if (i>5)
                    {
                        break;
                    }
                }
                // Continue;
                //Print odd num
                int j ;
                System.out.println("Odd number is :");
                for(j=1;j<100;j++)
                {
                    if(j%2==0)
                    {
                    continue;
                    }
                    System.out.println(j);

                }
            }
        }