package ThunderDevelopment;

import java.io.*;
import java.util.*;
public class SuperIO
{
static Scanner in = new Scanner(System.in);

public static void print(String st)
{
System.out.print(st);
}

public static void println(String st)
{
System.out.println(st);
}

public static int inputNum(String st)
{
println(st);
return in.nextInt();
}

public static int inputNum()
{
return in.nextInt();
}

public static String inputString(String st)
{
println(st);
return in.nextLine();
}

public static String inputString()
{
return in.nextLine();
}

public static double inputDecimal(String st)
{
println(st);
return in.nextDouble();
}

public static double inputDecimal()
{
return in.nextDouble();
}

public static boolean inputChoice(String st)
{
println(st);
return in.nextBoolean();
}

public static boolean inputChoice()
{
return in.nextBoolean();
}

public static char inputChar(String st)
{
println(st);
return in.next().charAt(0);
}

public static char inputChar()
{
return in.next().charAt(0);
}

public static int[] inputNumArray()
{
    println("Enter the number of array elements : ");
    int n = inputNum();
    println("Enter the array elements : ");
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = in.nextInt();
    }
    return arr;
}

public static void printArrayElements(int arr[],String st)
{
    for(int i=0;i<arr.length;i++)
    {
        print(arr[i]+st+" ");
    }
}

public static void printArrayElements(String arr[],String st)
{
    for(int i=0;i<arr.length;i++)
    {
        print(arr[i]+st+" ");
    }
}

public static void printArrayElements(char arr[],String st)
{
    for(int i=0;i<arr.length;i++)
    {
        print(arr[i]+st+" ");
    }
}

public static void printArrayElements(double arr[],String st)

{
    for(int i=0;i<arr.length;i++)
    {
        print(arr[i]+st+" ");
    }
}
}
