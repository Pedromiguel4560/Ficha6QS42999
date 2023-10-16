package org.example;

public class Area_Perimeter {
    public int area (int base, int altura){
        return base*altura;
    }

    public int perimeter(int base, int altura){
        return base+altura;
    }

    public boolean isTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && c+b>a){
            return true;
        }
        return false;
    }

}
