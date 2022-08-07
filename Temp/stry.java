package Temp;

public class stry 
{
    public static void main(String args[])
    {
        final String[] AlphaNumeric = new String[37];
        String input = "A computer science portal for geeks";
        final String[] AlphaNumeric1 = new String[37];
        AlphaNumeric[0] = "A";
        AlphaNumeric[1] = "B";
    AlphaNumeric[2] = "C";
    AlphaNumeric[3] = "D";
    AlphaNumeric[4] = "E";
    AlphaNumeric[5] = "F";
    AlphaNumeric[6] = "G";
    AlphaNumeric[7] = "H";
    AlphaNumeric[8] = "I";
    AlphaNumeric[9] = "J";
    AlphaNumeric[10] = "K";
    AlphaNumeric[11] = "L";
    AlphaNumeric[12] = "M";
    AlphaNumeric[13] = "N";
    AlphaNumeric[14] = "O";
    AlphaNumeric[15] = "P";
    AlphaNumeric[16] = "Q";
    AlphaNumeric[17] = "R";
    AlphaNumeric[18] = "S";
    AlphaNumeric[19] = "T";
    AlphaNumeric[20] = "U";
    AlphaNumeric[21] = "V";
    AlphaNumeric[22] = "W";
    AlphaNumeric[23] = "X";
    AlphaNumeric[24] = "Y";
    AlphaNumeric[25] = "Z";
    AlphaNumeric[26] = "0";
    AlphaNumeric[27] = "1";
    AlphaNumeric[28] = "2";
    AlphaNumeric[29] = "3";
    AlphaNumeric[30] = "4";
    AlphaNumeric[31] = "5";
    AlphaNumeric[32] = "6";
    AlphaNumeric[33] = "7";
    AlphaNumeric[34] = "8";
    AlphaNumeric[35] = "9";
    AlphaNumeric[36] = " ";
    AlphaNumeric1[0] = ".-";
    AlphaNumeric1[1] = "-...";
    AlphaNumeric1[2] = "-.-.";
    AlphaNumeric1[3] = "-..";
    AlphaNumeric1[4] = ".";
    AlphaNumeric1[5] = "..-.";
    AlphaNumeric1[6] = "--.";
    AlphaNumeric1[7] = "....";
    AlphaNumeric1[8] = "..";
    AlphaNumeric1[9] = ".---";
    AlphaNumeric1[10] = "-.-";
    AlphaNumeric1[11] = ".-..";
    AlphaNumeric1[12] = "--";
    AlphaNumeric1[13] = "-.";
    AlphaNumeric1[14] = "---";
    AlphaNumeric1[15] = ".--.";
    AlphaNumeric1[16] = "--.-";
    AlphaNumeric1[17] = ".-.";
    AlphaNumeric1[18] = "...";
    AlphaNumeric1[19] = "-";
    AlphaNumeric1[20] = "..-";
    AlphaNumeric1[21] = "...-";
    AlphaNumeric1[22] = ".--";
    AlphaNumeric1[23] = "-..-";
    AlphaNumeric1[24] = "-.--";
    AlphaNumeric1[25] = "--..";
    AlphaNumeric1[26] = "-----";
    AlphaNumeric1[27] = ".----";
    AlphaNumeric1[28] = "..---";
    AlphaNumeric1[29] = "...--";
    AlphaNumeric1[30] = "....-";
    AlphaNumeric1[31] = ".....";
    AlphaNumeric1[32] = "-....";
    AlphaNumeric1[33] = "--...";
    AlphaNumeric1[34] = "---..";
    AlphaNumeric1[35] = "----.";
    AlphaNumeric1[36] = "/";
    String output_encode = "";
    int len = input.length();
    int c = 0;
        for(int i = 0;i<input.length();i++)
        {
            System.out.println(len);
            String ch = input.substring(i,i+1);
            for(int j = 0;j<37;j++)
            {
                if(ch.equalsIgnoreCase(AlphaNumeric[j]))
                {
                    c++;
                    output_encode = output_encode+AlphaNumeric1[j];
                }
            }
        }
        System.out.println(c);
        System.out.println(output_encode);
    }
}