import java.io.*;

class Test
{
    int a;
    Test(int x)
    {
        a=x;
    }
}

class Sample {
    public static void main(String[] args)
    {
        //Creating a new object of Test class
        Test obj = new Test(10); // Providing a value for the data member 'a'
        System.out.println(obj.a);
    }
}
