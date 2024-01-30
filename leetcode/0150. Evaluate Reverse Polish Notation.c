int evalRPN(char** tokens, int tokensSize) {
    int top = -1;
    int stack[10000] = {0};

    for(int i = 0; i < tokensSize; ++i){
        if(strlen(tokens[i]) == 1 && !isdigit(tokens[i][0])){
            int b = stack[top--];
            int a = stack[top--];

            switch(tokens[i][0]){
                case '+':
                    stack[++top] = a + b;
                    break;
                case '-':
                    stack[++top] = a - b;
                    break;
                case '*':
                    stack[++top] = a * b;
                    break;
                case '/':
                    stack[++top] = a / b;
                    break;
            }
        }else{
            stack[++top] = atoi(tokens[i]);
        }
    }
    return stack[0];
}