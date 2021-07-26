package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static int[] radixSort(int []arr)
    {
        // PROGRAMAR AQUI
        StringUtil myObject = new StringUtil();
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();


        String[] sArr = myObject.toStringArray(arr);
        myObject.lNormalize(sArr, '0');

        ArrayList<String> result = new ArrayList<>();;
        Collections.addAll(result,sArr);
        int cont = myObject.maxLength(sArr);
        while (cont>0){

            for (String s:result) {

                switch(s.charAt(cont-1))
                {
                    case '0' :
                        L0.add(s);
                        break;

                    case '1' :
                        L1.add(s);
                        break;

                    case '2' :
                        L2.add(s);
                        break;

                    case '3' :
                        L3.add(s);
                        break;

                    case '4' :
                        L4.add(s);
                        break;

                    case '5' :
                        L5.add(s);
                        break;

                    case '6' :
                        L6.add(s);
                        break;

                    case '7' :
                        L7.add(s);
                        break;

                    case '8' :
                        L8.add(s);
                        break;

                    case '9' :
                        L9.add(s);
                        break;

                    default :
                        break;
                }
            }
            result.clear();
            result = new ArrayList<>(Stream.of(L0,L1,L2,L3,L4,L5,L6,L7,L8,L9).flatMap(Collection::stream).collect(Collectors.toList()));
            L0.clear();
            L1.clear();
            L2.clear();
            L3.clear();
            L4.clear();
            L5.clear();
            L6.clear();
            L7.clear();
            L8.clear();
            L9.clear();
            cont--;


        }
        sArr= result.toArray(new String[0]);
        arr = myObject.toIntArray(sArr);

        return arr;

    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        arr = radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
