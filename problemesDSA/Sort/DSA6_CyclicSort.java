package Sort;

public class DSA6_CyclicSort {
    static void CyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int currectIndex=arr[i]-1;
            if(arr[i]!=arr[currectIndex]){
                int temp=arr[i];
                arr[i]=arr[currectIndex];
                arr[currectIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        /*
        ! when given numbers from range 1 to N use CYCLIC SORT
        
        */
        int arr1[]={88
            ,55
            ,10
            ,62
            ,25
            ,49
            ,20
            ,98
            ,23
            ,83
            ,39
            ,60
            ,48
            ,80
            ,46
            ,61
            ,64
            ,54
            ,76
            ,52
            ,17
            ,31
            ,87
            ,12
            ,84
            ,29
            ,89
            ,77
            ,41
            ,100
            , 9
            ,42
            ,72
            ,24
            , 8
            ,59
            ,90
            , 6
            ,95
            ,65
            ,18
            ,73
            ,32
            ,67
            ,94
            ,14
            ,44
            , 1
            ,66
            ,30
            ,75
            ,27
            ,93
            ,26
            ,34
            ,28
            ,70
            ,81
            ,85
            ,50
            ,92
            ,86
            ,47
            , 3
            ,79
            ,43
            ,40
            ,15
            ,38
            ,71
            ,63
            ,74
            ,19
            ,53
            , 4
            ,35
            ,45
            ,96
            , 2
            ,78
            ,69
            ,68
            ,16
            ,21
            ,91
            ,36
            ,97
            ,37
            ,58
            , 5
            ,33
            ,99
            ,22
            ,51
            ,13
            ,82
            ,11
            , 7
            ,57
            ,56};
        System.out.println(arr1.length);

        CyclicSort(arr1);
        for(int j:arr1){
            System.out.print(j+" ");
        }


    }
}
