import java.util.*;
public class Acstring {

    //Shortest Path
//    public static void main(String[] args){
//        String str = "WNEENESENNN";
////        int n = str.length();
//        System.out.println(getShortestPath(str));
//    }
//    public static float getShortestPath(String str){
//        int x =0;
//        int y =0;
//        for(int i=0;i<str.length();i++)
//        {
//            //north
//            if(str.charAt(i) == 'N')
//                y++;
//            //south
//            else if(str.charAt(i) == 'S')
//                y--;
//            //East
//            else if(str.charAt(i) == 'E')
//                x++;
//            //West
//            else if(str.charAt(i) == 'W')
//                x--;
//        }
//        int X2 = x*x;
//        int Y2 = y*y;
//        return (float)Math.sqrt(X2+Y2);
//    }

    //String comparision
//    public static void main(String[] args){
//        String s1 = "Ravi";
//        String s2 = "Ravi";
//        String s3 = new String("Ravi");
//// == checks at object level
//        if(s1==s2)
//            System.out.println("yes");
//        else
//            System.out.println("no");
//
//        if(s1==s3)
//            System.out.println("yes");
//        else
//            System.out.println("no");
//
//        // but .equals() checks value
//        if(s1.equals(s3))
//            System.out.println("yes");
//        else
//            System.out.println("no");
//    }



    //To upper Case.
//    public static void main(String[] args){
//        String str = "hi i am ravi kumar";
//        System.out.println(toUpperCase(str));
//
//    }
//    public static String toUpperCase(String str){
//        StringBuilder sb = new StringBuilder("");
//        char ch = Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i) == ' ' && i<str.length()-1){
//                sb.append(str.charAt(i)); //space
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i))); //toCapital first letter.
//            }
//            else
//            {
//                sb.append(str.charAt(i)); // left letters.
//            }
//        }
//        return sb.toString();
//    }


    //practice
//    public static void main(String[] args){
//        String str = "hi i am ravi kumar.";
//        System.out.println(toUpperCase(str));
//    }
//    public static String toUpperCase(String str){
//        StringBuilder sb = new StringBuilder("Niyati ");
//
//        char ch = Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//        for(int i=1;i<str.length();i++)
//        {
//            if(str.charAt(i) == ' ' && i<str.length()-1)
//            {
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else
//                sb.append(str.charAt(i));
//        }
//        return sb.toString();
//    }



    //String Compression
//    public static void main(String[] args){
//        String str = "aabbccddaaa";
//        System.out.println(stringCompression(str));
//    }
//    public static String stringCompression(String str){
//        StringBuilder newStr = new StringBuilder("");
//        for(int i=0;i<str.length();i++)
//        {
//            Integer count = 1;
//            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
//            {
//                count++;
//                i++;
//            }
//            newStr.append(str.charAt(i));
//            if(count > 1)
//            {
//                newStr.append(count);
//            }
//        }
//        return newStr.toString();
//    }


    //.replace method.
//    public static void main(String[] args){
//        String str = "ApnaCollege".replace("a"," ");
//        System.out.println(str);
//    }


    // counting lowercase vowels.
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int count = 0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
//                count++;
//        }
//        System.out.println(count);
//    }

    //Anagrams
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        if(str1.length() == str2.length()){
//            str1 = str1.toLowerCase();
//            str2 = str2.toLowerCase();
//
//            char[] str1CharArray = str1.toCharArray();
//            char[] str2CharArray = str2.toCharArray();
//
//            Arrays.sort(str1CharArray);
//            Arrays.sort(str2CharArray);
//
//            boolean result = Arrays.equals(str2CharArray, str1CharArray);
//            if(result)
//                System.out.println("yes");
//            else
//                System.out.println("no");
//            }
//        else
//            System.out.println("No");
//        }




}
