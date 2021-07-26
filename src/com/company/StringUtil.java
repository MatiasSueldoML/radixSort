package com.company;
import java.util.ArrayList;

public class StringUtil
{

    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> "xxxxx"
    public static String replicate(char c,int n) {
        String replicateString = "";
        for (int i=0; i< n;i++){
            replicateString = replicateString+c;
        }
        return replicateString;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        int numPreced = n-s.length();
        String result="";
        result = replicate(c,numPreced);
        result=result+s;
        return result;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {

        ArrayList<String> stringList= new ArrayList<>();
        for (int c:arr) {
            stringList.add(Integer.toString(c));
        }
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        return stringArray;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        ArrayList<Integer> intList= new ArrayList<>();
        for (String c:arr) {
            intList.add(Integer.parseInt(c));
        }
        int[] stringArray = intList.stream().mapToInt(i->i).toArray();
        return stringArray;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxSize=0;
        for (String t:arr) {
            if(t.length()>maxSize){
                maxSize=t.length();
            }
        }
        return maxSize;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int maxLong = maxLength(arr);
        for (int i=0; i<arr.length;i++){
            arr[i]=lpad(arr[i],maxLong,c);
        }
        String arr2[]=arr;
    }

}
