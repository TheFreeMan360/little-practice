#include <stdio.h>
#include <stdlib.h>

int main(){
    int n = 0;
    scanf("%d", &n);
    
    for(int l = 1; l <= n; ++l){
        for(int t = 1; t <= l; ++t){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}