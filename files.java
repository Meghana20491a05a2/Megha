import java.util.*;

class  Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
LinkedHashMap<String,Integer>Map = new LinkedHashMap<>();
LinkedHashMap<Integer,String>Map1 = new LinkedHashMap<>();
LinkedHashMap<String,String>res = new LinkedHashMap<>();
for(int i=0;i<5;i++)
{
   s[i] =sc. nextLine();
} 
 for(int i=0;i<s.length;i++)
 {
    int c = s[i].lastIndexOf(" ");
    Map.put(s[i].trim(),c+1);
 }
 System.out.println(Map);
   for(Map.Entry<String,Integer>ele:Map.entrySet())
   {
      if(Map.containsKey(ele.getValue()))
      {
        Map1.put(ele.getValue(),ele.getKey());
      }
      else
      {
        Map1.put(ele.getValue(),ele.getKey());
      }
      if(ele.getValue()==0)
      {
        res.put(ele.getKey(),"Null");
      }
      else 
      for(Map.Entry<Integer,String>ele1 : Map1.entrySet())
      {
        if(ele.getValue()-1==ele1.getKey())
        res.put(ele.getKey(),ele1.getValue());
      }

   }

         System.out.println(res);
         System.out.println("file\tparentfile");
         System.out.println("----------------");
         for(Map.Entry<String,String>element:res.entrySet())
         {
            System.out.println(element.getKey()+"\t"+element.getValue());
         }
 
    }
}