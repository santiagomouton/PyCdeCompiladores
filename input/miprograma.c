
int suma(int, int);

int main() {
    int x = 10;
    int y;

    suma(x, 5);

    if (x == 11)
    {
        int z = 4;
        z =+ x; 
    }
    else
        x = 0;
    
    

    return 0;
}

suma(int x, int y) {
    return y + x;
}