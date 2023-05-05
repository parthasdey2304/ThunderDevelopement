package ThunderDevelopment;
public class arrayLogic
{
public static boolean isNumPresent(int arr[],double a) // this method is to check whether a number is preset in an array or not
{
for(int i=1;i<arr.length;i++)
{
if(a==arr[i])
return true;
}
return false;
}

public static boolean isCharPresent(char arr[],char a) // this method is to check whether a character is present is an array or not
{
for(int i=0;i<arr.length;i++)
{
if(a==arr[i])
return true;
}
return false;
}

public static int numberPosition(int arr[],double a) // this method is to find the position of a number is an array
{
for(int i=0;i<arr.length;i++)
{
if(a==arr[i])
return i;
}
return -1;
}

public static int charPosition(char arr[],char a) // this method is to find the position of a character is an array
{
for(int i=0;i<arr.length;i++)
{
if(a==arr[i])
return i;
}
return -1;
}

public static int[] range(int a, int b) // this is to generate a range of numbers and store them in an array
{
int arr[] = new int[b];
int p=0;
for(int i=a;i<=b;i++)
{
arr[p]=i;
p++;
}
return arr;
}

public static int[] range(int a, int b,int c) // this method is to generate a range of numbers and store them in an array and the generated numbers have a particular step value
{
int arr[] = new int[b-a];
int p=0;
for(int i=a;i<=b;i++)
{
arr[p]=i;
p++;
}
return arr;
}

public static char[] toCharArray(String st) // this method is to convert a string into a character array
{
    char arr[] = new char[st.length()];
    for(int i=0;i<st.length();i++)
    {
        arr[i] = st.charAt(i);
    }
    return arr;
}

public static String[] split(String s,String sep) // this method is to split a string into an array
{
    String st[] = new String[s.length()];
    int j = 0,a = 0;
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);
        if((ch+"") == sep)
        {
            st[a] = s.substring(j,i);
            j=i+1;
        }
        a++;
    }
    return st;
}

public static int[] sort(int arr[]) // this is to sort a number array using bubble sorting technique in ascending order
{
    int l = arr.length;
    for(int i=0;i<l-1;i++)
    {
        for(int j=0;j<l-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int copy = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = copy;
            }
        }
    }
    return arr;
}
/*
public static int[] sort(int arr[],char r)
{
    if(r!='r')
    {
        SuperIO.println("INVALID PARAMETER");
        return {0};
    }

    for(int i=0;i<l-1;i++)
    {
        for(int j=0;j<l-1-i;j++)
        {
            if(arr[j]>arr[j]+1)
            {
                int copy = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = copy;
            }
        }
    }
    return arr;
}
*/
}
