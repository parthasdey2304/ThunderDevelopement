package ThunderDevelopment;

public class stringPlay
{
    public static String upper(String st)
    {
        return st.toUpperCase();
    }

    public static String lower(String st)
    {
        return st.toLowerCase();
    }

    public static String capitalize(String st)
    {
        return Character.toUpperCase(st.charAt(0))+st.substring(1);
    }

    public static String reverse(String st)
    {
        String rev="";
        for(int i=0;i<st.length();i++)
        {
            rev = st.charAt(i)+rev;
        }
        return rev;
    }

    public static int noOfVowels(String st)
    {
        int c = 0;
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
            c++;
        }
        return c;
    }


    public static int noOfConsonants(String st)
    {
        int c = 0;
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'||ch!='A'||ch!='E'||ch!='O'||ch!='I'||ch!='U')
            c++;
        }
        return c;
    }

    public static int noOfWhiteSpace(String st)
    {
        int c = 0;
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch==' ')
            c++;
        }
        return c;
    }

    public static int noOfUpperChar(String st)
    {
        int c = 0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(Character.isUpperCase(ch))
            c++;
        }
        return c;
    }

    public static int noOfLowerChar(String st)
    {
        int c = 0;
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(Character.isLowerCase(ch))
            c++;
        }
        return c;
    }


}
