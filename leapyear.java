import java.io.*;
import java.lang.*;
class leapyear
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int year;
System.out.println("Enter year:");
year=Integer.parseInt(br.readLine());
if(year>0&&year%4==0) 
{
System.out.println(year+" is leapyear");
} 
else if(year<0)
System.out.println("Invalid data");
else
System.out.println(year+" is not leapyear");
}
}
