package Cheapflights.Cheapflights.File;
import java.util.Random;
public class Encryption
{
    public static String encrypt(String Password, int code)
    {
        String encrypted = "";
        for(int i = 0; i < Password.length(); i++)
        {
            encrypted += (char)(Password.charAt(i) + code);
        }
        return encrypted;
    }
    public static String constantEncrypt(String Password)
    {
        String constantEncryption = "";
        for(int i = 0; i < Password.length(); i++)
        {
            constantEncryption += (char)(Password.charAt(i) + 'a');
        }
        //System.out.println(constantEncryption);
        return constantEncryption;
    }
    public static String constantDecrypt(String Password)
    {
        String constantDecryption = "";
        for(int i = 0; i < Password.length(); i++)
        {
            constantDecryption += (char)(Password.charAt(i) - 'a');
        }
        //System.out.println(constantDecryption);
        return constantDecryption;

    }

    public static String decrypt(String Password, int code)
    {
        String decrypted = "";
        for(int i = 0; i < Password.length(); i++)
        {
            decrypted += (char)(Password.charAt(i) - code);
        }
        return decrypted;
    }
    public static int generateCode()
    {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(100);
    }


    //Read decrypt
    //Write, encrypt
}
