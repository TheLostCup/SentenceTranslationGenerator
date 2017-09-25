import java.util.*;
public class SentenceTranslationPractice{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        ArrayList englishList = new ArrayList();
        ArrayList otherList = new ArrayList();
        int num = englishList.size();
        ArrayList worksheet = new ArrayList();
        int j = 0;
        int x = 0;
        System.out.print("Input English. Input each line as one element. Press enter after each element. Input ## to end list.\n");
        String word = scan.nextLine();
        while(!word.equals("#")){
            englishList.add(word);
            word=scan.nextLine();
        }
        System.out.print("Input Other Language. Input each line as one element. Press enter after each element. Input ## to end list.\n");
        word = scan.nextLine();
        while(!word.equals("#")){
            otherList.add(word);
            word=scan.nextLine();
        }
        System.out.print("\f");
        while(worksheet.size()< englishList.size() && worksheet.size()< otherList.size()){
            if (english() == true && j<englishList.size()){
                worksheet.add(englishList.get(j));
                j++;
                x++;
            }
            else if(x<otherList.size()){
                worksheet.add(otherList.get(x));
                j++;
                x++;
            }
        }
        
        printArray(worksheet);
        //printArray1(englishList);
        //printArray(chineseList);
    }

    public static boolean english(){
        double num = 0;
        num = (int)(Math.random()*100);
        if (num >= 50)
            return true;
        return false;
    }

    public static void printArray(ArrayList a){
        int k=1;
        for(int i = 0; i < a.size(); i++){
                System.out.print(k + ".  " + a.get(i)+"\n" + "\n" +"___________________________________________"
                    + "__________________________________________"+"\n\n");
                k++;
        }
    }

    public static void printArray1(ArrayList a){
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + ", ");
        }
    }

}