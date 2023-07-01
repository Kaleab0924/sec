// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


       int [] a={4,3,5,2,7};

int max=a[0];
int sec=a[0];

    for(int i=0;i<a.length;i++){
        if(max<a[i]){
            sec=max;
            max=a[i];
        }
        else if (sec<a[i]){
            sec=a[i];
        }


    }




        System.out.println(max);
        System.out.println(sec);

        }
    }
