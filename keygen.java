   import java.io.*;

    public class keygen {

    int offset=10;
    public String encrypt(String s) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           if(t>='a' && t<='z')
            {
                int t1=t-'a'+offset;
                t1=t1%26;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }


    public String decrypt(String s) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }


public static void main(String[] args) {
    try
    {
        System.out.println("keygen technique");
        BufferedReader b;
        String oriTxt,encTxt,decTxt;
        System.out.println("Enter string to encrypt:");
        b=new BufferedReader(new InputStreamReader(System.in));
        oriTxt=b.readLine();
        keygen c=new keygen();
        encTxt=c.encrypt(oriTxt);
        System.out.println("Encrypted text :"+encTxt);
        decTxt=c.decrypt(encTxt);
        //System.out.println("Derypted text :"+decTxt);
    }
    catch(Exception e)
    {
        System.out.println(e.toString());
    }
}
}
