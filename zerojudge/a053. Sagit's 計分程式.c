#include <stdio.h>
#include <stdlib.h>

int main(){
    int q, ans = 0;
    scanf("%d", &q);
    
    if(0 <= q && q <= 10){
        ans = q * 6;
    }else if(11 <= q && q <= 20){
        ans = 10 * 6 + (q - 10) * 2;
    }else if(21 <= q && q <= 40){
        ans = 10 * 6 + 10 * 2 + (q - 20) * 1;
    }else if(q > 40){
        ans = 100;
    }
    
    printf("%d", ans);
    return 0;
}